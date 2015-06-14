# JEE-jobs-checking-platform
Platform will show progress of a users trying to solve some JEE problems.


Czesc!
Nie uzywam polsich liter bo mam chwilowo problem z alt+s, a sie spiesze spac.

Ogolnie co robi ten projekt? Ma on na zadaniu stworzyc platforme testowo do technologi JEE. W skrocie to bedzie on analizowal rozwiazania uczestnikow i wyswietlal, ktory z nich juz rozwiazal zadanie. Zadania beda realizowane za pomoca pluginow. Kazdy plugin bedzie testowal np. czy ktos umie odebrac i nadac wiadomosc w kolecje, albo czy umie wywolac web-service.

Jak wyglada pelen cykl dzialania aplikacji?
1. Uzytkownicy sie rejestruja w systemie (stronka).
2. Kazdy uztkownik dostaje w zwrotce token, ktory bedzie uzywal celem weryfikacji czy to on.
3. Platforma bedzie umiala wywswietlic liste aktualnych uczestnikow.
4. Admin platformy wybiera zadanie do rozpoczecia.
5. Zadanie sie rozpoczyna.
6. Uczestnicy zaczynaja rozwiazywac zadania.
7. Aktualny status rozwiazan jest pokazywany na stronie u admina.
8. Admin konczy zadanie.
9. Platforma wyswietla statystki zbiorcze jak i indywidualne dla wszystkich zadan i uczestnikow.

Technologie:
- czyste JEE (czyli to co wspieraja AS - tutaj pewnie Wildfly).
- bez Springow
- testy przy uzyciu jUnit i Arquilian i Mockito
- sama platforma uzywa czysto JPA i JSP (JPA jest juz przykladowo uzyte), reszta to simple java

Stworzylem zestaw kart CRC (Candidate, Responsibility, Colaborators - ostatnie do uzupelnienia):

Candidate | Responsibilities | Colaborators
--- | --- | ---
JobsPluginManager | <ul><li>list available plugins</li><li>(?) test plugins</li><li>create instances of the plugins</li><li>(stateful?, per person?)</li></ul> | ?
View | <ul><li>present session status</li><li>create, close, browse sessions</li><li>present reports</li></ul> | ?
Session Management | <ul><li>sessions states</li><li>create  session scenarios</li></ul> | ?
UserManagement | <ul><li>CRUD  persons (per session)</li><li>give user statistics</li><li>create user   ids</li></ul> | ?
Jobs API | <ul><li>give userId</li><li>report events (success/failures)</li><li>report partial successes(?)</li><li>give additional events (?)</li></ul> | ?
View API | <ul><li>sending session status</li><li>sending reports</li><li>list sessions</li><li>available to change sessions</li></ul> | ?
Statistics Manager | <ul><li>collect successes</li><li>collect failures (?)</li><li>generate report</li></ul> | ?

Bedziemy realizowac tych kandydatow. Zaczynamy od platformy do rejestracji uczestnikow.
