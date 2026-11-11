.class public abstract Lrx1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/lang/Object;

.field public final c:Ljava/io/Serializable;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 104
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    mul-int/lit8 v0, p1, 0x2

    .line 105
    new-array v0, v0, [F

    iput-object v0, p0, Lrx1;->b:Ljava/lang/Object;

    .line 106
    new-array p1, p1, [I

    iput-object p1, p0, Lrx1;->c:Ljava/io/Serializable;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Class;)V
    .locals 35

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iput-object v1, v0, Lrx1;->a:Ljava/lang/Object;

    .line 14
    .line 15
    new-instance v2, Ldd5;

    .line 16
    .line 17
    iget-object v1, v0, Lrx1;->a:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v1, Ljava/util/UUID;

    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v5

    .line 32
    const/16 v17, 0x0

    .line 33
    .line 34
    const/16 v27, 0x0

    .line 35
    .line 36
    const/4 v4, 0x0

    .line 37
    const/4 v6, 0x0

    .line 38
    const/4 v7, 0x0

    .line 39
    const/4 v8, 0x0

    .line 40
    const-wide/16 v9, 0x0

    .line 41
    .line 42
    const-wide/16 v11, 0x0

    .line 43
    .line 44
    const-wide/16 v13, 0x0

    .line 45
    .line 46
    const/4 v15, 0x0

    .line 47
    const/16 v16, 0x0

    .line 48
    .line 49
    const-wide/16 v18, 0x0

    .line 50
    .line 51
    const-wide/16 v20, 0x0

    .line 52
    .line 53
    const-wide/16 v22, 0x0

    .line 54
    .line 55
    const-wide/16 v24, 0x0

    .line 56
    .line 57
    const/16 v26, 0x0

    .line 58
    .line 59
    const/16 v28, 0x0

    .line 60
    .line 61
    const-wide/16 v29, 0x0

    .line 62
    .line 63
    const/16 v31, 0x0

    .line 64
    .line 65
    const/16 v32, 0x0

    .line 66
    .line 67
    const/16 v33, 0x0

    .line 68
    .line 69
    const v34, 0xfffffa

    .line 70
    .line 71
    .line 72
    invoke-direct/range {v2 .. v34}, Ldd5;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Loh0;Loh0;JJJLmc0;IIJJJJZIIJIILjava/lang/String;I)V

    .line 73
    .line 74
    .line 75
    iput-object v2, v0, Lrx1;->b:Ljava/lang/Object;

    .line 76
    .line 77
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    filled-new-array {v1}, [Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    new-instance v2, Ljava/util/LinkedHashSet;

    .line 86
    .line 87
    const/4 v3, 0x1

    .line 88
    invoke-static {v3}, Llg2;->W(I)I

    .line 89
    .line 90
    .line 91
    move-result v3

    .line 92
    invoke-direct {v2, v3}, Ljava/util/LinkedHashSet;-><init>(I)V

    .line 93
    .line 94
    .line 95
    const/4 v3, 0x0

    .line 96
    aget-object v1, v1, v3

    .line 97
    .line 98
    invoke-interface {v2, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    iput-object v2, v0, Lrx1;->c:Ljava/io/Serializable;

    .line 102
    .line 103
    return-void
.end method

.method public constructor <init>(Ls24;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrx1;->a:Ljava/lang/Object;

    .line 108
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p1, p0, Lrx1;->b:Ljava/lang/Object;

    .line 109
    new-instance p1, Lwc;

    const/16 v0, 0x19

    invoke-direct {p1, v0, p0}, Lwc;-><init>(ILjava/lang/Object;)V

    .line 110
    new-instance v0, Lrp4;

    invoke-direct {v0, p1}, Lrp4;-><init>(Lgf1;)V

    .line 111
    iput-object v0, p0, Lrx1;->c:Ljava/io/Serializable;

    return-void
.end method


# virtual methods
.method public a()Ldf1;
    .locals 4

    .line 1
    iget-object v0, p0, Lrx1;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ls24;

    .line 4
    .line 5
    invoke-virtual {v0}, Ls24;->a()V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lrx1;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    const/4 v3, 0x1

    .line 14
    invoke-virtual {v1, v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    iget-object p0, p0, Lrx1;->c:Ljava/io/Serializable;

    .line 21
    .line 22
    check-cast p0, Lrp4;

    .line 23
    .line 24
    invoke-virtual {p0}, Lrp4;->getValue()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    check-cast p0, Ldf1;

    .line 29
    .line 30
    return-object p0

    .line 31
    :cond_0
    invoke-virtual {p0}, Lrx1;->e()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Ls24;->a()V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Ls24;->b()V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Ls24;->j()Lso4;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-interface {v0}, Lso4;->z()Lwe1;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {v0, p0}, Lwe1;->j(Ljava/lang/String;)Ldf1;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0
.end method

.method public b()Lbd5;
    .locals 39

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual {v0}, Lrx1;->c()Lbd5;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-object v2, v0, Lrx1;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, Ldd5;

    .line 10
    .line 11
    iget-object v2, v2, Ldd5;->j:Lmc0;

    .line 12
    .line 13
    iget-object v3, v2, Lmc0;->i:Ljava/util/Set;

    .line 14
    .line 15
    check-cast v3, Ljava/util/Collection;

    .line 16
    .line 17
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    const/4 v4, 0x1

    .line 22
    const/4 v5, 0x0

    .line 23
    if-eqz v3, :cond_1

    .line 24
    .line 25
    iget-boolean v3, v2, Lmc0;->e:Z

    .line 26
    .line 27
    if-nez v3, :cond_1

    .line 28
    .line 29
    iget-boolean v3, v2, Lmc0;->c:Z

    .line 30
    .line 31
    if-nez v3, :cond_1

    .line 32
    .line 33
    iget-boolean v2, v2, Lmc0;->d:Z

    .line 34
    .line 35
    if-eqz v2, :cond_0

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    move v2, v5

    .line 39
    goto :goto_1

    .line 40
    :cond_1
    :goto_0
    move v2, v4

    .line 41
    :goto_1
    iget-object v3, v0, Lrx1;->b:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v3, Ldd5;

    .line 44
    .line 45
    iget-boolean v6, v3, Ldd5;->q:Z

    .line 46
    .line 47
    if-eqz v6, :cond_4

    .line 48
    .line 49
    const/4 v6, 0x0

    .line 50
    if-nez v2, :cond_3

    .line 51
    .line 52
    iget-wide v7, v3, Ldd5;->g:J

    .line 53
    .line 54
    const-wide/16 v9, 0x0

    .line 55
    .line 56
    cmp-long v2, v7, v9

    .line 57
    .line 58
    if-gtz v2, :cond_2

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_2
    const-string v0, "Expedited jobs cannot be delayed"

    .line 62
    .line 63
    invoke-static {v0}, Lkf2;->n(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    return-object v6

    .line 67
    :cond_3
    const-string v0, "Expedited jobs only support network and storage constraints"

    .line 68
    .line 69
    invoke-static {v0}, Lkf2;->n(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    return-object v6

    .line 73
    :cond_4
    :goto_2
    iget-object v2, v3, Ldd5;->x:Ljava/lang/String;

    .line 74
    .line 75
    if-nez v2, :cond_7

    .line 76
    .line 77
    iget-object v2, v3, Ldd5;->c:Ljava/lang/String;

    .line 78
    .line 79
    const-string v6, "."

    .line 80
    .line 81
    filled-new-array {v6}, [Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v6

    .line 85
    const/4 v7, 0x6

    .line 86
    invoke-static {v2, v6, v7}, Lqm4;->C0(Ljava/lang/CharSequence;[Ljava/lang/String;I)Ljava/util/List;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 91
    .line 92
    .line 93
    move-result v6

    .line 94
    if-ne v6, v4, :cond_5

    .line 95
    .line 96
    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    check-cast v2, Ljava/lang/String;

    .line 101
    .line 102
    goto :goto_3

    .line 103
    :cond_5
    invoke-static {v2}, Lq40;->C0(Ljava/util/List;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    check-cast v2, Ljava/lang/String;

    .line 108
    .line 109
    :goto_3
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 110
    .line 111
    .line 112
    move-result v4

    .line 113
    const/16 v5, 0x7f

    .line 114
    .line 115
    if-gt v4, v5, :cond_6

    .line 116
    .line 117
    goto :goto_4

    .line 118
    :cond_6
    invoke-static {v5, v2}, Lqm4;->J0(ILjava/lang/String;)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    :goto_4
    iput-object v2, v3, Ldd5;->x:Ljava/lang/String;

    .line 123
    .line 124
    :cond_7
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 125
    .line 126
    .line 127
    move-result-object v2

    .line 128
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    iput-object v2, v0, Lrx1;->a:Ljava/lang/Object;

    .line 132
    .line 133
    new-instance v3, Ldd5;

    .line 134
    .line 135
    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v4

    .line 139
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 140
    .line 141
    .line 142
    iget-object v2, v0, Lrx1;->b:Ljava/lang/Object;

    .line 143
    .line 144
    check-cast v2, Ldd5;

    .line 145
    .line 146
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 147
    .line 148
    .line 149
    iget-object v6, v2, Ldd5;->c:Ljava/lang/String;

    .line 150
    .line 151
    iget v5, v2, Ldd5;->b:I

    .line 152
    .line 153
    iget-object v7, v2, Ldd5;->d:Ljava/lang/String;

    .line 154
    .line 155
    new-instance v8, Loh0;

    .line 156
    .line 157
    iget-object v9, v2, Ldd5;->e:Loh0;

    .line 158
    .line 159
    invoke-direct {v8, v9}, Loh0;-><init>(Loh0;)V

    .line 160
    .line 161
    .line 162
    new-instance v9, Loh0;

    .line 163
    .line 164
    iget-object v10, v2, Ldd5;->f:Loh0;

    .line 165
    .line 166
    invoke-direct {v9, v10}, Loh0;-><init>(Loh0;)V

    .line 167
    .line 168
    .line 169
    iget-wide v10, v2, Ldd5;->g:J

    .line 170
    .line 171
    iget-wide v12, v2, Ldd5;->h:J

    .line 172
    .line 173
    iget-wide v14, v2, Ldd5;->i:J

    .line 174
    .line 175
    move-object/from16 v36, v1

    .line 176
    .line 177
    new-instance v1, Lmc0;

    .line 178
    .line 179
    move-object/from16 v16, v3

    .line 180
    .line 181
    iget-object v3, v2, Ldd5;->j:Lmc0;

    .line 182
    .line 183
    invoke-direct {v1, v3}, Lmc0;-><init>(Lmc0;)V

    .line 184
    .line 185
    .line 186
    iget v3, v2, Ldd5;->k:I

    .line 187
    .line 188
    move-object/from16 v17, v1

    .line 189
    .line 190
    iget v1, v2, Ldd5;->l:I

    .line 191
    .line 192
    move/from16 v19, v3

    .line 193
    .line 194
    move-object/from16 v18, v4

    .line 195
    .line 196
    iget-wide v3, v2, Ldd5;->m:J

    .line 197
    .line 198
    move-wide/from16 v20, v3

    .line 199
    .line 200
    iget-wide v3, v2, Ldd5;->n:J

    .line 201
    .line 202
    move-wide/from16 v22, v3

    .line 203
    .line 204
    iget-wide v3, v2, Ldd5;->o:J

    .line 205
    .line 206
    move-wide/from16 v24, v3

    .line 207
    .line 208
    iget-wide v3, v2, Ldd5;->p:J

    .line 209
    .line 210
    move/from16 v26, v1

    .line 211
    .line 212
    iget-boolean v1, v2, Ldd5;->q:Z

    .line 213
    .line 214
    move/from16 v27, v1

    .line 215
    .line 216
    iget v1, v2, Ldd5;->r:I

    .line 217
    .line 218
    move/from16 v28, v1

    .line 219
    .line 220
    iget v1, v2, Ldd5;->s:I

    .line 221
    .line 222
    move-wide/from16 v29, v3

    .line 223
    .line 224
    iget-wide v3, v2, Ldd5;->u:J

    .line 225
    .line 226
    move/from16 v31, v1

    .line 227
    .line 228
    iget v1, v2, Ldd5;->v:I

    .line 229
    .line 230
    move/from16 v32, v1

    .line 231
    .line 232
    iget v1, v2, Ldd5;->w:I

    .line 233
    .line 234
    iget-object v2, v2, Ldd5;->x:Ljava/lang/String;

    .line 235
    .line 236
    const/high16 v35, 0x80000

    .line 237
    .line 238
    move/from16 v33, v1

    .line 239
    .line 240
    move-object/from16 v34, v2

    .line 241
    .line 242
    move-wide/from16 v37, v3

    .line 243
    .line 244
    move-object/from16 v3, v16

    .line 245
    .line 246
    move-object/from16 v16, v17

    .line 247
    .line 248
    move-object/from16 v4, v18

    .line 249
    .line 250
    move/from16 v17, v19

    .line 251
    .line 252
    move-wide/from16 v19, v20

    .line 253
    .line 254
    move-wide/from16 v21, v22

    .line 255
    .line 256
    move-wide/from16 v23, v24

    .line 257
    .line 258
    move/from16 v18, v26

    .line 259
    .line 260
    move-wide/from16 v25, v29

    .line 261
    .line 262
    move/from16 v29, v31

    .line 263
    .line 264
    move-wide/from16 v30, v37

    .line 265
    .line 266
    invoke-direct/range {v3 .. v35}, Ldd5;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Loh0;Loh0;JJJLmc0;IIJJJJZIIJIILjava/lang/String;I)V

    .line 267
    .line 268
    .line 269
    iput-object v3, v0, Lrx1;->b:Ljava/lang/Object;

    .line 270
    .line 271
    return-object v36
.end method

.method public abstract c()Lbd5;
.end method

.method public abstract d()V
.end method

.method public abstract e()Ljava/lang/String;
.end method

.method public abstract f()V
.end method

.method public abstract g(Lhq;)V
.end method

.method public h(Ldf1;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lrx1;->c:Ljava/io/Serializable;

    .line 5
    .line 6
    check-cast v0, Lrp4;

    .line 7
    .line 8
    invoke-virtual {v0}, Lrp4;->getValue()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Ldf1;

    .line 13
    .line 14
    if-ne p1, v0, :cond_0

    .line 15
    .line 16
    iget-object p0, p0, Lrx1;->b:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 19
    .line 20
    const/4 p1, 0x0

    .line 21
    invoke-virtual {p0, p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void
.end method

.method public abstract i()V
.end method

.method public abstract j()V
.end method

.method public abstract k()V
.end method
