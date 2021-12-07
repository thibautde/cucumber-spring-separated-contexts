#language: fr

Fonctionnalité: Rapport

  Scénario: Création d’un rapport
    Étant donné que "mon message" a été affiché
    Et que le template est "Template de test '%s'"
    Quand le rapport est fait
    Alors le rapport contient "Template de test 'mon message'"
