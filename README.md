ReferralIndia
=============
ReferralIndia source code
-----------------------------------------------------

Preferred HSQL DB Version : 2.3.1

Steps to setup local:
---------------------------
git clone https://github.com/sbrnag/RIC-Docs.git

mvn clean

mvn eclipse:eclipse -Dwtpversion=2.0.

mvn package

then open eclipse import the existing projects into workspace.

To test 
------------------------------
Post serive URL
http://localhost:8080/ReferralIndia/post
