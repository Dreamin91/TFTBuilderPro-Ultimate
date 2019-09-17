package fr.takima.demo

import javax.persistence.*

@Entity(name = "teams")
data class Team(
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Id var id: Int?,
        @Column var team_name: String?,
        @Column var author: String?,
        @Column var champ_1_id: Int?,
        @Column var champ_2_id: Int?,
        @Column var champ_3_id: Int?,
        @Column var champ_4_id: Int?,
        @Column var champ_5_id: Int?,
        @Column var champ_6_id: Int?,
        @Column var champ_7_id: Int?,
        @Column var champ_8_id: Int?,
        @Column var champ_9_id: Int?) {
    constructor() : this(null, null,null, null, null, null,
                  null, null, null, null, null, null)
}