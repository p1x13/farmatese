create database farmacia_tese -- creación de la base de datos
go

use farmacia_tese --uso de la base de datos
go
									--------------------------------
									--     creación de tablas     --
									--------------------------------
create table ciudad(  --ciudad
cod_c varchar(6), --codigo ciudad
nom_c varchar(30), --nombre ciudad
cp int, --codigo postal
constraint pk_cod_c primary key (cod_c),
check (cod_c like 'CIU[0-9][0-9][0-9]'))
go

---depende de farmacia  NAIL -----!!!!!!!!!!!!!!!!!!
create table farmaceutico(-- farmaceutico  
cod_fa varchar(6), --codigo farmaceutico
nom_fa varchar(30), -- nombre farmaceutico
app_fa varchar(30), -- apellido paterno farmaceutico
apm_fa varchar(30), -- apellido materno farmaceutico
constraint pk_cod_fa primary key (cod_fa),
check (cod_fa like 'FAR[0-9][0-9][0-9]'))
go

create table accion( --acción
cod_a varchar(6), -- codigo accion 
nom_a varchar(30),  -- accion ej. "analgesico" ----correcto
tie_a varchar(30), ---tiempo de accion ejemplo "4 horas" por peticion del ejercicio
des_a varchar(30), ---descripcion de accion
constraint pk_cod_a primary key (cod_a),
check (cod_a like 'ACC[0-9][0-9][0-9]'))
go

create table laboratorio(--laboratorio
nom_l varchar(30), --nombre laboratorio  -- como llave primaria basado en el diagrama
cal_l varchar(30), --calle
col_l varchar(30), --colonia
cp_l int, --codigo postal
est_l varchar(30), --estado (por como viene en el diagrama supongo es de la republica)
nomd_l varchar(30), --nombre dueño
apd_l varchar(30), --apellido dueño
constraint pk_cod_l primary key (nom_l),
check (cp_l like '[0-9][0-9][0-9][0-9][0-9]'))
go

create table monodroga( --monodroga
cod_m varchar(6), --codigo monodroga
lab_m varchar(30), -- laboratorio --basado en el diagrama
acc_m varchar(30), --accion
nci_m varchar(30),--nombre cientifico
nco_m varchar(30),--nombre comercial
can_m int,--cantidad
nom_ll varchar (30),--nombre laboratorio , relacion a llave primaria
constraint pk_cod_m primary key(cod_m),
constraint fk_nom_l foreign key (nom_ll) references laboratorio (nom_l) on delete set null,
check (cod_m like 'MON[0-9][0-9][0-9]'))
go

----ordena medicamento------------
create table medicamento( --medicamento
nom_m varchar(30),-- nombre del medicamento 
pre_m varchar(30), --presentacion del medicamento
costo float, --costo
cod_a1 varchar(6), -- codigo accion
cod_m1 varchar(6), -- codigo de monodroga
constraint pk_nom_m primary key (nom_m),
constraint fk_cod_a foreign key (cod_a1) references accion(cod_a)on delete set null,
constraint fk_cod_mm foreign key (cod_m1) references monodroga(cod_m) on delete set null)
go
					
create table farmacia( --farmacia
cod_f varchar(6), --cogido de farmacia
nom_f varchar(30), -- nombre de farmacia ---Primay to? unique?
cal_f varchar(30), --calle
col_f varchar(30), --colo
cp_f int, --codigo postal
gua_f int, -- dias asignados de los guardias, basado al ejercicio, respetando el ejercicio
cod_c1 varchar(6), --codigo ciudad
cod_fa1 varchar(6), --codigo farmaceutico
constraint pk_cod_f1 primary key (cod_f),
constraint fk_ciuf foreign key (cod_c1) references ciudad(cod_c) on delete set null,
constraint fk_cfar foreign key (cod_fa1) references farmaceutico(cod_fa) on delete set null,
check (cod_f like 'FARM[0-9][0-9]'),
check (cp_f like '[0-9][0-9][0-9][0-9][0-9]'))
go

create table empleado( --empleado
cod_e varchar(6), --codigo empleado
nom_e varchar(30), -- nombre de empleado
app_e varchar(30), --apellido paterno empleado
apm_e varchar(30), --apellido materno empleado
fna_e datetime, --fecha nacimiento empleado
fin_e datetime, --fecha de inicio de trabajo de empleado
enf_e varchar(30), -- cuenta con enfermedad? si:Cual? || no:no --nombre de la enfermedad ej: "gastritis" con respecto al ejerccio
cod_f1 varchar(6), --codigo farmacia
constraint pk_cod_e primary key (cod_e),
constraint fk_nom_e foreign key (cod_f1)references farmacia(cod_f)on delete cascade,
check (cod_e like 'EMP[0-9][0-9][0-9]'))
go
									-------------------------------
									--creación de tablas de unión-- 
									-------------------------------
--go
/*create table unifarmed( --unión farmaceutico medicamento
cod_fa1 varchar(6), --codigo farmaceutico
nom_med1 varchar(30), -- nombre medicamento
constraint fk_cod_far foreign key (cod_fa1) references farmaceutico(cod_fa)on delete set null,
constraint fk_nom_med foreign key (nom_med1) references medicamento(nom_m)on delete set null)
go*/
									-------------
									--registros--
									-------------
go
insert into ciudad values(upper('ciu001'),upper('mexico'),12345)
insert into farmaceutico values(upper('far001'),upper('nombre'),upper('apellido'),upper('apellido'))
insert into accion values(upper('acc001'),upper('nom'),'4 horas',upper('descripcion'))
insert into laboratorio values(upper('unico'),upper('calle'),upper('colonia'),50505,upper('estado'),upper('nom dueño'),upper('ap dueño'))
insert into monodroga values(upper('mon001'),upper('lab'),upper('24 horas'),upper('cientifico'),upper('comercial'),20,upper('unico'))
insert into medicamento values(upper('nombre'),upper('presentacion'),50,upper('acc001'),upper('mon001'))
insert into farmacia values(upper('farm01'),upper('nombre'),upper('calle'),upper('colonia'),12345,5,upper('ciu001'),upper('far001'))
insert into empleado values(upper('emp001'),upper('nombre'),upper('app'),upper('apm'),'20-01-1990','03-05-2020',upper('enfermedad'),upper('farm01'))
--insert into unifarmed values(upper('far001'),upper('nombre'))
go
									-------------
									--consultas-- 
									-------------
select*from ciudad
select*from farmacia
select*from farmaceutico
select*from empleado
select*from unifarmed
select*from medicamento
select*from accion
select*from monodroga
select*from laboratorio
									
									--------------
									--inner join--
									--------------

insert into farmacia values(upper('farm04'),upper('Stiglitz'),upper('deLaRue'),upper('Fontain'),'16661','3',upper('ciu007'),upper('far003'))


alter view farmacias
as
select cod_f, nom_f,cal_f,col_f,cp_f, gua_f,
nom_c, nom_fa
from farmacia where nom_f='esperanza'
inner join ciudad on cod_c= cod_c1 
inner join farmaceutico on cod_fa=cod_fa1

Select * from farmacias where nom_f='esperanza'

	--estos los dejo para que ya no te cuentesn trabajo humano

/*ciudad inner join farmacia on cod_c=cod_c1
inner join farmaceutico on cod_fa=cod_fa1
inner join empleado on cod_f=cod_f1
inner join medicamento on nom_m=nom_med1
inner join accion on cod_a=cod_a1
inner join monodroga on cod_m=cod_m1
inner join laboratorio on nom_l=nom_ll
inner join unifarmed on cod_fa=cod_fa1*/