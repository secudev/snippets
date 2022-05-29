# A LIRE

### Comment switcher entre les types de BDD


Il faut editer 2 fichiers :
####application.properties

mettre le profile de son choix, ex : spring.profiles.active=h2

####pom.xml

activer le profil choisi ci-dessus en mettant a true la valeur de active par défaut du profile et les autres à false