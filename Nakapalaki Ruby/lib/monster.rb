# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.


class Monster
  def
    initialize( nm,  lv,prc,  badconseq,ic=0)
        @name=nm;
        @combatLevel=lv;
        @bc=badconseq;
        @price=prc;
        @levelChangeAgainstCultistPlayer=ic
  end

  
    def getName
        @name
    end
    
    def getBadConsequence
        @bc
    end

    def getPrice
        @price
    end
    
    def getCombatLevel
        @combatLevel
    end
    def getCombatLevelAgainstCultistPlayer
      level=getCombatLevel+@levelChangeAgainstCultistPlayer
      return level
    end
    def
      to_s()
      "#{@name}\nnivel de combate: #{@combatLevel}\n#{@bc}\n#{@price} \nIC : #{@levelChangeAgainstCultistPlayer}"
    end
    def LevelsGained()
      return @price.getLevel
    end
    
    def TreasuresGained
      return @price.getTreasures
    end
    
end
