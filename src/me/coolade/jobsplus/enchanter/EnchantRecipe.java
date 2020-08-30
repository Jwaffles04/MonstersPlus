package me.coolade.jobsplus.enchanter;

import org.bukkit.enchantments.Enchantment;

public class EnchantRecipe
{
  private Enchantment type;
  private String name;
  private int level;
  private String job;
  private int jobLevel;
  private int expCost;
  
  public EnchantRecipe(Enchantment type, String name, int level, String job, int jobLevel, int expCost)
  {
    this.type = type;
    this.name = name;
    this.level = level;
    this.job = job;
    this.jobLevel = jobLevel;
    this.expCost = expCost;
  }
  
  public Enchantment getType()
  {
    return this.type;
  }
  
  public String getName()
  {
    return this.name;
  }
  
  public int getLevel()
  {
    return this.level;
  }
  
  public String getJob()
  {
    return this.job;
  }
  
  public int getJobLevel()
  {
    return this.jobLevel;
  }
  
  public int getExpCost()
  {
    return this.expCost;
  }
  
  public void setType(Enchantment t)
  {
    this.type = t;
  }
  
  public void setName(String t)
  {
    this.name = t;
  }
  
  public void setJob(String t)
  {
    this.job = t;
  }
  
  public void setLevel(int t)
  {
    this.level = t;
  }
  
  public void setJobLevel(int t)
  {
    this.jobLevel = t;
  }
  
  public void setExpCost(int t)
  {
    this.expCost = t;
  }
}
