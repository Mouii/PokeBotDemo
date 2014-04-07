package fr.univaix.iut.pokebattle.smartcell;

import fr.univaix.iut.pokebattle.jpa.Pokemon;
import fr.univaix.iut.pokebattle.twitter.Tweet;


public class PokeDonneCarac implements SmartCell {

    private Pokemon poke;

    @Override
    public String ask(Tweet question) {

    	poke = PokeAskOwnerCell.recupInfo(question.getText());
    	String asking = question.getText();
    	if (poke != null && asking.contains("#stat #level ?")) {
    		return "@" + question.getScreenName() + " #level=" + poke.getLevel();
    	} else if (poke != null && asking.contains("#stat #XP ?")) {
    		return "@" + question.getScreenName() + " #XP=" + poke.getXP();
    	} else if (poke != null && asking.contains("#stat #HP ?")) {
    		return "@" + question.getScreenName() + " #HP=" + poke.getPV();
    	} else if (poke != null && asking.contains("#stat #attack ?")) {
    		return "@" + question.getScreenName() + " #attack=" + poke.getAttack();
		} else if (poke != null && asking.contains("#stat #defense ?")) {
			return "@" + question.getScreenName() + " #defense=" + poke.getDefense();
		} else if (poke != null && asking.contains("#stat #att.spe ?")) {
    		return "@" + question.getScreenName() + " #att.spe=" + poke.getAttackSpecial();
		} else if (poke != null && asking.contains("#stat #def.spe ?")) {
    		return "@" + question.getScreenName() + " #def.spe=" + poke.getDefenseSpecial();
		} else if (poke != null && asking.contains("#stat #speed ?")) {
    		return "@" + question.getScreenName() + " #speed=" + poke.getSpeed();
    	}else {
    		return null;
    	}
    }
}