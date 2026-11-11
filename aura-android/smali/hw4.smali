.class public final Lhw4;
.super Lir2;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final f:Law;

.field public g:Lsk4;


# direct methods
.method public constructor <init>(Lg74;Lq70;Loo0;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lir2;-><init>(Lg74;Lwf1;Loo0;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    const/4 p2, 0x6

    .line 6
    const p3, 0x7fffffff

    .line 7
    .line 8
    .line 9
    invoke-static {p3, p2, p1}, Lsu3;->a(IILwv;)Law;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iput-object p1, p0, Lhw4;->f:Law;

    .line 14
    .line 15
    return-void
.end method

.method public static final E(Lhw4;Lg74;Lfw4;Lwd0;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p2

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iget-object v3, v1, Lir2;->e:Ljava/lang/Object;

    .line 11
    .line 12
    move-object v6, v3

    .line 13
    check-cast v6, Lrf2;

    .line 14
    .line 15
    instance-of v3, v2, Lgw4;

    .line 16
    .line 17
    if-eqz v3, :cond_0

    .line 18
    .line 19
    move-object v3, v2

    .line 20
    check-cast v3, Lgw4;

    .line 21
    .line 22
    iget v4, v3, Lgw4;->p:I

    .line 23
    .line 24
    const/high16 v5, -0x80000000

    .line 25
    .line 26
    and-int v7, v4, v5

    .line 27
    .line 28
    if-eqz v7, :cond_0

    .line 29
    .line 30
    sub-int/2addr v4, v5

    .line 31
    iput v4, v3, Lgw4;->p:I

    .line 32
    .line 33
    :goto_0
    move-object v7, v3

    .line 34
    goto :goto_1

    .line 35
    :cond_0
    new-instance v3, Lgw4;

    .line 36
    .line 37
    invoke-direct {v3, v1, v2}, Lgw4;-><init>(Lhw4;Lwd0;)V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :goto_1
    iget-object v2, v7, Lgw4;->n:Ljava/lang/Object;

    .line 42
    .line 43
    iget v3, v7, Lgw4;->p:I

    .line 44
    .line 45
    const/4 v8, 0x2

    .line 46
    const/4 v9, 0x1

    .line 47
    sget-object v10, Lxe0;->n:Lxe0;

    .line 48
    .line 49
    if-eqz v3, :cond_3

    .line 50
    .line 51
    if-eq v3, v9, :cond_2

    .line 52
    .line 53
    if-ne v3, v8, :cond_1

    .line 54
    .line 55
    invoke-static {v2}, Lkb4;->X(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    goto/16 :goto_4

    .line 59
    .line 60
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 61
    .line 62
    invoke-static {v0}, Lkf2;->o(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    const/4 v0, 0x0

    .line 66
    return-object v0

    .line 67
    :cond_2
    invoke-static {v2}, Lkb4;->X(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_3
    invoke-static {v2}, Lkb4;->X(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    new-instance v3, Ljx3;

    .line 75
    .line 76
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 77
    .line 78
    .line 79
    iput-object v0, v3, Ljx3;->n:Ljava/lang/Object;

    .line 80
    .line 81
    iget-wide v4, v0, Lfw4;->b:J

    .line 82
    .line 83
    iget-wide v11, v0, Lfw4;->a:J

    .line 84
    .line 85
    iget-object v0, v6, Lrf2;->n:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast v0, Lm45;

    .line 88
    .line 89
    const/16 v2, 0x20

    .line 90
    .line 91
    shr-long v13, v11, v2

    .line 92
    .line 93
    long-to-int v13, v13

    .line 94
    invoke-static {v13}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 95
    .line 96
    .line 97
    move-result v13

    .line 98
    invoke-virtual {v0, v4, v5, v13}, Lm45;->a(JF)V

    .line 99
    .line 100
    .line 101
    iget-object v0, v6, Lrf2;->o:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast v0, Lm45;

    .line 104
    .line 105
    const-wide v13, 0xffffffffL

    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    and-long/2addr v11, v13

    .line 111
    long-to-int v11, v11

    .line 112
    invoke-static {v11}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 113
    .line 114
    .line 115
    move-result v11

    .line 116
    invoke-virtual {v0, v4, v5, v11}, Lm45;->a(JF)V

    .line 117
    .line 118
    .line 119
    iget-object v0, v1, Lhw4;->f:Law;

    .line 120
    .line 121
    invoke-static {v0}, Lhw4;->G(Law;)Lfw4;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    if-eqz v0, :cond_4

    .line 126
    .line 127
    iget-wide v4, v0, Lfw4;->b:J

    .line 128
    .line 129
    iget-wide v11, v0, Lfw4;->a:J

    .line 130
    .line 131
    iget-object v15, v6, Lrf2;->n:Ljava/lang/Object;

    .line 132
    .line 133
    check-cast v15, Lm45;

    .line 134
    .line 135
    move-wide/from16 p2, v13

    .line 136
    .line 137
    shr-long v13, v11, v2

    .line 138
    .line 139
    long-to-int v2, v13

    .line 140
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 141
    .line 142
    .line 143
    move-result v2

    .line 144
    invoke-virtual {v15, v4, v5, v2}, Lm45;->a(JF)V

    .line 145
    .line 146
    .line 147
    iget-object v2, v6, Lrf2;->o:Ljava/lang/Object;

    .line 148
    .line 149
    check-cast v2, Lm45;

    .line 150
    .line 151
    and-long v11, v11, p2

    .line 152
    .line 153
    long-to-int v11, v11

    .line 154
    invoke-static {v11}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 155
    .line 156
    .line 157
    move-result v11

    .line 158
    invoke-virtual {v2, v4, v5, v11}, Lm45;->a(JF)V

    .line 159
    .line 160
    .line 161
    iget-object v2, v3, Ljx3;->n:Ljava/lang/Object;

    .line 162
    .line 163
    check-cast v2, Lfw4;

    .line 164
    .line 165
    invoke-virtual {v2, v0}, Lfw4;->a(Lfw4;)Lfw4;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    iput-object v0, v3, Ljx3;->n:Ljava/lang/Object;

    .line 170
    .line 171
    :cond_4
    new-instance v0, Lqv3;

    .line 172
    .line 173
    const/4 v4, 0x0

    .line 174
    const/4 v5, 0x2

    .line 175
    move-object/from16 v2, p1

    .line 176
    .line 177
    invoke-direct/range {v0 .. v5}, Lqv3;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lvd0;I)V

    .line 178
    .line 179
    .line 180
    iput v9, v7, Lgw4;->p:I

    .line 181
    .line 182
    invoke-virtual {v1, v0, v7}, Lir2;->D(Lwf1;Lwd0;)Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    if-ne v0, v10, :cond_5

    .line 187
    .line 188
    goto :goto_3

    .line 189
    :cond_5
    :goto_2
    iget-object v0, v1, Lir2;->c:Ljava/lang/Object;

    .line 190
    .line 191
    check-cast v0, Lwf1;

    .line 192
    .line 193
    iget-object v1, v6, Lrf2;->n:Ljava/lang/Object;

    .line 194
    .line 195
    check-cast v1, Lm45;

    .line 196
    .line 197
    const v2, 0x7f7fffff    # Float.MAX_VALUE

    .line 198
    .line 199
    .line 200
    invoke-virtual {v1, v2}, Lm45;->b(F)F

    .line 201
    .line 202
    .line 203
    move-result v1

    .line 204
    iget-object v3, v6, Lrf2;->o:Ljava/lang/Object;

    .line 205
    .line 206
    check-cast v3, Lm45;

    .line 207
    .line 208
    invoke-virtual {v3, v2}, Lm45;->b(F)F

    .line 209
    .line 210
    .line 211
    move-result v2

    .line 212
    invoke-static {v1, v2}, Le35;->h(FF)J

    .line 213
    .line 214
    .line 215
    move-result-wide v1

    .line 216
    new-instance v3, Lk45;

    .line 217
    .line 218
    invoke-direct {v3, v1, v2}, Lk45;-><init>(J)V

    .line 219
    .line 220
    .line 221
    iput v8, v7, Lgw4;->p:I

    .line 222
    .line 223
    invoke-interface {v0, v3, v7}, Lwf1;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v0

    .line 227
    if-ne v0, v10, :cond_6

    .line 228
    .line 229
    :goto_3
    return-object v10

    .line 230
    :cond_6
    :goto_4
    sget-object v0, Lj15;->a:Lj15;

    .line 231
    .line 232
    return-object v0
.end method

.method public static G(Law;)Lfw4;
    .locals 2

    .line 1
    new-instance v0, Lby2;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, p0, v1}, Lby2;-><init>(Ly00;I)V

    .line 5
    .line 6
    .line 7
    new-instance p0, Lkb1;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-direct {p0, v0, v1}, Lkb1;-><init>(Lgf1;Lvd0;)V

    .line 11
    .line 12
    .line 13
    invoke-static {p0}, Lsi0;->C(Lwf1;)Lba4;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    :goto_0
    invoke-virtual {p0}, Lba4;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    invoke-virtual {p0}, Lba4;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, Lfw4;

    .line 28
    .line 29
    if-nez v1, :cond_0

    .line 30
    .line 31
    :goto_1
    move-object v1, v0

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    invoke-virtual {v1, v0}, Lfw4;->a(Lfw4;)Lfw4;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    goto :goto_1

    .line 38
    :cond_1
    return-object v1
.end method


# virtual methods
.method public final F(Lkn3;)Z
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Lir2;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, Lg74;

    .line 8
    .line 9
    iget-object v3, v1, Lkn3;->a:Ljava/util/List;

    .line 10
    .line 11
    invoke-static {v3}, Lq40;->x0(Ljava/util/List;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    check-cast v3, Lon3;

    .line 16
    .line 17
    if-eqz v3, :cond_9

    .line 18
    .line 19
    invoke-virtual {v3}, Lon3;->b()Ljava/util/List;

    .line 20
    .line 21
    .line 22
    move-result-object v6

    .line 23
    invoke-interface {v6}, Ljava/util/Collection;->size()I

    .line 24
    .line 25
    .line 26
    move-result v7

    .line 27
    const/4 v8, 0x0

    .line 28
    const/4 v9, 0x0

    .line 29
    :goto_0
    const/4 v10, 0x0

    .line 30
    iget-object v11, v0, Lhw4;->f:Law;

    .line 31
    .line 32
    const-wide v12, -0x7fffffff80000000L    # -1.0609978955E-314

    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    if-ge v8, v7, :cond_4

    .line 38
    .line 39
    invoke-interface {v6, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v14

    .line 43
    check-cast v14, Lbm1;

    .line 44
    .line 45
    const/4 v15, 0x1

    .line 46
    const/16 v16, 0x0

    .line 47
    .line 48
    iget-wide v4, v14, Lbm1;->d:J

    .line 49
    .line 50
    xor-long/2addr v4, v12

    .line 51
    invoke-virtual {v2, v4, v5}, Lg74;->f(J)J

    .line 52
    .line 53
    .line 54
    move-result-wide v12

    .line 55
    invoke-virtual {v2, v12, v13}, Lg74;->j(J)F

    .line 56
    .line 57
    .line 58
    move-result v12

    .line 59
    cmpg-float v10, v12, v10

    .line 60
    .line 61
    if-nez v10, :cond_0

    .line 62
    .line 63
    move v10, v15

    .line 64
    goto :goto_1

    .line 65
    :cond_0
    move/from16 v10, v16

    .line 66
    .line 67
    :goto_1
    if-nez v10, :cond_3

    .line 68
    .line 69
    new-instance v17, Lfw4;

    .line 70
    .line 71
    iget-wide v12, v14, Lbm1;->a:J

    .line 72
    .line 73
    const/16 v22, 0x0

    .line 74
    .line 75
    move-wide/from16 v18, v4

    .line 76
    .line 77
    move-wide/from16 v20, v12

    .line 78
    .line 79
    invoke-direct/range {v17 .. v22}, Lfw4;-><init>(JJZ)V

    .line 80
    .line 81
    .line 82
    move-object/from16 v4, v17

    .line 83
    .line 84
    invoke-interface {v11, v4}, Ly94;->d(Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v4

    .line 88
    instance-of v4, v4, Li10;

    .line 89
    .line 90
    if-eqz v4, :cond_2

    .line 91
    .line 92
    if-eqz v9, :cond_1

    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_1
    move/from16 v9, v16

    .line 96
    .line 97
    goto :goto_3

    .line 98
    :cond_2
    :goto_2
    move v9, v15

    .line 99
    :cond_3
    :goto_3
    add-int/lit8 v8, v8, 0x1

    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_4
    const/4 v15, 0x1

    .line 103
    const/16 v16, 0x0

    .line 104
    .line 105
    iget-wide v4, v3, Lon3;->l:J

    .line 106
    .line 107
    xor-long/2addr v4, v12

    .line 108
    iget v1, v1, Lkn3;->c:I

    .line 109
    .line 110
    const/16 v6, 0xc

    .line 111
    .line 112
    if-ne v1, v6, :cond_5

    .line 113
    .line 114
    move/from16 v22, v15

    .line 115
    .line 116
    goto :goto_4

    .line 117
    :cond_5
    move/from16 v22, v16

    .line 118
    .line 119
    :goto_4
    invoke-virtual {v2, v4, v5}, Lg74;->f(J)J

    .line 120
    .line 121
    .line 122
    move-result-wide v6

    .line 123
    invoke-virtual {v2, v6, v7}, Lg74;->j(J)F

    .line 124
    .line 125
    .line 126
    move-result v1

    .line 127
    cmpg-float v1, v1, v10

    .line 128
    .line 129
    if-nez v1, :cond_6

    .line 130
    .line 131
    move v1, v15

    .line 132
    goto :goto_5

    .line 133
    :cond_6
    move/from16 v1, v16

    .line 134
    .line 135
    :goto_5
    if-eqz v1, :cond_7

    .line 136
    .line 137
    if-eqz v22, :cond_b

    .line 138
    .line 139
    :cond_7
    new-instance v17, Lfw4;

    .line 140
    .line 141
    iget-wide v1, v3, Lon3;->b:J

    .line 142
    .line 143
    move-wide/from16 v20, v1

    .line 144
    .line 145
    move-wide/from16 v18, v4

    .line 146
    .line 147
    invoke-direct/range {v17 .. v22}, Lfw4;-><init>(JJZ)V

    .line 148
    .line 149
    .line 150
    move-object/from16 v1, v17

    .line 151
    .line 152
    invoke-interface {v11, v1}, Ly94;->d(Ljava/lang/Object;)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v1

    .line 156
    instance-of v1, v1, Li10;

    .line 157
    .line 158
    if-eqz v1, :cond_8

    .line 159
    .line 160
    if-eqz v9, :cond_a

    .line 161
    .line 162
    :cond_8
    move v9, v15

    .line 163
    goto :goto_6

    .line 164
    :cond_9
    const/4 v15, 0x1

    .line 165
    const/16 v16, 0x0

    .line 166
    .line 167
    :cond_a
    move/from16 v9, v16

    .line 168
    .line 169
    :cond_b
    :goto_6
    if-nez v9, :cond_d

    .line 170
    .line 171
    iget-boolean v0, v0, Lir2;->a:Z

    .line 172
    .line 173
    if-eqz v0, :cond_c

    .line 174
    .line 175
    goto :goto_7

    .line 176
    :cond_c
    return v16

    .line 177
    :cond_d
    :goto_7
    return v15
.end method
