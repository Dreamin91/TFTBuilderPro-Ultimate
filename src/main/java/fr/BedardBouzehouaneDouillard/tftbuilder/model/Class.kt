package fr.BedardBouzehouaneDouillard.tftbuilder.model

import javax.persistence.*

@Entity(name = "classes")
data class Class(
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Id var id: Int?,
        @Column var name: String?,
        @Column var weight: Float?,
        @Column var treshold_1: Int?,
        @Column var treshold_2: Int?,
        @Column var treshold_3: Int?) {
    constructor() : this(null, null, null, null, null, null)

}