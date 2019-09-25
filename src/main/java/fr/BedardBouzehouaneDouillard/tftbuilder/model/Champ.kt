package fr.BedardBouzehouaneDouillard.tftbuilder.model

import javax.persistence.*

@Entity(name = "champs")
data class Champ(
        @GeneratedValue(strategy = GenerationType.IDENTITY)
                @Id var id: Int?,
        @Column var name: String?,
        @Column var origin_1: String?,
        @Column var origin_2: String?,
        @Column var class_1: String?,
        @Column var class_2: String?,
        @Column var tier: Int?) {
    constructor() : this(null, null, null, null, null, null, null)



}
