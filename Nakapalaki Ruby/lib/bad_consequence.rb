# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.

class BadConsequence
  private_class_method:new
  
 attr_accessor:text,:levels
  @@MAXTREASURE=10
  
  def
      initialize( atext,  someLevels)
        @text=atext
        @levels=someLevels
  end
  
  def
     getText
        @text
  end

  def
    getLevels
      @levels
  end
  
   def isEmpty
      raiseNotImplementedError.new
    end
  
     def substractVisibleTreasure(t)
       raiseNotImplementedError.new
    end
    
    def substractHiddenTreasure(t)
      raiseNotImplementedError.new
    end
  
    
  def getText
    @text
  end

  def getLevels
    @levels
  end
  
  def to_s
      "Bad consequence: #{@text} \nPierdes: #{@levels} niveles."
  end
   

  def adjustToFitTreasureLists(v,h) 
    
        t_visible = Array.new
        t_hidden = Array.new
        
       
        v.each do |t|
           
            if t_visible.index(t.type) == nil then
                t_visible << t.type
            end
        end
        
      
        h.each do |t|
        
            if t_hidden.index(t.type) == nil then
                t_hidden << t.type
            end
        end

         bs = NumericBadConsequence.new(@text, 0, t_visible, t_hidden)

        return bs

      
    end
end   

