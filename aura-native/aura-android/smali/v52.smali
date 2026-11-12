.class public final Lv52;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final A:Z

.field public final B:Z

.field public final C:Ljava/lang/String;

.field public final a:Z

.field public final b:Z

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/String;

.field public final e:Ljava/lang/String;

.field public final f:Ljava/lang/String;

.field public final g:Ljava/lang/String;

.field public final h:J

.field public final i:J

.field public final j:Z

.field public final k:Z

.field public final l:F

.field public final m:I

.field public final n:I

.field public final o:I

.field public final p:I

.field public final q:J

.field public final r:I

.field public final s:Ljava/lang/String;

.field public final t:Z

.field public final u:I

.field public final v:Z

.field public final w:Z

.field public final x:Ljava/lang/String;

.field public final y:F

.field public final z:F


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJZZFIIIIJLjava/lang/String;ZIZZLjava/lang/String;FFZZLjava/lang/String;I)V
    .locals 37

    move/from16 v0, p30

    and-int/lit8 v1, v0, 0x1

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    const/4 v5, 0x0

    goto :goto_0

    :cond_0
    move v5, v2

    :goto_0
    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_1

    const/4 v6, 0x0

    goto :goto_1

    :cond_1
    move v6, v2

    :goto_1
    and-int/lit8 v1, v0, 0x4

    .line 1
    const-string v2, ""

    if-eqz v1, :cond_2

    move-object v7, v2

    goto :goto_2

    :cond_2
    move-object/from16 v7, p1

    :goto_2
    and-int/lit8 v1, v0, 0x8

    if-eqz v1, :cond_3

    move-object v8, v2

    goto :goto_3

    :cond_3
    move-object/from16 v8, p2

    :goto_3
    and-int/lit8 v1, v0, 0x10

    if-eqz v1, :cond_4

    move-object v9, v2

    goto :goto_4

    :cond_4
    move-object/from16 v9, p3

    :goto_4
    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_5

    move-object v10, v2

    goto :goto_5

    :cond_5
    move-object/from16 v10, p4

    :goto_5
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_6

    move-object v11, v2

    goto :goto_6

    :cond_6
    move-object/from16 v11, p5

    :goto_6
    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_7

    const-wide/16 v14, 0x0

    goto :goto_7

    :cond_7
    move-wide/from16 v14, p6

    :goto_7
    and-int/lit16 v1, v0, 0x100

    if-eqz v1, :cond_8

    const-wide/16 v16, 0x0

    goto :goto_8

    :cond_8
    move-wide/from16 v16, p8

    :goto_8
    and-int/lit16 v1, v0, 0x200

    if-eqz v1, :cond_9

    const/4 v1, 0x0

    goto :goto_9

    :cond_9
    move/from16 v1, p10

    :goto_9
    and-int/lit16 v4, v0, 0x400

    if-eqz v4, :cond_a

    const/4 v4, 0x0

    goto :goto_a

    :cond_a
    move/from16 v4, p11

    :goto_a
    and-int/lit16 v3, v0, 0x800

    const/high16 v19, 0x3f800000    # 1.0f

    if-eqz v3, :cond_b

    move/from16 v3, v19

    goto :goto_b

    :cond_b
    move/from16 v3, p12

    :goto_b
    and-int/lit16 v12, v0, 0x1000

    if-eqz v12, :cond_c

    const/4 v12, 0x0

    goto :goto_c

    :cond_c
    move/from16 v12, p13

    :goto_c
    and-int/lit16 v13, v0, 0x2000

    if-eqz v13, :cond_d

    const/16 v20, 0x0

    goto :goto_d

    :cond_d
    move/from16 v20, p14

    :goto_d
    and-int/lit16 v13, v0, 0x4000

    if-eqz v13, :cond_e

    const/4 v13, -0x1

    move/from16 v21, v13

    goto :goto_e

    :cond_e
    move/from16 v21, p15

    :goto_e
    const v13, 0x8000

    and-int/2addr v13, v0

    if-eqz v13, :cond_f

    const/16 v22, 0x0

    goto :goto_f

    :cond_f
    move/from16 v22, p16

    :goto_f
    const/high16 v13, 0x10000

    and-int/2addr v13, v0

    if-eqz v13, :cond_10

    const-wide/16 v23, 0x0

    goto :goto_10

    :cond_10
    move-wide/from16 v23, p17

    :goto_10
    const/high16 v13, 0x40000

    and-int/2addr v13, v0

    if-eqz v13, :cond_11

    move-object/from16 v26, v2

    goto :goto_11

    :cond_11
    move-object/from16 v26, p19

    :goto_11
    const/high16 v13, 0x80000

    and-int/2addr v13, v0

    if-eqz v13, :cond_12

    const/16 v27, 0x0

    goto :goto_12

    :cond_12
    move/from16 v27, p20

    :goto_12
    const/high16 v13, 0x100000

    and-int/2addr v13, v0

    if-eqz v13, :cond_13

    const/16 v28, 0x0

    goto :goto_13

    :cond_13
    move/from16 v28, p21

    :goto_13
    const/high16 v13, 0x200000

    and-int/2addr v13, v0

    if-eqz v13, :cond_14

    const/16 v29, 0x0

    goto :goto_14

    :cond_14
    move/from16 v29, p22

    :goto_14
    const/high16 v13, 0x400000

    and-int/2addr v13, v0

    if-eqz v13, :cond_15

    const/16 v30, 0x0

    goto :goto_15

    :cond_15
    move/from16 v30, p23

    :goto_15
    const/high16 v13, 0x800000

    and-int/2addr v13, v0

    if-eqz v13, :cond_16

    move-object/from16 v31, v2

    goto :goto_16

    :cond_16
    move-object/from16 v31, p24

    :goto_16
    const/high16 v13, 0x1000000

    and-int/2addr v13, v0

    if-eqz v13, :cond_17

    move/from16 v32, v19

    goto :goto_17

    :cond_17
    move/from16 v32, p25

    :goto_17
    const/high16 v13, 0x2000000

    and-int/2addr v13, v0

    if-eqz v13, :cond_18

    move/from16 v33, v19

    goto :goto_18

    :cond_18
    move/from16 v33, p26

    :goto_18
    const/high16 v13, 0x4000000

    and-int/2addr v13, v0

    if-eqz v13, :cond_19

    const/16 v34, 0x0

    goto :goto_19

    :cond_19
    move/from16 v34, p27

    :goto_19
    const/high16 v13, 0x8000000

    and-int/2addr v13, v0

    if-eqz v13, :cond_1a

    const/16 v35, 0x0

    goto :goto_1a

    :cond_1a
    move/from16 v35, p28

    :goto_1a
    const/high16 v13, 0x10000000

    and-int/2addr v0, v13

    if-eqz v0, :cond_1b

    move-object/from16 v36, v2

    goto :goto_1b

    :cond_1b
    move-object/from16 v36, p29

    :goto_1b
    const/16 v25, 0x0

    move/from16 v18, v3

    move/from16 v19, v12

    move-wide v12, v14

    move-wide/from16 v14, v16

    move/from16 v16, v1

    move/from16 v17, v4

    move-object/from16 v4, p0

    invoke-direct/range {v4 .. v36}, Lv52;-><init>(ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJZZFIIIIJILjava/lang/String;ZIZZLjava/lang/String;FFZZLjava/lang/String;)V

    return-void
.end method

.method public constructor <init>(ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJZZFIIIIJILjava/lang/String;ZIZZLjava/lang/String;FFZZLjava/lang/String;)V
    .locals 0

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p22 .. p22}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p27 .. p27}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p32 .. p32}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-boolean p1, p0, Lv52;->a:Z

    .line 4
    iput-boolean p2, p0, Lv52;->b:Z

    .line 5
    iput-object p3, p0, Lv52;->c:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lv52;->d:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lv52;->e:Ljava/lang/String;

    .line 8
    iput-object p6, p0, Lv52;->f:Ljava/lang/String;

    .line 9
    iput-object p7, p0, Lv52;->g:Ljava/lang/String;

    .line 10
    iput-wide p8, p0, Lv52;->h:J

    .line 11
    iput-wide p10, p0, Lv52;->i:J

    .line 12
    iput-boolean p12, p0, Lv52;->j:Z

    .line 13
    iput-boolean p13, p0, Lv52;->k:Z

    .line 14
    iput p14, p0, Lv52;->l:F

    .line 15
    iput p15, p0, Lv52;->m:I

    move/from16 p1, p16

    .line 16
    iput p1, p0, Lv52;->n:I

    move/from16 p1, p17

    .line 17
    iput p1, p0, Lv52;->o:I

    move/from16 p1, p18

    .line 18
    iput p1, p0, Lv52;->p:I

    move-wide/from16 p1, p19

    .line 19
    iput-wide p1, p0, Lv52;->q:J

    move/from16 p1, p21

    .line 20
    iput p1, p0, Lv52;->r:I

    move-object/from16 p1, p22

    .line 21
    iput-object p1, p0, Lv52;->s:Ljava/lang/String;

    move/from16 p1, p23

    .line 22
    iput-boolean p1, p0, Lv52;->t:Z

    move/from16 p1, p24

    .line 23
    iput p1, p0, Lv52;->u:I

    move/from16 p1, p25

    .line 24
    iput-boolean p1, p0, Lv52;->v:Z

    move/from16 p1, p26

    .line 25
    iput-boolean p1, p0, Lv52;->w:Z

    move-object/from16 p1, p27

    .line 26
    iput-object p1, p0, Lv52;->x:Ljava/lang/String;

    move/from16 p1, p28

    .line 27
    iput p1, p0, Lv52;->y:F

    move/from16 p1, p29

    .line 28
    iput p1, p0, Lv52;->z:F

    move/from16 p1, p30

    .line 29
    iput-boolean p1, p0, Lv52;->A:Z

    move/from16 p1, p31

    .line 30
    iput-boolean p1, p0, Lv52;->B:Z

    move-object/from16 p1, p32

    .line 31
    iput-object p1, p0, Lv52;->C:Ljava/lang/String;

    return-void
.end method

.method public static a(Lv52;IIII)Lv52;
    .locals 33

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p4

    .line 4
    .line 5
    iget-boolean v2, v0, Lv52;->a:Z

    .line 6
    .line 7
    and-int/lit8 v3, v1, 0x2

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    iget-boolean v3, v0, Lv52;->b:Z

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v3, 0x0

    .line 15
    :goto_0
    iget-object v4, v0, Lv52;->c:Ljava/lang/String;

    .line 16
    .line 17
    move v5, v2

    .line 18
    move v2, v3

    .line 19
    move-object v3, v4

    .line 20
    iget-object v4, v0, Lv52;->d:Ljava/lang/String;

    .line 21
    .line 22
    move v6, v5

    .line 23
    iget-object v5, v0, Lv52;->e:Ljava/lang/String;

    .line 24
    .line 25
    move v7, v6

    .line 26
    iget-object v6, v0, Lv52;->f:Ljava/lang/String;

    .line 27
    .line 28
    move v8, v7

    .line 29
    iget-object v7, v0, Lv52;->g:Ljava/lang/String;

    .line 30
    .line 31
    move v10, v8

    .line 32
    iget-wide v8, v0, Lv52;->h:J

    .line 33
    .line 34
    move v12, v10

    .line 35
    iget-wide v10, v0, Lv52;->i:J

    .line 36
    .line 37
    move v13, v12

    .line 38
    iget-boolean v12, v0, Lv52;->j:Z

    .line 39
    .line 40
    move v14, v13

    .line 41
    iget-boolean v13, v0, Lv52;->k:Z

    .line 42
    .line 43
    move v15, v14

    .line 44
    iget v14, v0, Lv52;->l:F

    .line 45
    .line 46
    move/from16 v16, v2

    .line 47
    .line 48
    and-int/lit16 v2, v1, 0x1000

    .line 49
    .line 50
    if-eqz v2, :cond_1

    .line 51
    .line 52
    iget v2, v0, Lv52;->m:I

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_1
    move/from16 v2, p1

    .line 56
    .line 57
    :goto_1
    move/from16 p1, v2

    .line 58
    .line 59
    and-int/lit16 v2, v1, 0x2000

    .line 60
    .line 61
    if-eqz v2, :cond_2

    .line 62
    .line 63
    iget v2, v0, Lv52;->n:I

    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_2
    move/from16 v2, p2

    .line 67
    .line 68
    :goto_2
    iget v1, v0, Lv52;->o:I

    .line 69
    .line 70
    move/from16 v17, v1

    .line 71
    .line 72
    iget v1, v0, Lv52;->p:I

    .line 73
    .line 74
    move/from16 v18, v1

    .line 75
    .line 76
    move/from16 p2, v2

    .line 77
    .line 78
    iget-wide v1, v0, Lv52;->q:J

    .line 79
    .line 80
    const/high16 v19, 0x20000

    .line 81
    .line 82
    and-int v19, p4, v19

    .line 83
    .line 84
    if-eqz v19, :cond_3

    .line 85
    .line 86
    move-wide/from16 v19, v1

    .line 87
    .line 88
    iget v1, v0, Lv52;->r:I

    .line 89
    .line 90
    move/from16 v21, v1

    .line 91
    .line 92
    goto :goto_3

    .line 93
    :cond_3
    move-wide/from16 v19, v1

    .line 94
    .line 95
    move/from16 v21, p3

    .line 96
    .line 97
    :goto_3
    iget-object v1, v0, Lv52;->s:Ljava/lang/String;

    .line 98
    .line 99
    iget-boolean v2, v0, Lv52;->t:Z

    .line 100
    .line 101
    move-object/from16 v22, v1

    .line 102
    .line 103
    iget v1, v0, Lv52;->u:I

    .line 104
    .line 105
    move/from16 v24, v1

    .line 106
    .line 107
    iget-boolean v1, v0, Lv52;->v:Z

    .line 108
    .line 109
    move/from16 v25, v1

    .line 110
    .line 111
    iget-boolean v1, v0, Lv52;->w:Z

    .line 112
    .line 113
    move/from16 v26, v1

    .line 114
    .line 115
    iget-object v1, v0, Lv52;->x:Ljava/lang/String;

    .line 116
    .line 117
    move-object/from16 v27, v1

    .line 118
    .line 119
    iget v1, v0, Lv52;->y:F

    .line 120
    .line 121
    move/from16 v28, v1

    .line 122
    .line 123
    iget v1, v0, Lv52;->z:F

    .line 124
    .line 125
    move/from16 v29, v1

    .line 126
    .line 127
    iget-boolean v1, v0, Lv52;->A:Z

    .line 128
    .line 129
    move/from16 v30, v1

    .line 130
    .line 131
    iget-boolean v1, v0, Lv52;->B:Z

    .line 132
    .line 133
    iget-object v0, v0, Lv52;->C:Ljava/lang/String;

    .line 134
    .line 135
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 142
    .line 143
    .line 144
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 145
    .line 146
    .line 147
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 151
    .line 152
    .line 153
    invoke-virtual/range {v27 .. v27}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 154
    .line 155
    .line 156
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 157
    .line 158
    .line 159
    move-object/from16 v32, v0

    .line 160
    .line 161
    new-instance v0, Lv52;

    .line 162
    .line 163
    move/from16 v31, v1

    .line 164
    .line 165
    move/from16 v23, v2

    .line 166
    .line 167
    move v1, v15

    .line 168
    move/from16 v2, v16

    .line 169
    .line 170
    move/from16 v15, p1

    .line 171
    .line 172
    move/from16 v16, p2

    .line 173
    .line 174
    invoke-direct/range {v0 .. v32}, Lv52;-><init>(ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJZZFIIIIJILjava/lang/String;ZIZZLjava/lang/String;FFZZLjava/lang/String;)V

    .line 175
    .line 176
    .line 177
    return-object v0
.end method


# virtual methods
.method public final b(J)J
    .locals 11

    .line 1
    iget-boolean v0, p0, Lv52;->b:Z

    .line 2
    .line 3
    const-wide/16 v1, 0x0

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    iget-boolean v0, p0, Lv52;->j:Z

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    iget-wide v3, p0, Lv52;->q:J

    .line 12
    .line 13
    sub-long/2addr p1, v3

    .line 14
    cmp-long v0, p1, v1

    .line 15
    .line 16
    if-gez v0, :cond_0

    .line 17
    .line 18
    move-wide p1, v1

    .line 19
    :cond_0
    long-to-double p1, p1

    .line 20
    iget v0, p0, Lv52;->y:F

    .line 21
    .line 22
    float-to-double v3, v0

    .line 23
    mul-double/2addr p1, v3

    .line 24
    double-to-long p1, p1

    .line 25
    goto :goto_0

    .line 26
    :cond_1
    move-wide p1, v1

    .line 27
    :goto_0
    iget-wide v3, p0, Lv52;->h:J

    .line 28
    .line 29
    add-long v5, v3, p1

    .line 30
    .line 31
    iget-wide p0, p0, Lv52;->i:J

    .line 32
    .line 33
    cmp-long p2, p0, v1

    .line 34
    .line 35
    if-gez p2, :cond_2

    .line 36
    .line 37
    move-wide v9, v1

    .line 38
    goto :goto_1

    .line 39
    :cond_2
    move-wide v9, p0

    .line 40
    :goto_1
    const-wide/16 v7, 0x0

    .line 41
    .line 42
    invoke-static/range {v5 .. v10}, Lgb;->n(JJJ)J

    .line 43
    .line 44
    .line 45
    move-result-wide p0

    .line 46
    return-wide p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lv52;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, Lv52;

    .line 12
    .line 13
    iget-boolean v1, p0, Lv52;->a:Z

    .line 14
    .line 15
    iget-boolean v3, p1, Lv52;->a:Z

    .line 16
    .line 17
    if-eq v1, v3, :cond_2

    .line 18
    .line 19
    return v2

    .line 20
    :cond_2
    iget-boolean v1, p0, Lv52;->b:Z

    .line 21
    .line 22
    iget-boolean v3, p1, Lv52;->b:Z

    .line 23
    .line 24
    if-eq v1, v3, :cond_3

    .line 25
    .line 26
    return v2

    .line 27
    :cond_3
    iget-object v1, p0, Lv52;->c:Ljava/lang/String;

    .line 28
    .line 29
    iget-object v3, p1, Lv52;->c:Ljava/lang/String;

    .line 30
    .line 31
    invoke-static {v1, v3}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-nez v1, :cond_4

    .line 36
    .line 37
    return v2

    .line 38
    :cond_4
    iget-object v1, p0, Lv52;->d:Ljava/lang/String;

    .line 39
    .line 40
    iget-object v3, p1, Lv52;->d:Ljava/lang/String;

    .line 41
    .line 42
    invoke-static {v1, v3}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-nez v1, :cond_5

    .line 47
    .line 48
    return v2

    .line 49
    :cond_5
    iget-object v1, p0, Lv52;->e:Ljava/lang/String;

    .line 50
    .line 51
    iget-object v3, p1, Lv52;->e:Ljava/lang/String;

    .line 52
    .line 53
    invoke-static {v1, v3}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-nez v1, :cond_6

    .line 58
    .line 59
    return v2

    .line 60
    :cond_6
    iget-object v1, p0, Lv52;->f:Ljava/lang/String;

    .line 61
    .line 62
    iget-object v3, p1, Lv52;->f:Ljava/lang/String;

    .line 63
    .line 64
    invoke-static {v1, v3}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    if-nez v1, :cond_7

    .line 69
    .line 70
    return v2

    .line 71
    :cond_7
    iget-object v1, p0, Lv52;->g:Ljava/lang/String;

    .line 72
    .line 73
    iget-object v3, p1, Lv52;->g:Ljava/lang/String;

    .line 74
    .line 75
    invoke-static {v1, v3}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    if-nez v1, :cond_8

    .line 80
    .line 81
    return v2

    .line 82
    :cond_8
    iget-wide v3, p0, Lv52;->h:J

    .line 83
    .line 84
    iget-wide v5, p1, Lv52;->h:J

    .line 85
    .line 86
    cmp-long v1, v3, v5

    .line 87
    .line 88
    if-eqz v1, :cond_9

    .line 89
    .line 90
    return v2

    .line 91
    :cond_9
    iget-wide v3, p0, Lv52;->i:J

    .line 92
    .line 93
    iget-wide v5, p1, Lv52;->i:J

    .line 94
    .line 95
    cmp-long v1, v3, v5

    .line 96
    .line 97
    if-eqz v1, :cond_a

    .line 98
    .line 99
    return v2

    .line 100
    :cond_a
    iget-boolean v1, p0, Lv52;->j:Z

    .line 101
    .line 102
    iget-boolean v3, p1, Lv52;->j:Z

    .line 103
    .line 104
    if-eq v1, v3, :cond_b

    .line 105
    .line 106
    return v2

    .line 107
    :cond_b
    iget-boolean v1, p0, Lv52;->k:Z

    .line 108
    .line 109
    iget-boolean v3, p1, Lv52;->k:Z

    .line 110
    .line 111
    if-eq v1, v3, :cond_c

    .line 112
    .line 113
    return v2

    .line 114
    :cond_c
    iget v1, p0, Lv52;->l:F

    .line 115
    .line 116
    iget v3, p1, Lv52;->l:F

    .line 117
    .line 118
    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    .line 119
    .line 120
    .line 121
    move-result v1

    .line 122
    if-eqz v1, :cond_d

    .line 123
    .line 124
    return v2

    .line 125
    :cond_d
    iget v1, p0, Lv52;->m:I

    .line 126
    .line 127
    iget v3, p1, Lv52;->m:I

    .line 128
    .line 129
    if-eq v1, v3, :cond_e

    .line 130
    .line 131
    return v2

    .line 132
    :cond_e
    iget v1, p0, Lv52;->n:I

    .line 133
    .line 134
    iget v3, p1, Lv52;->n:I

    .line 135
    .line 136
    if-eq v1, v3, :cond_f

    .line 137
    .line 138
    return v2

    .line 139
    :cond_f
    iget v1, p0, Lv52;->o:I

    .line 140
    .line 141
    iget v3, p1, Lv52;->o:I

    .line 142
    .line 143
    if-eq v1, v3, :cond_10

    .line 144
    .line 145
    return v2

    .line 146
    :cond_10
    iget v1, p0, Lv52;->p:I

    .line 147
    .line 148
    iget v3, p1, Lv52;->p:I

    .line 149
    .line 150
    if-eq v1, v3, :cond_11

    .line 151
    .line 152
    return v2

    .line 153
    :cond_11
    iget-wide v3, p0, Lv52;->q:J

    .line 154
    .line 155
    iget-wide v5, p1, Lv52;->q:J

    .line 156
    .line 157
    cmp-long v1, v3, v5

    .line 158
    .line 159
    if-eqz v1, :cond_12

    .line 160
    .line 161
    return v2

    .line 162
    :cond_12
    iget v1, p0, Lv52;->r:I

    .line 163
    .line 164
    iget v3, p1, Lv52;->r:I

    .line 165
    .line 166
    if-eq v1, v3, :cond_13

    .line 167
    .line 168
    return v2

    .line 169
    :cond_13
    iget-object v1, p0, Lv52;->s:Ljava/lang/String;

    .line 170
    .line 171
    iget-object v3, p1, Lv52;->s:Ljava/lang/String;

    .line 172
    .line 173
    invoke-static {v1, v3}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 174
    .line 175
    .line 176
    move-result v1

    .line 177
    if-nez v1, :cond_14

    .line 178
    .line 179
    return v2

    .line 180
    :cond_14
    iget-boolean v1, p0, Lv52;->t:Z

    .line 181
    .line 182
    iget-boolean v3, p1, Lv52;->t:Z

    .line 183
    .line 184
    if-eq v1, v3, :cond_15

    .line 185
    .line 186
    return v2

    .line 187
    :cond_15
    iget v1, p0, Lv52;->u:I

    .line 188
    .line 189
    iget v3, p1, Lv52;->u:I

    .line 190
    .line 191
    if-eq v1, v3, :cond_16

    .line 192
    .line 193
    return v2

    .line 194
    :cond_16
    iget-boolean v1, p0, Lv52;->v:Z

    .line 195
    .line 196
    iget-boolean v3, p1, Lv52;->v:Z

    .line 197
    .line 198
    if-eq v1, v3, :cond_17

    .line 199
    .line 200
    return v2

    .line 201
    :cond_17
    iget-boolean v1, p0, Lv52;->w:Z

    .line 202
    .line 203
    iget-boolean v3, p1, Lv52;->w:Z

    .line 204
    .line 205
    if-eq v1, v3, :cond_18

    .line 206
    .line 207
    return v2

    .line 208
    :cond_18
    iget-object v1, p0, Lv52;->x:Ljava/lang/String;

    .line 209
    .line 210
    iget-object v3, p1, Lv52;->x:Ljava/lang/String;

    .line 211
    .line 212
    invoke-static {v1, v3}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 213
    .line 214
    .line 215
    move-result v1

    .line 216
    if-nez v1, :cond_19

    .line 217
    .line 218
    return v2

    .line 219
    :cond_19
    iget v1, p0, Lv52;->y:F

    .line 220
    .line 221
    iget v3, p1, Lv52;->y:F

    .line 222
    .line 223
    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    .line 224
    .line 225
    .line 226
    move-result v1

    .line 227
    if-eqz v1, :cond_1a

    .line 228
    .line 229
    return v2

    .line 230
    :cond_1a
    iget v1, p0, Lv52;->z:F

    .line 231
    .line 232
    iget v3, p1, Lv52;->z:F

    .line 233
    .line 234
    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    .line 235
    .line 236
    .line 237
    move-result v1

    .line 238
    if-eqz v1, :cond_1b

    .line 239
    .line 240
    return v2

    .line 241
    :cond_1b
    iget-boolean v1, p0, Lv52;->A:Z

    .line 242
    .line 243
    iget-boolean v3, p1, Lv52;->A:Z

    .line 244
    .line 245
    if-eq v1, v3, :cond_1c

    .line 246
    .line 247
    return v2

    .line 248
    :cond_1c
    iget-boolean v1, p0, Lv52;->B:Z

    .line 249
    .line 250
    iget-boolean v3, p1, Lv52;->B:Z

    .line 251
    .line 252
    if-eq v1, v3, :cond_1d

    .line 253
    .line 254
    return v2

    .line 255
    :cond_1d
    iget-object p0, p0, Lv52;->C:Ljava/lang/String;

    .line 256
    .line 257
    iget-object p1, p1, Lv52;->C:Ljava/lang/String;

    .line 258
    .line 259
    invoke-static {p0, p1}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 260
    .line 261
    .line 262
    move-result p0

    .line 263
    if-nez p0, :cond_1e

    .line 264
    .line 265
    return v2

    .line 266
    :cond_1e
    return v0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-boolean v0, p0, Lv52;->a:Z

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x1f

    .line 8
    .line 9
    mul-int/2addr v0, v1

    .line 10
    iget-boolean v2, p0, Lv52;->b:Z

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, Lxa3;->c(IIZ)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, Lv52;->c:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v2, v0, v1}, Lf34;->e(Ljava/lang/String;II)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v2, p0, Lv52;->d:Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {v2, v0, v1}, Lf34;->e(Ljava/lang/String;II)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object v2, p0, Lv52;->e:Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {v2, v0, v1}, Lf34;->e(Ljava/lang/String;II)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-object v2, p0, Lv52;->f:Ljava/lang/String;

    .line 35
    .line 36
    invoke-static {v2, v0, v1}, Lf34;->e(Ljava/lang/String;II)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget-object v2, p0, Lv52;->g:Ljava/lang/String;

    .line 41
    .line 42
    invoke-static {v2, v0, v1}, Lf34;->e(Ljava/lang/String;II)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget-wide v2, p0, Lv52;->h:J

    .line 47
    .line 48
    invoke-static {v0, v1, v2, v3}, Lxa3;->b(IIJ)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    iget-wide v2, p0, Lv52;->i:J

    .line 53
    .line 54
    invoke-static {v0, v1, v2, v3}, Lxa3;->b(IIJ)I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    iget-boolean v2, p0, Lv52;->j:Z

    .line 59
    .line 60
    invoke-static {v0, v1, v2}, Lxa3;->c(IIZ)I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    iget-boolean v2, p0, Lv52;->k:Z

    .line 65
    .line 66
    invoke-static {v0, v1, v2}, Lxa3;->c(IIZ)I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    iget v2, p0, Lv52;->l:F

    .line 71
    .line 72
    invoke-static {v0, v2, v1}, Lb11;->d(IFI)I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    iget v2, p0, Lv52;->m:I

    .line 77
    .line 78
    invoke-static {v2, v0, v1}, Lf34;->d(III)I

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    iget v2, p0, Lv52;->n:I

    .line 83
    .line 84
    invoke-static {v2, v0, v1}, Lf34;->d(III)I

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    iget v2, p0, Lv52;->o:I

    .line 89
    .line 90
    invoke-static {v2, v0, v1}, Lf34;->d(III)I

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    iget v2, p0, Lv52;->p:I

    .line 95
    .line 96
    invoke-static {v2, v0, v1}, Lf34;->d(III)I

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    iget-wide v2, p0, Lv52;->q:J

    .line 101
    .line 102
    invoke-static {v0, v1, v2, v3}, Lxa3;->b(IIJ)I

    .line 103
    .line 104
    .line 105
    move-result v0

    .line 106
    iget v2, p0, Lv52;->r:I

    .line 107
    .line 108
    invoke-static {v2, v0, v1}, Lf34;->d(III)I

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    iget-object v2, p0, Lv52;->s:Ljava/lang/String;

    .line 113
    .line 114
    invoke-static {v2, v0, v1}, Lf34;->e(Ljava/lang/String;II)I

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    iget-boolean v2, p0, Lv52;->t:Z

    .line 119
    .line 120
    invoke-static {v0, v1, v2}, Lxa3;->c(IIZ)I

    .line 121
    .line 122
    .line 123
    move-result v0

    .line 124
    iget v2, p0, Lv52;->u:I

    .line 125
    .line 126
    invoke-static {v2, v0, v1}, Lf34;->d(III)I

    .line 127
    .line 128
    .line 129
    move-result v0

    .line 130
    iget-boolean v2, p0, Lv52;->v:Z

    .line 131
    .line 132
    invoke-static {v0, v1, v2}, Lxa3;->c(IIZ)I

    .line 133
    .line 134
    .line 135
    move-result v0

    .line 136
    iget-boolean v2, p0, Lv52;->w:Z

    .line 137
    .line 138
    invoke-static {v0, v1, v2}, Lxa3;->c(IIZ)I

    .line 139
    .line 140
    .line 141
    move-result v0

    .line 142
    iget-object v2, p0, Lv52;->x:Ljava/lang/String;

    .line 143
    .line 144
    invoke-static {v2, v0, v1}, Lf34;->e(Ljava/lang/String;II)I

    .line 145
    .line 146
    .line 147
    move-result v0

    .line 148
    iget v2, p0, Lv52;->y:F

    .line 149
    .line 150
    invoke-static {v0, v2, v1}, Lb11;->d(IFI)I

    .line 151
    .line 152
    .line 153
    move-result v0

    .line 154
    iget v2, p0, Lv52;->z:F

    .line 155
    .line 156
    invoke-static {v0, v2, v1}, Lb11;->d(IFI)I

    .line 157
    .line 158
    .line 159
    move-result v0

    .line 160
    iget-boolean v2, p0, Lv52;->A:Z

    .line 161
    .line 162
    invoke-static {v0, v1, v2}, Lxa3;->c(IIZ)I

    .line 163
    .line 164
    .line 165
    move-result v0

    .line 166
    iget-boolean v2, p0, Lv52;->B:Z

    .line 167
    .line 168
    invoke-static {v0, v1, v2}, Lxa3;->c(IIZ)I

    .line 169
    .line 170
    .line 171
    move-result v0

    .line 172
    iget-object p0, p0, Lv52;->C:Ljava/lang/String;

    .line 173
    .line 174
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 175
    .line 176
    .line 177
    move-result p0

    .line 178
    add-int/2addr p0, v0

    .line 179
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "LanRemoteState(active="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-boolean v1, p0, Lv52;->a:Z

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", connected="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-boolean v1, p0, Lv52;->b:Z

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", name="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v1, ", title="

    .line 29
    .line 30
    const-string v2, ", artist="

    .line 31
    .line 32
    iget-object v3, p0, Lv52;->c:Ljava/lang/String;

    .line 33
    .line 34
    iget-object v4, p0, Lv52;->d:Ljava/lang/String;

    .line 35
    .line 36
    invoke-static {v0, v3, v1, v4, v2}, Lf34;->n(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    const-string v1, ", album="

    .line 40
    .line 41
    const-string v2, ", coverId="

    .line 42
    .line 43
    iget-object v3, p0, Lv52;->e:Ljava/lang/String;

    .line 44
    .line 45
    iget-object v4, p0, Lv52;->f:Ljava/lang/String;

    .line 46
    .line 47
    invoke-static {v0, v3, v1, v4, v2}, Lf34;->n(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    iget-object v1, p0, Lv52;->g:Ljava/lang/String;

    .line 51
    .line 52
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    const-string v1, ", position="

    .line 56
    .line 57
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    iget-wide v1, p0, Lv52;->h:J

    .line 61
    .line 62
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    const-string v1, ", duration="

    .line 66
    .line 67
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    iget-wide v1, p0, Lv52;->i:J

    .line 71
    .line 72
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    const-string v1, ", playing="

    .line 76
    .line 77
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    iget-boolean v1, p0, Lv52;->j:Z

    .line 81
    .line 82
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    const-string v1, ", playWhenReady="

    .line 86
    .line 87
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    iget-boolean v1, p0, Lv52;->k:Z

    .line 91
    .line 92
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    const-string v1, ", volume="

    .line 96
    .line 97
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    iget v1, p0, Lv52;->l:F

    .line 101
    .line 102
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    const-string v1, ", deviceVolume="

    .line 106
    .line 107
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    iget v1, p0, Lv52;->m:I

    .line 111
    .line 112
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    const-string v1, ", deviceVolumeMax="

    .line 116
    .line 117
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    iget v1, p0, Lv52;->n:I

    .line 121
    .line 122
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    const-string v1, ", index="

    .line 126
    .line 127
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    iget v1, p0, Lv52;->o:I

    .line 131
    .line 132
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    const-string v1, ", count="

    .line 136
    .line 137
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    iget v1, p0, Lv52;->p:I

    .line 141
    .line 142
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    const-string v1, ", receivedAt="

    .line 146
    .line 147
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    iget-wide v1, p0, Lv52;->q:J

    .line 151
    .line 152
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    const-string v1, ", error="

    .line 156
    .line 157
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 158
    .line 159
    .line 160
    iget v1, p0, Lv52;->r:I

    .line 161
    .line 162
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 163
    .line 164
    .line 165
    const-string v1, ", revision="

    .line 166
    .line 167
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    iget-object v1, p0, Lv52;->s:Ljava/lang/String;

    .line 171
    .line 172
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    const-string v1, ", shuffle="

    .line 176
    .line 177
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 178
    .line 179
    .line 180
    iget-boolean v1, p0, Lv52;->t:Z

    .line 181
    .line 182
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 183
    .line 184
    .line 185
    const-string v1, ", repeat="

    .line 186
    .line 187
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 188
    .line 189
    .line 190
    iget v1, p0, Lv52;->u:I

    .line 191
    .line 192
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 193
    .line 194
    .line 195
    const-string v1, ", hasNext="

    .line 196
    .line 197
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 198
    .line 199
    .line 200
    iget-boolean v1, p0, Lv52;->v:Z

    .line 201
    .line 202
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 203
    .line 204
    .line 205
    const-string v1, ", hasPrevious="

    .line 206
    .line 207
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 208
    .line 209
    .line 210
    iget-boolean v1, p0, Lv52;->w:Z

    .line 211
    .line 212
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 213
    .line 214
    .line 215
    const-string v1, ", mediaId="

    .line 216
    .line 217
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 218
    .line 219
    .line 220
    iget-object v1, p0, Lv52;->x:Ljava/lang/String;

    .line 221
    .line 222
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 223
    .line 224
    .line 225
    const-string v1, ", speed="

    .line 226
    .line 227
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 228
    .line 229
    .line 230
    iget v1, p0, Lv52;->y:F

    .line 231
    .line 232
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 233
    .line 234
    .line 235
    const-string v1, ", pitch="

    .line 236
    .line 237
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 238
    .line 239
    .line 240
    iget v1, p0, Lv52;->z:F

    .line 241
    .line 242
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 243
    .line 244
    .line 245
    const-string v1, ", timerActive="

    .line 246
    .line 247
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 248
    .line 249
    .line 250
    iget-boolean v1, p0, Lv52;->A:Z

    .line 251
    .line 252
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 253
    .line 254
    .line 255
    const-string v1, ", timerEndOfTrack="

    .line 256
    .line 257
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 258
    .line 259
    .line 260
    iget-boolean v1, p0, Lv52;->B:Z

    .line 261
    .line 262
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 263
    .line 264
    .line 265
    const-string v1, ", timerRemaining="

    .line 266
    .line 267
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 268
    .line 269
    .line 270
    iget-object p0, p0, Lv52;->C:Ljava/lang/String;

    .line 271
    .line 272
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 273
    .line 274
    .line 275
    const-string p0, ")"

    .line 276
    .line 277
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 278
    .line 279
    .line 280
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    move-result-object p0

    .line 284
    return-object p0
.end method
