# RGAA 3.2017 - Rule 1.3.7

## Summary
No-check rule


## Business description

### Criterion
[1.3](http://references.modernisation.gouv.fr/rgaa-accessibilite/criteres.html#crit-1-3)

### Test
[1.3.7](http://references.modernisation.gouv.fr/rgaa-accessibilite/criteres.html#test-1-3-7)

### Description
<div lang="fr">Chaque image embarqu&#xE9;e (balise <code lang="en">embed</code> avec l'attribut <code lang="en">type="image/…"</code>) <a href="http://references.modernisation.gouv.fr/rgaa-accessibilite/glossaire.html#image-porteuse-dinformation">porteuse d'information</a>, qui utilise une propri&#xE9;t&#xE9; <code lang="en">aria-label</code>, <code lang="en">aria-labelledby</code> ou un attribut <code lang="en">title</code>, v&#xE9;rifie-t-elle ces conditions (hors <a href="http://references.modernisation.gouv.fr/rgaa-accessibilite/cas-particuliers.html#cp-1-3" title="Cas particuliers pour le crit&#xE8;re 1.3">cas particuliers</a>)&nbsp;? <ul><li>S'il est pr&#xE9;sent, le contenu de l'attribut <code lang="en">title</code> est identique au contenu de l'attribut <code lang="en">aria-label</code>.</li> <li>S'il est pr&#xE9;sent, le contenu de l'attribut <code lang="en">title</code> est identique au <a href="http://references.modernisation.gouv.fr/rgaa-accessibilite/glossaire.html#passage-texte-aria">passage de texte li&#xE9; par la propri&#xE9;t&#xE9; <code lang="en">aria-labelledby</code></a>.</li> </ul></div>

### Level
**A**


## Technical description

### Scope
**Page**

### Decision level
@@@TODO


## Algorithm

### Selection
None

### Process
None

### Analysis

#### No Tested
In all cases


##  TestCases

[TestCases files for rule 1.3.7](https://github.com/Asqatasun/Asqatasun/tree/develop/rules/rules-rgaa3.2017/src/test/resources/testcases/rgaa32017/Rgaa32017Rule010307/)


