package com.springinaction.chapter01.knight;

public class KnightOfTheRoundTable implements Knight {
    private String name;

    private Quest quest;

    public KnightOfTheRoundTable(String name) {
        this.name = name;
    }

    @Override
    public Object embarkOnQuest() throws QuestFailedException {
        return quest.embark();
    }

    @Override
    public String getName() {
        return this.name;
    }

    public void setQuest(Quest quest) {
        this.quest = quest;
    }
}
