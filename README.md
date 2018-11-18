# Chocobar (JavaFX)

Ce projet contient l'application Chocobar développée en JavaFX (en développement procédural).

## Préambule

L’objectif est se familiariser avec l’architecture _MVC_ et les composants de _JavaFX_ en développant un petit jeu simple, sur 2 séances de TP. Une fois la question 2 résolue, l’arborescence des composants ainsi que le diagramme de classes doivent être déposés sur _Arche_. 

__Attention__ : Le dépôt sur _Arche_ __ferme aujourd’hui à 11h15__. Après le dépôt, le diagramme sera corrigé (et noté) par l’enseignant, de sorte que le développement puisse se faire sur une base correcte. Pensez à prévenir l’enseignant dès que le dépôt est effectué. À noter que, du moment qu’ils sont lisibles, l’arborescence et le diagramme de classes peuvent être dessinés manuellement et photographiés.

## Sujet

ChocoBar est un jeu à deux joueurs gourmets (ici _Lenôtre_ et _Loiseau_). Le plateau de jeu est une plaquette de chocolat, dans laquelle le carré en haut à gauche est remplacé par un hamburger. À tour de rôle, chaque joueur croque dans un carré de son choix. En croquant dans un carré, le joueur mange par la même occasion tous les carrés qui sont plus à droite et plus bas que lui. Le joueur qui mange le hamburger a perdu.

L’interface de la première version est rudimentaire : les noms des deux joueurs sont codés en dur ; au centre s’affiche le plateau de jeu, au nord le nom du joueur qui doit jouer et au sud un message indiquant si la partie est en cours ou terminée, avec le nom du gagnant.

#### Questions 
1. Dessiner l’arborescence des composants graphiques.
Pour info : le panneau est un ``GridPane`` ou un ``TilePane`` ; les carrés de chocolat sont des Button.

2. Identifier trois vues et dessiner le diagramme de classes _UML_ en respectant l’architecture _MVC_.

3. Développer l’application en utilisant _IntelliJ_.


#### Pour aller plus loin

Une fois cette première version terminée, vous ajoutez des fonctionnalités supplémentaires, à réaliser dans cet ordre :

1. Une nouvelle vue affiche la liste des coups joués, avec pour chacun d’eux, le nom du joueur et les coordonnées du carré mangé.
Pour info : le composant ``Text`` permet d’afficher un texte long.

2. Un menu permet de quitter proprement l’application et de rejouer (uniquement) lorsque la partie est terminée.
Pour info : l’instruction ``Platform.exit()`` permet de quitter l’application en fermant la fenêtre.

3. Au démarrage de l’application, une fenêtre de dialogue s’ouvre pour permettre aux joueurs de saisir leur nom. Un nouvel élément de menu permet de changer les noms.
Pour info : le composant ``Alert`` permet d’ouvrir une boîte de dialogue ; les composants ``Menu`` et ``MenuItem`` permettent de créer des menus.

4. Les résultats des différentes parties sont mémorisées de façon à pouvoir afficher le score dans un nouveau composant au sud.

