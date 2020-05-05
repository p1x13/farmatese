
Create database FARMATESE
Use FARMATESE

Create table Puesto(
ID_Puesto varchar(6),
Nom_Puesto varchar(200),
Constraint pk_PO primary key (ID_Puesto),
check (ID_Puesto like 'PU[0-9][0-9][0-9][0-9]'))

CREATE PROCEDURE ACT2 
@ID VARCHAR (6),@NOM VARCHAR(200)
AS
UPDATE Puesto
SET Nom_Puesto=@NOM
WHERE ID_Puesto=@ID

INSERT INTO Puesto VALUES('PU1234','VENDEDOR')
INSERT INTO Puesto VALUES('PU1235','GERENTE')

Create Table Ciudad(
ID_Ciu varchar(6),
Nom_Ciu varchar(200),
Constraint pk_CD primary key (ID_Ciu),
Check (ID_Ciu like 'CI[0-9][0-9][0-9][0-9]'))

CREATE PROCEDURE ACT3 
@ID VARCHAR (6),@NOM VARCHAR(200)
AS
UPDATE Ciudad
SET Nom_Ciu=@NOM
WHERE ID_Ciu=@ID

INSERT INTO Ciudad VALUES('CI1234','MEXICO')
INSERT INTO Ciudad VALUES('CI1235','ARGENTINA')

Create Table Colonia(
ID_Col varchar(6),
Nom_Col varchar (200),
Constraint pk_CA primary key (ID_Col),
Check (ID_Col like 'CO[0-9][0-9][0-9][0-9]'))

CREATE PROCEDURE ACT4 
@ID VARCHAR (6),@NOM VARCHAR(200)
AS
UPDATE Colonia
SET Nom_Col=@NOM
WHERE ID_Col=@ID

INSERT INTO Colonia VALUES('CO1234','POLANCO')
INSERT INTO Colonia VALUES('CO1235','BUENOS AIRES')

Create Table Calle(
ID_Calle varchar(6),
Nom_Calle varchar (200),
Constraint pk_CE primary key (ID_Calle),
Check (ID_Calle like 'CA[0-9][0-9][0-9][0-9]'))

CREATE PROCEDURE ACT1 
@ID VARCHAR (6),@NOM VARCHAR(200)
AS
UPDATE Calle
SET Nom_Calle=@NOM
WHERE ID_Calle=@ID

INSERT INTO Calle VALUES('CA1234','MORELOS')
INSERT INTO Calle VALUES('CA1235','AV CENTRAL')

Create Table TipoTelf(
ID_Telf varchar(6),
Tipo_Telf varchar (200),
Constraint pk_TO primary key (ID_Telf),
Check (ID_Telf like 'TT[0-9][0-9][0-9][0-9]'))

CREATE PROCEDURE ACT5 
@ID VARCHAR (6),@TIPO VARCHAR(200)
AS
UPDATE TipoTelf
SET Tipo_Telf=@TIPO
WHERE ID_Telf=@ID

INSERT INTO TipoTelf VALUES('TT1234','OFICINA')
INSERT INTO TipoTelf VALUES('TT1235','CELULAR')

Create Table Monodroga(
ID_Mon varchar(6),
Tipo_Mon varchar (200),
Constraint pk_MA primary key (ID_Mon),
Check (ID_Mon like 'MO[0-9][0-9][0-9][0-9]'))

CREATE PROCEDURE ACT6 
@ID VARCHAR (6),@TIPO VARCHAR(200)
AS
UPDATE Monodroga
SET Tipo_Mon=@TIPO
WHERE ID_Mon=@ID

INSERT INTO Monodroga VALUES('MO1234','CLORURO')
INSERT INTO Monodroga VALUES('MO1235','SODIO')

Create Table Laboratorio(
ID_Lab varchar(6),
Tipo_Lab varchar (200),
Constraint pk_LO primary key (ID_Lab),
Check (ID_Lab like 'LAB[0-9][0-9][0-9]'))

CREATE PROCEDURE ACT7 
@ID VARCHAR (6),@TIPO VARCHAR(200)
AS
UPDATE Laboratorio
SET Tipo_Lab=@TIPO
WHERE ID_Lab=@ID

INSERT INTO Laboratorio VALUES('LAB123','ANGELES')
INSERT INTO Laboratorio VALUES('LAB124','VILLAS')

Create Table Horario(
ID_Horario varchar(6),
Tipo_Horario varchar(200),
Constraint pk_HO primary key (ID_Horario),
Check (ID_Horario like 'HO[0-9][0-9][0-9][0-9]'))

CREATE PROCEDURE ACT8 
@ID VARCHAR (6),@TIPO VARCHAR(200)
AS
UPDATE Horario
SET Tipo_Horario=@TIPO
WHERE ID_Horario=@ID

INSERT INTO Horario VALUES('HO1234','MATUTINO')
INSERT INTO Horario VALUES('HO1235','VESPERTINO')

Create Table UnidadMed(
ID_Umed varchar(6),
Tipo_Umed varchar(200),
Constraint pk_UA primary key (ID_Umed),
Check (ID_Umed like 'UM[0-9][0-9][0-9][0-9]'))

CREATE PROCEDURE ACT9 
@ID VARCHAR (6),@TIPO VARCHAR(200)
AS
UPDATE UnidadMed
SET Tipo_Umed=@TIPO
WHERE ID_Umed=@ID

INSERT INTO UnidadMed VALUES('UM1234','MILILITROS')
INSERT INTO UnidadMed VALUES('UM1235','SUERO')

Create Table Presentacion(
ID_Pres varchar(6),
Tipo_Pres varchar(200),
Constraint pk_PN primary key (ID_Pres),
Check (ID_Pres like 'PRE[0-9][0-9][0-9]'))

CREATE PROCEDURE ACT10 
@ID VARCHAR (6),@TIPO VARCHAR(200)
AS
UPDATE Presentacion
SET Tipo_Pres=@TIPO
WHERE ID_Pres=@ID

INSERT INTO Presentacion VALUES('PRE123','Pastillas')
INSERT INTO Presentacion VALUES('PRE124','SUERO')

Create Table ViAdmon(
ID_Admon varchar(6),
Tipo_Admon varchar (200),
Constraint pk_AN primary key (ID_Admon),
Check (ID_Admon like 'AD[0-9][0-9][0-9][0-9]'))

CREATE PROCEDURE ACT11 
@ID VARCHAR (6),@TIPO VARCHAR(200)
AS
UPDATE ViAdmon
SET Tipo_Admon=@TIPO
WHERE ID_Admon=@ID

INSERT INTO ViAdmon VALUES('AD1234','Oral')
INSERT INTO ViAdmon VALUES('AD1235','Supositorio')

Create Table AccionTera(
ID_AccTera varchar(6),
Tipo_AccTera varchar (200),
Constraint pk_AA primary key (ID_AccTera),
Check (ID_AccTera like 'AT[0-9][0-9][0-9][0-9]'))

CREATE PROCEDURE ACT 
@ID VARCHAR (6),@TIPO VARCHAR(200)
AS
UPDATE AccionTera 
SET Tipo_AccTera=@TIPO
WHERE ID_AccTera=@ID

INSERT INTO AccionTera VALUES('AT1234','Tos')
INSERT INTO AccionTera VALUES('AT1235','Gripa')

Create Table Farmacia(
ID_Farmac varchar(6),
ID_Ciu1 varchar(6),
ID_Col1 varchar(6),
ID_Calle1 varchar(6),
Constraint pk_FA primary key (ID_Farmac),
Constraint fk_CD1 foreign key (ID_Ciu1) references Ciudad (ID_Ciu)ON DELETE SET NULL,
Constraint fk_CA1 foreign key (ID_Col1) references Colonia (ID_Col)ON DELETE SET NULL,
Constraint fk_CE1 foreign key (ID_Calle1) references Calle (ID_Calle)ON DELETE SET NULL,
Check (ID_Farmac like 'FAR[0-9][0-9][0-9]'))

CREATE PROCEDURE ACT12 
@ID VARCHAR (6),@ID_CI VARCHAR(6),
@ID_CO VARCHAR (6),@ID_CA VARCHAR (6)
AS
UPDATE Farmacia
SET ID_Ciu1=@ID_CI,ID_Col1=@ID_CO,
ID_Calle1=@ID_CA
WHERE ID_Farmac=@ID

INSERT INTO Farmacia VALUES('FAR123','CI1234','CO1234','CA1234')
INSERT INTO Farmacia VALUES('FAR124','CI1235','CO1235','CA1235')

Create Table Empleado(
ID_Emp varchar(6),
Nom_Emp varchar (200),
AP_Emp varchar (200),
AM_Emp varchar (200),
Fecha_Nac datetime,
ID_Puesto1 varchar(6),
ID_Ciu2 varchar(6),
ID_Col2 varchar(6),
ID_Calle2 varchar(6),
ID_Horario2 varchar(6),
Constraint pk_EO primary key (ID_Emp),
Constraint fk_PO1 foreign key (ID_Puesto1) references Puesto (ID_Puesto)ON DELETE SET NULL,
Constraint fk_CD2 foreign key (ID_Ciu2) references Ciudad (ID_Ciu)ON DELETE SET NULL,
Constraint fk_CA2 foreign key (ID_Col2) references Colonia (ID_Col)ON DELETE SET NULL,
Constraint fk_CE2 foreign key (ID_Calle2) references Calle (ID_Calle)ON DELETE SET NULL,
Constraint fk_HO2 foreign key (ID_Horario2) references Horario (ID_Horario)ON DELETE SET NULL,
Check (ID_Emp like 'EMP[0-9][0-9][0-9]')) 


CREATE PROCEDURE ACT13 
@ID VARCHAR (6),@NOM VARCHAR(200),
@AP VARCHAR (200),@AM VARCHAR (200),
@FECHA DATETIME,@ID_PU VARCHAR(6),
@ID_CI VARCHAR(6),@ID_CO VARCHAR(6),
@ID_CA VARCHAR(6),@ID_HO VARCHAR(6)
AS
UPDATE Empleado
SET Nom_Emp=@NOM, AP_Emp=@AP,
AM_Emp=@AM,Fecha_Nac=@FECHA,
ID_Puesto1=@ID_PU,ID_Ciu2=@ID_CI,
ID_Col2=@ID_CO,ID_Calle2=@ID_CA,
ID_Horario2=@ID_HO
WHERE ID_Emp=@ID

INSERT INTO Empleado VALUES('EMP123','JUAN','MARTINEZ','VALDEZ','05-05-1993','PU1234','CI1234','CO1234','CA1234','HO1234')
INSERT INTO Empleado VALUES('EMP124','MARIA','OLVERA','HERNANDEZ','06-06-1997','PU1235','CI1235','CO1235','CA1235','HO1235')

Create Table Farmaceutico(
ID_Farm varchar(6),
Nom_Farm varchar (200),
AP_Farm varchar (200),
AM_Farm varchar (200),
Cdeula_Farm varchar (200),
Correo_Farm varchar (200),
ID_Horario1 varchar(6),
ID_Ciu3 varchar(6),
ID_Col3 varchar(6),
ID_Calle3 varchar(6),
Constraint pk_FO primary key (ID_Farm),
Constraint fk_HO1 foreign key (ID_Horario1) references Horario (ID_Horario)ON DELETE SET NULL,
Constraint fk_CD3 foreign key (ID_Ciu3) references Ciudad (ID_Ciu)ON DELETE SET NULL,
Constraint fk_CA3 foreign key (ID_Col3) references Colonia (ID_Col)ON DELETE SET NULL,
Constraint fk_CE3 foreign key (ID_Calle3) references Calle (ID_Calle)ON DELETE SET NULL,
Check (ID_Farm like 'FA[0-9][0-9][0-9][0-9]'))

CREATE PROCEDURE ACT14
@ID VARCHAR (6),@NOM VARCHAR(200),
@AP VARCHAR (200),@AM VARCHAR (200),
@CEDULA VARCHAR(200),@CORREO VARCHAR(200),
@ID_HO VARCHAR(6),@ID_CI VARCHAR(6),
@ID_CO VARCHAR(6),@ID_CA VARCHAR(6)
AS
UPDATE Farmaceutico
SET Nom_Farm=@NOM, AP_Farm=@AP,
AM_Farm=@AM,Cdeula_Farm=@CEDULA,
Correo_Farm=@CORREO,ID_Horario1=@ID_HO,
ID_Ciu3=@ID_CI,ID_Col3=@ID_CO,
ID_Calle3=@ID_CA
WHERE ID_Farm=@ID

INSERT INTO Farmaceutico VALUES('FA1234','PEDRO','VALDEZ','VALDEZ','PVV1234','PEDRO@HOTMAIL.COM','HO1234','CI1234','CO1234','CA1234')
INSERT INTO Farmaceutico VALUES('FA1235','JUANA','CHAVEZ','CHAVEZ','JCC1234','JUANA@HOTMAIL.COM','HO1235','CI1235','CO1235','CA1235')

Create Table Medicamento(
ID_Medic varchar(8),
Nom_Medic varchar (200),
Desc_Medic varchar (200),
ID_Lab1 varchar(6),
Constraint pk_MO primary key (ID_Medic),
Constraint fk_LO1 foreign key (ID_Lab1) references Laboratorio (ID_Lab)ON DELETE SET NULL,
Check (ID_Medic like 'MED[0-9][0-9][0-9][0-9][0-9]'))

CREATE PROCEDURE ACT15
@ID VARCHAR (8),@NOM VARCHAR(200),
@DESCRIPCION VARCHAR (200),@ID_L VARCHAR (6)
AS
UPDATE Medicamento
SET Nom_Medic=@NOM, Desc_Medic=@DESCRIPCION,
ID_Lab1=@ID_L
WHERE ID_Medic=@ID

INSERT INTO Medicamento VALUES('MED12300','VENTOLIN','PARA EL ASMA','LAB123')
INSERT INTO Medicamento VALUES('MED12400','PENICILINA','PARA LA GRIPA','LAB124')

Create Table FarmacFarm(
ID_Farmac1 varchar(6),
ID_Farm1 varchar(6),
Constraint fk_FA1 foreign key (ID_Farmac1) references Farmacia (ID_Farmac)ON DELETE SET NULL,
Constraint fk_FO1 foreign key (ID_Farm1) references Farmaceutico (ID_Farm)ON DELETE SET NULL) 

INSERT INTO FarmacFarm VALUES('FAR123','FA1235')
INSERT INTO FarmacFarm VALUES('FAR124','FA1234')

Create Table TelfEMple(
NumTelf INT,
ID_Telf1 varchar(6),
ID_Emp1 varchar(6),
Constraint fk_TO1 foreign key (ID_Telf1) references TipoTelf (ID_Telf)ON DELETE SET NULL,
Constraint fk_EO1 foreign key (ID_Emp1) references Empleado (ID_Emp)ON DELETE SET NULL,
CHECK (NumTelf>0))

INSERT INTO TelfEMple VALUES(34126789,'TT1234','EMP123')
INSERT INTO TelfEMple VALUES(43678909,'TT1235','EMP124')

Create Table FarmacMed(
ID_Farmac2 varchar(6),
ID_Medic4 varchar(8),
Constraint fk_FA2 foreign key (ID_Farmac2) references Farmacia (ID_Farmac)ON DELETE SET NULL,
Constraint fk_MO4 foreign key (ID_Medic4) references Medicamento (ID_Medic)ON DELETE SET NULL)


INSERT INTO FarmacMed VALUES('FAR123','MED12300')
INSERT INTO FarmacMed VALUES('FAR124','MED12400')

Create Table MediMono(
ID_Mon1 varchar(6),
ID_Medic2 varchar(8),
Constraint fk_MA foreign key (ID_Mon1) references Monodroga (ID_Mon)ON DELETE SET NULL,
Constraint fk_MO2 foreign key (ID_Medic2) references Medicamento (ID_Medic)ON DELETE CASCADE)


INSERT INTO MediMono VALUES('MO1234','MED12300')
INSERT INTO MediMono VALUES('MO1235','MED12400')

Create Table MedAcTera(
ID_Medic3 varchar(8),
ID_AccTera1 varchar(6),
Constraint fk_MO3 foreign key (ID_Medic3) references Medicamento (ID_Medic)ON DELETE CASCADE,
Constraint fk_AA1 foreign key (ID_AccTera1) references AccionTera (ID_AccTera)ON DELETE SET NULL)


INSERT INTO MedAcTera VALUES('MED12300','AT1234')
INSERT INTO MedAcTera VALUES('MED12400','AT1235')

Create Table MedUniPresVia(
No_Exis int,
Stock int,
Precio int,
ID_Medic1 varchar(8),
ID_Umed1 varchar(6),
ID_Pres1 varchar(6),
ID_Admon1 varchar(6),
Constraint fk_MO1 foreign key (ID_Medic1) references Medicamento (ID_Medic)ON DELETE SET NULL,
Constraint fk_UA foreign key (ID_Umed1) references UnidadMed (ID_Umed)ON DELETE SET NULL,
Constraint fk_PN foreign key (ID_Pres1) references Presentacion (ID_Pres)ON DELETE SET NULL,
Constraint fk_AN foreign key (ID_Admon1) references ViAdmon (ID_Admon)ON DELETE SET NULL,
CHECK (No_Exis>0),
CHECK (Stock>0),
CHECK (Precio>0))

INSERT INTO MedUniPresVia VALUES(100,150,50,'MED12300','UM1234','PRE123','AD1234')
INSERT INTO MedUniPresVia VALUES(200,250,85,'MED12400','UM1235','PRE124','AD1235')


SELECT ID_Medic,ID_Lab
FROM Medicamento INNER JOIN Laboratorio ON ID_Lab1=ID_Lab
WHERE Nom_Medic='VENTOLIN'

SELECT Nom_Medic,Tipo_Pres,Precio
FROM Medicamento INNER JOIN MedUniPresVia ON ID_Medic=ID_Medic1 INNER JOIN Presentacion ON ID_Pres1=ID_Pres
WHERE ID_Medic='MED12400'

SELECT ID_Medic,ID_Farmac
FROM Medicamento INNER JOIN FarmacMed ON ID_Medic=ID_Medic4 INNER JOIN Farmacia ON ID_Farmac2=ID_Farmac
WHERE Nom_Medic='PENICILINA'

SELECT Nom_Emp,Nom_Puesto
FROM Empleado INNER JOIN Puesto ON ID_Puesto1=ID_Puesto
WHERE ID_Emp='EMP123'

SELECT Nom_Farm,Correo_Farm,ID_Ciu
FROM Farmaceutico INNER JOIN Ciudad ON ID_Ciu3=ID_Ciu
WHERE Nom_Ciu='MEXICO'

SELECT ID_Horario,Tipo_Horario,Nom_Emp,AP_Emp,AM_Emp
FROM Horario INNER JOIN Empleado ON ID_Horario=ID_Horario2
WHERE Fecha_Nac='05-05-1993'

SELECT Nom_Medic, Desc_Medic,ID_Lab
FROM Medicamento INNER JOIN Laboratorio ON ID_Lab1=ID_Lab
WHERE Tipo_Lab='ANGELES'

SELECT ID_Medic,Nom_Medic,Tipo_Mon
FROM Medicamento INNER JOIN Medimono ON ID_Medic=ID_Medic2 INNER JOIN Monodroga ON ID_Mon1=ID_Mon
WHERE Tipo_Mon='SODIO'

SELECT NOM_EMP,NOM_PUESTO,ID_PUESTO
FROM EMPLEADO INNER JOIN PUESTO ON ID_Puesto1=ID_PUESTO
WHERE(NOM_PUESTO='GERENTE')

SELECT TIPO_LAB,ID_MEDIC,ID_LAB
FROM Laboratorio INNER JOIN Medicamento ON ID_LAB=ID_LAB1
WHERE NOM_MEDIC='VENTOLIN'

SELECT NOM_EMP,AP_EMP,AM_EMP, FECHA_NAC
FROM EMPLEADO
WHERE NOM_EMP='JUAN'

SELECT*
FROM MEDICAMENTO 
WHERE NOM_MEDIC='VENTOLIN'

SELECT ID_HORARIO, Tipo_Horario, NOM_EMP,AP_EMP,AM_EMP
FROM HORARIO INNER JOIN EMPLEADO ON ID_HORARIO2=ID_HORARIO
WHERE(TIPO_HORARIO='MATUTINO')

SELECT ID_FARM,NOM_FARM,AP_FARM,AM_FARM
FROM FARMACEUTICO INNER JOIN CIUDAD ON ID_CIU3=ID_CIU
WHERE(NOM_CIU='MEXICO')

SELECT TIPO_LAB,ID_MEDIC,ID_LAB
FROM Laboratorio INNER JOIN Medicamento ON ID_LAB=ID_LAB1
WHERE NOM_MEDIC='PENICILINA'

SELECT NOM_MEDIC
FROM MEDICAMENTO INNER JOIN MEDACTERA ON ID_MEDIC = ID_MEDIC3 INNER JOIN ACCIONTERA ON ID_ACCTERA1 = ID_ACCTERA
WHERE TIPO_AccTera = 'GRIPA'

SELECT*
FROM FARMACEUTICO INNER JOIN COLONIA ON ID_COL3 = ID_COL
WHERE NOM_COL = 'POLANCO'

SELECT NOM_EMP, AP_EMP, AM_EMP, FECHA_NAC
FROM EMPLEADO INNER JOIN TELFEMPLE ON ID_EMP = ID_EMP1 INNER JOIN TIPOTELF ON ID_TELF1 = ID_TELF
WHERE TIPO_TELF = 'CELULAR'

SELECT *, Tipo_Mon
FROM MEDICAMENTO INNER JOIN MEDIMONO ON ID_MEDIC = ID_MEDIC2 INNER JOIN MONODROGA ON ID_MON1 = ID_MON

SELECT Tipo_Mon, ID_Mon
FROM Medicamento INNER JOIN  MediMono ON ID_Medic=ID_Medic2 INNER JOIN Monodroga ON ID_MON1=ID_MON
WHERE Nom_Medic='VENTOLIN'


Select *
from Farmacia INNER JOIN Calle on ID_Calle1=ID_Calle


Select ID_Medic,Nom_Medic,Tipo_Lab,No_Exis,Stock,Precio,Tipo_Pres,Tipo_Umed,Tipo_Admon,Tipo_Mon,Tipo_AccTera
From Medicamento INNER JOIN MedUniPresVia ON ID_Medic=ID_Medic INNER JOIN UnidadMed ON ID_Umed1=ID_Umed INNER JOIN Presentacion ON ID_Pres1=ID_Pres INNER JOIN 
ViAdmon ON ID_Admon1=ID_Admon INNER JOIN MedAcTera ON ID_Medic=ID_Medic3 INNER JOIN AccionTera on ID_AccTera1=ID_AccTera INNER JOIN MediMono ON ID_Medic=ID_Medic2 INNER JOIN Monodroga ON ID_Mon1=ID_Mon
INNER JOIN Laboratorio ON ID_Lab1=ID_Lab

Select ID_Medic,Nom_Medic,Tipo_Lab,No_Exis,Stock,Precio,Tipo_Pres,Tipo_Umed,Tipo_Admon,Tipo_Mon,Tipo_AccTera
From Medicamento INNER JOIN MedUniPresVia ON ID_Medic=ID_Medic INNER JOIN UnidadMed ON ID_Umed1=ID_Umed INNER JOIN Presentacion ON ID_Pres1=ID_Pres INNER JOIN 
ViAdmon ON ID_Admon1=ID_Admon INNER JOIN MedAcTera ON ID_Medic=ID_Medic3 INNER JOIN AccionTera on ID_AccTera1=ID_AccTera INNER JOIN MediMono ON ID_Medic=ID_Medic2 INNER JOIN Monodroga ON ID_Mon1=ID_Mon
INNER JOIN Laboratorio ON ID_Lab1=ID_Lab
WHERE ID_Medic='MED12300'


SELECT ID_Emp,Nom_Emp,AP_Emp,AM_Emp,Fecha_Nac,Nom_Puesto,Nom_Ciu,Nom_Col,Nom_Calle,Tipo_Horario,NumTelf,Tipo_Telf
FROM Empleado INNER JOIN TelfEMple ON ID_Emp=ID_Emp1 INNER JOIN TipoTelf ON ID_Telf1=ID_Telf INNER JOIN Puesto ON ID_Puesto1=ID_Puesto INNER JOIN Ciudad ON ID_Ciu2=ID_Ciu INNER JOIN Colonia ON ID_Col2=ID_Col
INNER JOIN Calle ON ID_Calle2=ID_Calle INNER JOIN Horario ON ID_Horario2=ID_Horario

SELECT ID_Emp,Nom_Emp,AP_Emp,AM_Emp,Fecha_Nac,Nom_Puesto,Nom_Ciu,Nom_Col,Nom_Calle,Tipo_Horario,NumTelf,Tipo_Telf
FROM Empleado INNER JOIN TelfEMple ON ID_Emp=ID_Emp1 INNER JOIN TipoTelf ON ID_Telf1=ID_Telf INNER JOIN Puesto ON ID_Puesto1=ID_Puesto INNER JOIN Ciudad ON ID_Ciu2=ID_Ciu INNER JOIN Colonia ON ID_Col2=ID_Col
INNER JOIN Calle ON ID_Calle2=ID_Calle INNER JOIN Horario ON ID_Horario2=ID_Horario
WHERE ID_Emp='EMP123'

SELECT ID_Farmac,Nom_Ciu,Nom_Col,Nom_Calle,Nom_Medic,Tipo_Lab,No_Exis,Stock,Precio,Tipo_Pres,Tipo_Umed,Tipo_Admon,Tipo_Mon,Tipo_AccTera
FROM FARMACIA INNER JOIN Ciudad ON ID_Ciu1=ID_Ciu INNER JOIN Colonia ON ID_Col1=ID_Col INNER JOIN Calle ON ID_Calle1=ID_Calle INNER JOIN FarmacMed ON ID_Farmac=ID_Farmac2 INNER JOIN Medicamento ON ID_Medic4=ID_Medic
INNER JOIN  MedUniPresVia ON ID_Medic=ID_Medic INNER JOIN UnidadMed ON ID_Umed1=ID_Umed INNER JOIN Presentacion ON ID_Pres1=ID_Pres INNER JOIN 
ViAdmon ON ID_Admon1=ID_Admon INNER JOIN MedAcTera ON ID_Medic=ID_Medic3 INNER JOIN AccionTera on ID_AccTera1=ID_AccTera INNER JOIN MediMono ON ID_Medic=ID_Medic2 INNER JOIN Monodroga ON ID_Mon1=ID_Mon INNER JOIN 
Laboratorio ON ID_Lab1=ID_Lab

SELECT ID_Farmac,Nom_Ciu,Nom_Col,Nom_Calle,Nom_Medic,Tipo_Lab,No_Exis,Stock,Precio,Tipo_Pres,Tipo_Umed,Tipo_Admon,Tipo_Mon,Tipo_AccTera
FROM FARMACIA INNER JOIN Ciudad ON ID_Ciu1=ID_Ciu INNER JOIN Colonia ON ID_Col1=ID_Col INNER JOIN Calle ON ID_Calle1=ID_Calle INNER JOIN FarmacMed ON ID_Farmac=ID_Farmac2 INNER JOIN Medicamento ON ID_Medic4=ID_Medic
INNER JOIN  MedUniPresVia ON ID_Medic=ID_Medic INNER JOIN UnidadMed ON ID_Umed1=ID_Umed INNER JOIN Presentacion ON ID_Pres1=ID_Pres INNER JOIN 
ViAdmon ON ID_Admon1=ID_Admon INNER JOIN MedAcTera ON ID_Medic=ID_Medic3 INNER JOIN AccionTera on ID_AccTera1=ID_AccTera INNER JOIN MediMono ON ID_Medic=ID_Medic2 INNER JOIN Monodroga ON ID_Mon1=ID_Mon INNER JOIN Laboratorio ON ID_Lab1=ID_Lab
WHERE ID_Farmac='FAR124'

SELECT ID_Farm,Nom_Farm,AP_Farm,Am_Farm,Cdeula_Farm,Tipo_Horario,Nom_Ciu,Nom_Col,Nom_Calle,ID_Farmac
FROM Farmaceutico INNER JOIN Horario ON ID_Horario1=ID_Horario INNER JOIN Ciudad ON ID_Ciu3=ID_Ciu INNER JOIN Colonia ON ID_Col3=ID_Col INNER JOIN Calle ON ID_Calle3=ID_Calle INNER JOIN FarmacFarm ON ID_Farm=ID_Farm1 INNER JOIN Farmacia ON ID_Farmac=ID_Farmac1

SELECT ID_Farm,Nom_Farm,AP_Farm,Am_Farm,Cdeula_Farm,Tipo_Horario,Nom_Ciu,Nom_Col,Nom_Calle,ID_Farmac
FROM Farmaceutico INNER JOIN Horario ON ID_Horario1=ID_Horario INNER JOIN Ciudad ON ID_Ciu3=ID_Ciu INNER JOIN Colonia ON ID_Col3=ID_Col INNER JOIN Calle ON ID_Calle3=ID_Calle INNER JOIN FarmacFarm ON ID_Farm=ID_Farm1 INNER JOIN Farmacia ON ID_Farmac=ID_Farmac1
WHERE ID_Farm='FA1234'