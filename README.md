ERA dijagram


![image](https://user-images.githubusercontent.com/117756427/236879277-e865741d-b316-46de-b9db-a19c8bef20d0.png)



 

 
Opis aplikacije

	Kao radnu okolinu sam koristio Apache NetBeans IDE 16,  Java 19 kao programski jezik i kao menadžment baze podataka sam koristio MariaDB 10.11. 
	
	
	!![image](https://user-images.githubusercontent.com/117756427/236881918-d92f2448-b53d-45ad-b9a2-99a3afc540c8.png)




 
					
					Slika 1.


Slika 1. prikazuje  Splash Screen koj se prvi prikazuje tokom pokretanja aplikacije i podizanja Hibernate kako bi došlo do spajanja s bazom podataka. Značajku koji sam  ubacio je korištenje JProgressBar-a za animaciju učitanja.



 		
	![image](https://user-images.githubusercontent.com/117756427/236881116-5972e3a5-3def-4aa9-b765-e8a1d3d02363.png)







 
					
					Slika 2.



Slika 2. prikazuje ProzorLogin u kojem se operater ove aplikacije može prijavit. Prijava zahtijeva unos email-a i lozinke te je omogućena registracija više operatera.


          	
					
					Slika 3.

Slika 3. prikazuje ProzorRegistracija u kojem se novi operater može registrirati. Svaki atribut ima za svoj unos ima kontrolu s posebnim naglaskom na lozinku koja je zaštićena ByCrypt-om te su uvedene značajke da mora sadržavati jedno veliko i malo slovo te određen broj znakova.


![image](https://user-images.githubusercontent.com/117756427/236879631-99065640-787a-4df4-8d6a-003b221a19c0.png)



 

					Slika 4.


Slika 4. prikazuje ProzorIzbornik u kojem je omogućeno rad s bilo kojim entitetom u ovoj aplikaciji, a to se odnosi na čitanje, promjenu, brisanje i stvaranje novog objekta. Značajke koje su stavljene u ovaj prozor su te da ako mišem pređemo preko jednih od ovih ikona, te će se ikone povečati a kursor će preći u oblik ruke. Tu se nalazi i link za github gdje možemo vidjeti kod projekta.


![image](https://user-images.githubusercontent.com/117756427/236879700-2872d60d-2adb-40ce-8886-31674bd44d7b.png)


 
				
					Slika 5.


Slika 5. prikazuje ProzorAvion u kojem je omogućeno dodavanje, brisanje i promjena svih novih objekata te pretraživanje u bazi podataka. Možemo vidjeti i na kojem se letu određen avion nalazi.


![image](https://user-images.githubusercontent.com/117756427/236879733-d985a3ce-4a27-4261-8052-b625f63716b5.png)



 

					Slika 6.

Slika 6. prikazuje ProzorKorisnik u kojem je omogućeno dodavanje brisanje te promjena korisnika u bazi. Svakom korisniku može se dodijeliti i slika. Pomoću gumba traži može se pretraživati korisnik u bazi.


![image](https://user-images.githubusercontent.com/117756427/236879804-e58d4261-7a48-4caf-87cc-2f077ddeb291.png)


 

						Slika 7.


Slika 7. prikazuje ProzorLet u kojem omogučavamo unos korisnika na određeni let i time korisnik ostvaruje svoju rezervaciju. Što se tiče same kontrole vremena polaska i dolaska, to sam napravio pomoću samog trajanja leta. Ako mišem pređemo preko textField-a koji je označen  labelom Trajanje leta(u minutama) automatski se pojavljuje vrijeme koje ne smije biti manje od 30 minuta i veće od 600 minuta. Klikom na korisnika u rezervaciji možemo vidjeti na kojoj se klasi nalazi što je prikazano u slici 8. Nadalje, operateru je omogućeno pretraživanje letova po vremenu polaska.

![image](https://user-images.githubusercontent.com/117756427/236879841-c2c5e012-a9ab-408a-8488-494a28060a67.png)


 

						Slika  8.
						
						
![image](https://user-images.githubusercontent.com/117756427/236879885-3063e521-887e-411f-a76c-535e7bc21e95.png)

 

					Slika 9.


Slika 9. prikazuje ProzorAviokompanija, tj. njihov pregled i popis letova na kojim se određena aviokompanija nalazi.  Svaki novi objekt ima omogućeno brisanje, dodavanje i promjenu. Pomoću gumba traži možemo pretraživati koje se sve aviokompanije nalaze u bazi po kojem god slovu želimo 


 

