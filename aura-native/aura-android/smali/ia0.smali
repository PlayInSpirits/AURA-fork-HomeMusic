.class public final Lia0;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lfa0;


# instance fields
.field public final n:Lwn3;

.field public final o:Lwn3;

.field public final p:Ljava/lang/ThreadLocal;

.field public final q:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final r:J


# direct methods
.method public constructor <init>(Lrf2;)V
    .locals 3

    .line 67
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 68
    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    iput-object v0, p0, Lia0;->p:Ljava/lang/ThreadLocal;

    .line 69
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lia0;->q:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 70
    sget-object v0, Lmx0;->n:Lom0;

    const/16 v0, 0x1e

    invoke-static {v0}, Le35;->V(I)J

    move-result-wide v0

    iput-wide v0, p0, Lia0;->r:J

    .line 71
    new-instance v0, Lwn3;

    new-instance v1, Lwc;

    const/4 v2, 0x3

    invoke-direct {v1, v2, p1}, Lwc;-><init>(ILjava/lang/Object;)V

    const/4 p1, 0x1

    invoke-direct {v0, p1, v1}, Lwn3;-><init>(ILgf1;)V

    iput-object v0, p0, Lia0;->n:Lwn3;

    .line 72
    iput-object v0, p0, Lia0;->o:Lwn3;

    return-void
.end method

.method public constructor <init>(Lrf2;Ljava/lang/String;I)V
    .locals 4

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    new-instance v0, Ljava/lang/ThreadLocal;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lia0;->p:Ljava/lang/ThreadLocal;

    .line 13
    .line 14
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lia0;->q:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 21
    .line 22
    sget-object v0, Lmx0;->n:Lom0;

    .line 23
    .line 24
    const/16 v0, 0x1e

    .line 25
    .line 26
    invoke-static {v0}, Le35;->V(I)J

    .line 27
    .line 28
    .line 29
    move-result-wide v2

    .line 30
    iput-wide v2, p0, Lia0;->r:J

    .line 31
    .line 32
    if-lez p3, :cond_0

    .line 33
    .line 34
    new-instance v0, Lwn3;

    .line 35
    .line 36
    new-instance v2, Lga0;

    .line 37
    .line 38
    invoke-direct {v2, p1, p2, v1}, Lga0;-><init>(Lrf2;Ljava/lang/String;I)V

    .line 39
    .line 40
    .line 41
    invoke-direct {v0, p3, v2}, Lwn3;-><init>(ILgf1;)V

    .line 42
    .line 43
    .line 44
    iput-object v0, p0, Lia0;->n:Lwn3;

    .line 45
    .line 46
    new-instance p3, Lwn3;

    .line 47
    .line 48
    new-instance v0, Lga0;

    .line 49
    .line 50
    const/4 v1, 0x1

    .line 51
    invoke-direct {v0, p1, p2, v1}, Lga0;-><init>(Lrf2;Ljava/lang/String;I)V

    .line 52
    .line 53
    .line 54
    invoke-direct {p3, v1, v0}, Lwn3;-><init>(ILgf1;)V

    .line 55
    .line 56
    .line 57
    iput-object p3, p0, Lia0;->o:Lwn3;

    .line 58
    .line 59
    return-void

    .line 60
    :cond_0
    const-string p0, "Maximum number of readers must be greater than 0"

    .line 61
    .line 62
    invoke-static {p0}, Lkf2;->n(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    const/4 p0, 0x0

    .line 66
    throw p0
.end method


# virtual methods
.method public final b(Z)V
    .locals 3

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    const-string p1, "reader"

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    const-string p1, "writer"

    .line 7
    .line 8
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 11
    .line 12
    .line 13
    new-instance v1, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    const-string v2, "Timed out attempting to acquire a "

    .line 16
    .line 17
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string p1, " connection."

    .line 24
    .line 25
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string p1, "\n\nWriter pool:\n"

    .line 36
    .line 37
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    iget-object p1, p0, Lia0;->o:Lwn3;

    .line 41
    .line 42
    invoke-virtual {p1, v0}, Lwn3;->c(Ljava/lang/StringBuilder;)V

    .line 43
    .line 44
    .line 45
    const-string p1, "Reader pool:"

    .line 46
    .line 47
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    const/16 p1, 0xa

    .line 51
    .line 52
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    iget-object p0, p0, Lia0;->n:Lwn3;

    .line 56
    .line 57
    invoke-virtual {p0, v0}, Lwn3;->c(Ljava/lang/StringBuilder;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    const/4 p1, 0x5

    .line 65
    invoke-static {p1, p0}, Lh12;->P(ILjava/lang/String;)V

    .line 66
    .line 67
    .line 68
    const/4 p0, 0x0

    .line 69
    throw p0
.end method

.method public final close()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    iget-object v2, p0, Lia0;->q:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 4
    .line 5
    invoke-virtual {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lia0;->n:Lwn3;

    .line 12
    .line 13
    invoke-virtual {v0}, Lwn3;->b()V

    .line 14
    .line 15
    .line 16
    iget-object p0, p0, Lia0;->o:Lwn3;

    .line 17
    .line 18
    invoke-virtual {p0}, Lwn3;->b()V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void
.end method

.method public final k(ZLwf1;Lwd0;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v3, p2

    .line 6
    .line 7
    move-object/from16 v0, p3

    .line 8
    .line 9
    instance-of v4, v0, Lha0;

    .line 10
    .line 11
    if-eqz v4, :cond_0

    .line 12
    .line 13
    move-object v4, v0

    .line 14
    check-cast v4, Lha0;

    .line 15
    .line 16
    iget v5, v4, Lha0;->w:I

    .line 17
    .line 18
    const/high16 v6, -0x80000000

    .line 19
    .line 20
    and-int v7, v5, v6

    .line 21
    .line 22
    if-eqz v7, :cond_0

    .line 23
    .line 24
    sub-int/2addr v5, v6

    .line 25
    iput v5, v4, Lha0;->w:I

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    new-instance v4, Lha0;

    .line 29
    .line 30
    invoke-direct {v4, v1, v0}, Lha0;-><init>(Lia0;Lwd0;)V

    .line 31
    .line 32
    .line 33
    :goto_0
    iget-object v0, v4, Lha0;->u:Ljava/lang/Object;

    .line 34
    .line 35
    iget v5, v4, Lha0;->w:I

    .line 36
    .line 37
    const-string v6, "ROLLBACK TRANSACTION"

    .line 38
    .line 39
    const/4 v8, 0x4

    .line 40
    const/4 v9, 0x3

    .line 41
    const/4 v10, 0x2

    .line 42
    const/4 v11, 0x1

    .line 43
    const/4 v12, 0x0

    .line 44
    sget-object v13, Lxe0;->n:Lxe0;

    .line 45
    .line 46
    if-eqz v5, :cond_5

    .line 47
    .line 48
    if-eq v5, v11, :cond_4

    .line 49
    .line 50
    if-eq v5, v10, :cond_3

    .line 51
    .line 52
    if-eq v5, v9, :cond_2

    .line 53
    .line 54
    if-ne v5, v8, :cond_1

    .line 55
    .line 56
    iget-object v1, v4, Lha0;->o:Ljava/io/Serializable;

    .line 57
    .line 58
    check-cast v1, Ljx3;

    .line 59
    .line 60
    iget-object v2, v4, Lha0;->n:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v2, Lwn3;

    .line 63
    .line 64
    :try_start_0
    invoke-static {v0}, Lkb4;->X(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 65
    .line 66
    .line 67
    goto/16 :goto_c

    .line 68
    .line 69
    :catchall_0
    move-exception v0

    .line 70
    move-object v10, v1

    .line 71
    :goto_1
    move-object v1, v0

    .line 72
    goto/16 :goto_d

    .line 73
    .line 74
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 75
    .line 76
    invoke-static {v0}, Lkf2;->o(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    return-object v12

    .line 80
    :cond_2
    iget-boolean v1, v4, Lha0;->t:Z

    .line 81
    .line 82
    iget-object v2, v4, Lha0;->s:Ljx3;

    .line 83
    .line 84
    iget-object v3, v4, Lha0;->r:Lne0;

    .line 85
    .line 86
    iget-object v5, v4, Lha0;->q:Ljx3;

    .line 87
    .line 88
    iget-object v9, v4, Lha0;->p:Lwn3;

    .line 89
    .line 90
    iget-object v10, v4, Lha0;->o:Ljava/io/Serializable;

    .line 91
    .line 92
    check-cast v10, Lwf1;

    .line 93
    .line 94
    iget-object v14, v4, Lha0;->n:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v14, Lia0;

    .line 97
    .line 98
    :try_start_1
    invoke-static {v0}, Lkb4;->X(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 99
    .line 100
    .line 101
    move-object v0, v3

    .line 102
    move-object v3, v10

    .line 103
    goto/16 :goto_6

    .line 104
    .line 105
    :catchall_1
    move-exception v0

    .line 106
    move-object v15, v2

    .line 107
    move v2, v1

    .line 108
    move-object v1, v14

    .line 109
    move-object v14, v3

    .line 110
    move-object v3, v10

    .line 111
    goto/16 :goto_7

    .line 112
    .line 113
    :cond_3
    invoke-static {v0}, Lkb4;->X(Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    return-object v0

    .line 117
    :cond_4
    invoke-static {v0}, Lkb4;->X(Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    return-object v0

    .line 121
    :cond_5
    invoke-static {v0}, Lkb4;->X(Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    iget-object v0, v1, Lia0;->q:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 125
    .line 126
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 127
    .line 128
    .line 129
    move-result v0

    .line 130
    if-nez v0, :cond_1a

    .line 131
    .line 132
    iget-object v0, v1, Lia0;->p:Ljava/lang/ThreadLocal;

    .line 133
    .line 134
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v5

    .line 138
    check-cast v5, Lgo3;

    .line 139
    .line 140
    sget-object v14, Lda0;->o:Li80;

    .line 141
    .line 142
    if-nez v5, :cond_7

    .line 143
    .line 144
    invoke-interface {v4}, Lvd0;->getContext()Lne0;

    .line 145
    .line 146
    .line 147
    move-result-object v5

    .line 148
    invoke-interface {v5, v14}, Lne0;->K(Lme0;)Lle0;

    .line 149
    .line 150
    .line 151
    move-result-object v5

    .line 152
    check-cast v5, Lda0;

    .line 153
    .line 154
    if-eqz v5, :cond_6

    .line 155
    .line 156
    iget-object v5, v5, Lda0;->n:Lgo3;

    .line 157
    .line 158
    goto :goto_2

    .line 159
    :cond_6
    move-object v5, v12

    .line 160
    :cond_7
    :goto_2
    if-eqz v5, :cond_d

    .line 161
    .line 162
    if-nez v2, :cond_9

    .line 163
    .line 164
    iget-boolean v1, v5, Lgo3;->b:Z

    .line 165
    .line 166
    if-nez v1, :cond_8

    .line 167
    .line 168
    goto :goto_3

    .line 169
    :cond_8
    const-string v0, "Cannot upgrade connection from reader to writer"

    .line 170
    .line 171
    invoke-static {v11, v0}, Lh12;->P(ILjava/lang/String;)V

    .line 172
    .line 173
    .line 174
    throw v12

    .line 175
    :cond_9
    :goto_3
    invoke-interface {v4}, Lvd0;->getContext()Lne0;

    .line 176
    .line 177
    .line 178
    move-result-object v1

    .line 179
    invoke-interface {v1, v14}, Lne0;->K(Lme0;)Lle0;

    .line 180
    .line 181
    .line 182
    move-result-object v1

    .line 183
    if-nez v1, :cond_b

    .line 184
    .line 185
    new-instance v1, Lda0;

    .line 186
    .line 187
    invoke-direct {v1, v5}, Lda0;-><init>(Lgo3;)V

    .line 188
    .line 189
    .line 190
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 191
    .line 192
    .line 193
    new-instance v2, Lht4;

    .line 194
    .line 195
    invoke-direct {v2, v5, v0}, Lht4;-><init>(Lgo3;Ljava/lang/ThreadLocal;)V

    .line 196
    .line 197
    .line 198
    invoke-static {v1, v2}, Lya4;->F(Lle0;Lne0;)Lne0;

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    new-instance v1, Lp;

    .line 203
    .line 204
    const/4 v2, 0x7

    .line 205
    invoke-direct {v1, v3, v5, v12, v2}, Lp;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lvd0;I)V

    .line 206
    .line 207
    .line 208
    iput v11, v4, Lha0;->w:I

    .line 209
    .line 210
    invoke-static {v0, v1, v4}, Lfu;->P(Lne0;Lwf1;Lwd0;)Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    if-ne v0, v13, :cond_a

    .line 215
    .line 216
    goto/16 :goto_b

    .line 217
    .line 218
    :cond_a
    return-object v0

    .line 219
    :cond_b
    iput v10, v4, Lha0;->w:I

    .line 220
    .line 221
    invoke-interface {v3, v5, v4}, Lwf1;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object v0

    .line 225
    if-ne v0, v13, :cond_c

    .line 226
    .line 227
    goto/16 :goto_b

    .line 228
    .line 229
    :cond_c
    return-object v0

    .line 230
    :cond_d
    if-eqz v2, :cond_e

    .line 231
    .line 232
    iget-object v0, v1, Lia0;->n:Lwn3;

    .line 233
    .line 234
    :goto_4
    move-object v5, v0

    .line 235
    goto :goto_5

    .line 236
    :cond_e
    iget-object v0, v1, Lia0;->o:Lwn3;

    .line 237
    .line 238
    goto :goto_4

    .line 239
    :goto_5
    new-instance v10, Ljx3;

    .line 240
    .line 241
    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    .line 242
    .line 243
    .line 244
    :try_start_2
    invoke-interface {v4}, Lvd0;->getContext()Lne0;

    .line 245
    .line 246
    .line 247
    move-result-object v14

    .line 248
    new-instance v15, Ljx3;

    .line 249
    .line 250
    invoke-direct {v15}, Ljava/lang/Object;-><init>()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_5

    .line 251
    .line 252
    .line 253
    :try_start_3
    iget-wide v7, v1, Lia0;->r:J

    .line 254
    .line 255
    new-instance v0, Lr;

    .line 256
    .line 257
    invoke-direct {v0, v15, v5, v12, v9}, Lr;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lvd0;I)V

    .line 258
    .line 259
    .line 260
    iput-object v1, v4, Lha0;->n:Ljava/lang/Object;

    .line 261
    .line 262
    move-object v11, v3

    .line 263
    check-cast v11, Ljava/io/Serializable;

    .line 264
    .line 265
    iput-object v11, v4, Lha0;->o:Ljava/io/Serializable;

    .line 266
    .line 267
    iput-object v5, v4, Lha0;->p:Lwn3;

    .line 268
    .line 269
    iput-object v10, v4, Lha0;->q:Ljx3;

    .line 270
    .line 271
    iput-object v14, v4, Lha0;->r:Lne0;

    .line 272
    .line 273
    iput-object v15, v4, Lha0;->s:Ljx3;

    .line 274
    .line 275
    iput-boolean v2, v4, Lha0;->t:Z

    .line 276
    .line 277
    iput v9, v4, Lha0;->w:I

    .line 278
    .line 279
    invoke-static {v7, v8, v0, v4}, Lgb;->i0(JLr;Lha0;)Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 283
    if-ne v0, v13, :cond_f

    .line 284
    .line 285
    goto/16 :goto_b

    .line 286
    .line 287
    :cond_f
    move-object v9, v5

    .line 288
    move-object v5, v10

    .line 289
    move-object v0, v14

    .line 290
    move-object v14, v1

    .line 291
    move v1, v2

    .line 292
    move-object v2, v15

    .line 293
    :goto_6
    move-object v15, v2

    .line 294
    move v2, v1

    .line 295
    move-object v1, v5

    .line 296
    move-object v5, v14

    .line 297
    move-object v14, v0

    .line 298
    move-object v0, v12

    .line 299
    goto :goto_8

    .line 300
    :catchall_2
    move-exception v0

    .line 301
    move-object v9, v5

    .line 302
    move-object v5, v10

    .line 303
    :goto_7
    move-object/from16 v16, v5

    .line 304
    .line 305
    move-object v5, v1

    .line 306
    move-object/from16 v1, v16

    .line 307
    .line 308
    :goto_8
    :try_start_4
    iget-object v7, v15, Ljx3;->n:Ljava/lang/Object;

    .line 309
    .line 310
    check-cast v7, Lsa0;

    .line 311
    .line 312
    if-eqz v7, :cond_11

    .line 313
    .line 314
    new-instance v8, Lgo3;

    .line 315
    .line 316
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 317
    .line 318
    .line 319
    iput-object v14, v7, Lsa0;->p:Lne0;

    .line 320
    .line 321
    new-instance v10, Ljava/lang/Throwable;

    .line 322
    .line 323
    invoke-direct {v10}, Ljava/lang/Throwable;-><init>()V

    .line 324
    .line 325
    .line 326
    iput-object v10, v7, Lsa0;->q:Ljava/lang/Throwable;

    .line 327
    .line 328
    iget-object v10, v5, Lia0;->n:Lwn3;

    .line 329
    .line 330
    iget-object v11, v5, Lia0;->o:Lwn3;

    .line 331
    .line 332
    if-eq v10, v11, :cond_10

    .line 333
    .line 334
    if-eqz v2, :cond_10

    .line 335
    .line 336
    const/4 v10, 0x1

    .line 337
    goto :goto_9

    .line 338
    :cond_10
    const/4 v10, 0x0

    .line 339
    :goto_9
    invoke-direct {v8, v7, v10}, Lgo3;-><init>(Lsa0;Z)V

    .line 340
    .line 341
    .line 342
    goto :goto_a

    .line 343
    :catchall_3
    move-exception v0

    .line 344
    move-object v10, v1

    .line 345
    move-object v2, v9

    .line 346
    goto/16 :goto_1

    .line 347
    .line 348
    :cond_11
    move-object v8, v12

    .line 349
    :goto_a
    iput-object v8, v1, Ljx3;->n:Ljava/lang/Object;

    .line 350
    .line 351
    instance-of v7, v0, Lkotlinx/coroutines/TimeoutCancellationException;

    .line 352
    .line 353
    if-nez v7, :cond_17

    .line 354
    .line 355
    if-nez v0, :cond_16

    .line 356
    .line 357
    if-eqz v8, :cond_15

    .line 358
    .line 359
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 360
    .line 361
    .line 362
    new-instance v0, Lda0;

    .line 363
    .line 364
    invoke-direct {v0, v8}, Lda0;-><init>(Lgo3;)V

    .line 365
    .line 366
    .line 367
    iget-object v2, v5, Lia0;->p:Ljava/lang/ThreadLocal;

    .line 368
    .line 369
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 370
    .line 371
    .line 372
    new-instance v5, Lht4;

    .line 373
    .line 374
    invoke-direct {v5, v8, v2}, Lht4;-><init>(Lgo3;Ljava/lang/ThreadLocal;)V

    .line 375
    .line 376
    .line 377
    invoke-static {v0, v5}, Lya4;->F(Lle0;Lne0;)Lne0;

    .line 378
    .line 379
    .line 380
    move-result-object v0

    .line 381
    new-instance v2, Lp;

    .line 382
    .line 383
    const/16 v5, 0x8

    .line 384
    .line 385
    invoke-direct {v2, v3, v1, v12, v5}, Lp;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lvd0;I)V

    .line 386
    .line 387
    .line 388
    iput-object v9, v4, Lha0;->n:Ljava/lang/Object;

    .line 389
    .line 390
    iput-object v1, v4, Lha0;->o:Ljava/io/Serializable;

    .line 391
    .line 392
    iput-object v12, v4, Lha0;->p:Lwn3;

    .line 393
    .line 394
    iput-object v12, v4, Lha0;->q:Ljx3;

    .line 395
    .line 396
    iput-object v12, v4, Lha0;->r:Lne0;

    .line 397
    .line 398
    iput-object v12, v4, Lha0;->s:Ljx3;

    .line 399
    .line 400
    const/4 v3, 0x4

    .line 401
    iput v3, v4, Lha0;->w:I

    .line 402
    .line 403
    invoke-static {v0, v2, v4}, Lfu;->P(Lne0;Lwf1;Lwd0;)Ljava/lang/Object;

    .line 404
    .line 405
    .line 406
    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 407
    if-ne v0, v13, :cond_12

    .line 408
    .line 409
    :goto_b
    return-object v13

    .line 410
    :cond_12
    move-object v2, v9

    .line 411
    :goto_c
    :try_start_5
    iget-object v1, v1, Ljx3;->n:Ljava/lang/Object;

    .line 412
    .line 413
    check-cast v1, Lgo3;

    .line 414
    .line 415
    if-eqz v1, :cond_14

    .line 416
    .line 417
    iget-object v3, v1, Lgo3;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 418
    .line 419
    const/4 v4, 0x0

    .line 420
    const/4 v5, 0x1

    .line 421
    invoke-virtual {v3, v4, v5}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 422
    .line 423
    .line 424
    move-result v3
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 425
    if-eqz v3, :cond_13

    .line 426
    .line 427
    :try_start_6
    iget-object v3, v1, Lgo3;->a:Lsa0;

    .line 428
    .line 429
    invoke-static {v3, v6}, Lh12;->n(Lx34;Ljava/lang/String;)V
    :try_end_6
    .catch Landroid/database/SQLException; {:try_start_6 .. :try_end_6} :catch_0
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 430
    .line 431
    .line 432
    :catch_0
    :cond_13
    :try_start_7
    iget-object v1, v1, Lgo3;->a:Lsa0;

    .line 433
    .line 434
    iput-object v12, v1, Lsa0;->p:Lne0;

    .line 435
    .line 436
    iput-object v12, v1, Lsa0;->q:Ljava/lang/Throwable;

    .line 437
    .line 438
    invoke-virtual {v2, v1}, Lwn3;->d(Lsa0;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 439
    .line 440
    .line 441
    :catchall_4
    :cond_14
    return-object v0

    .line 442
    :cond_15
    :try_start_8
    const-string v0, "Required value was null."

    .line 443
    .line 444
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 445
    .line 446
    invoke-direct {v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 447
    .line 448
    .line 449
    throw v2

    .line 450
    :cond_16
    throw v0

    .line 451
    :cond_17
    invoke-virtual {v5, v2}, Lia0;->b(Z)V

    .line 452
    .line 453
    .line 454
    throw v12
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 455
    :catchall_5
    move-exception v0

    .line 456
    move-object v1, v0

    .line 457
    move-object v2, v5

    .line 458
    :goto_d
    :try_start_9
    throw v1
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_6

    .line 459
    :catchall_6
    move-exception v0

    .line 460
    move-object v3, v0

    .line 461
    :try_start_a
    iget-object v0, v10, Ljx3;->n:Ljava/lang/Object;

    .line 462
    .line 463
    check-cast v0, Lgo3;

    .line 464
    .line 465
    if-eqz v0, :cond_19

    .line 466
    .line 467
    iget-object v4, v0, Lgo3;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 468
    .line 469
    const/4 v5, 0x0

    .line 470
    const/4 v7, 0x1

    .line 471
    invoke-virtual {v4, v5, v7}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 472
    .line 473
    .line 474
    move-result v4
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_7

    .line 475
    if-eqz v4, :cond_18

    .line 476
    .line 477
    :try_start_b
    iget-object v4, v0, Lgo3;->a:Lsa0;

    .line 478
    .line 479
    invoke-static {v4, v6}, Lh12;->n(Lx34;Ljava/lang/String;)V
    :try_end_b
    .catch Landroid/database/SQLException; {:try_start_b .. :try_end_b} :catch_1
    .catchall {:try_start_b .. :try_end_b} :catchall_7

    .line 480
    .line 481
    .line 482
    :catch_1
    :cond_18
    :try_start_c
    iget-object v0, v0, Lgo3;->a:Lsa0;

    .line 483
    .line 484
    iput-object v12, v0, Lsa0;->p:Lne0;

    .line 485
    .line 486
    iput-object v12, v0, Lsa0;->q:Ljava/lang/Throwable;

    .line 487
    .line 488
    invoke-virtual {v2, v0}, Lwn3;->d(Lsa0;)V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_7

    .line 489
    .line 490
    .line 491
    goto :goto_e

    .line 492
    :catchall_7
    move-exception v0

    .line 493
    invoke-static {v1, v0}, Lj51;->d(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 494
    .line 495
    .line 496
    :cond_19
    :goto_e
    throw v3

    .line 497
    :cond_1a
    const/16 v0, 0x15

    .line 498
    .line 499
    const-string v1, "Connection pool is closed"

    .line 500
    .line 501
    invoke-static {v0, v1}, Lh12;->P(ILjava/lang/String;)V

    .line 502
    .line 503
    .line 504
    throw v12
.end method
