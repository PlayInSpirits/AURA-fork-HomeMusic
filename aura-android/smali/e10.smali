.class public final Le10;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lq81;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Ljava/io/Serializable;

.field public final synthetic p:Ljava/lang/Object;

.field public final synthetic q:Ljava/lang/Object;

.field public final synthetic r:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/io/Serializable;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 16
    iput p5, p0, Le10;->n:I

    iput-object p1, p0, Le10;->o:Ljava/io/Serializable;

    iput-object p2, p0, Le10;->p:Ljava/lang/Object;

    iput-object p3, p0, Le10;->q:Ljava/lang/Object;

    iput-object p4, p0, Le10;->r:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljx3;Lq81;[Ljava/lang/String;[I)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    iput v0, p0, Le10;->n:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Le10;->o:Ljava/io/Serializable;

    .line 8
    .line 9
    iput-object p2, p0, Le10;->r:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p3, p0, Le10;->p:Ljava/lang/Object;

    .line 12
    .line 13
    iput-object p4, p0, Le10;->q:Ljava/lang/Object;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public a([ILvd0;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    iget-object v3, v0, Le10;->p:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v3, [Ljava/lang/String;

    .line 10
    .line 11
    iget-object v4, v0, Le10;->r:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v4, Lq81;

    .line 14
    .line 15
    instance-of v5, v2, Lcy4;

    .line 16
    .line 17
    if-eqz v5, :cond_0

    .line 18
    .line 19
    move-object v5, v2

    .line 20
    check-cast v5, Lcy4;

    .line 21
    .line 22
    iget v6, v5, Lcy4;->r:I

    .line 23
    .line 24
    const/high16 v7, -0x80000000

    .line 25
    .line 26
    and-int v8, v6, v7

    .line 27
    .line 28
    if-eqz v8, :cond_0

    .line 29
    .line 30
    sub-int/2addr v6, v7

    .line 31
    iput v6, v5, Lcy4;->r:I

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    new-instance v5, Lcy4;

    .line 35
    .line 36
    invoke-direct {v5, v0, v2}, Lcy4;-><init>(Le10;Lvd0;)V

    .line 37
    .line 38
    .line 39
    :goto_0
    iget-object v2, v5, Lcy4;->p:Ljava/lang/Object;

    .line 40
    .line 41
    iget v6, v5, Lcy4;->r:I

    .line 42
    .line 43
    const/4 v7, 0x0

    .line 44
    const/4 v8, 0x2

    .line 45
    const/4 v9, 0x1

    .line 46
    if-eqz v6, :cond_3

    .line 47
    .line 48
    if-eq v6, v9, :cond_2

    .line 49
    .line 50
    if-ne v6, v8, :cond_1

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 54
    .line 55
    invoke-static {v0}, Lkf2;->o(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    return-object v7

    .line 59
    :cond_2
    :goto_1
    iget-object v0, v5, Lcy4;->o:[I

    .line 60
    .line 61
    iget-object v1, v5, Lcy4;->n:Le10;

    .line 62
    .line 63
    invoke-static {v2}, Lkb4;->X(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    move-object/from16 v16, v1

    .line 67
    .line 68
    move-object v1, v0

    .line 69
    move-object/from16 v0, v16

    .line 70
    .line 71
    goto :goto_4

    .line 72
    :cond_3
    invoke-static {v2}, Lkb4;->X(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    iget-object v2, v0, Le10;->o:Ljava/io/Serializable;

    .line 76
    .line 77
    check-cast v2, Ljx3;

    .line 78
    .line 79
    iget-object v6, v2, Ljx3;->n:Ljava/lang/Object;

    .line 80
    .line 81
    sget-object v10, Lxe0;->n:Lxe0;

    .line 82
    .line 83
    if-nez v6, :cond_4

    .line 84
    .line 85
    invoke-static {v3}, Lti;->t0([Ljava/lang/Object;)Ljava/util/Set;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    iput-object v0, v5, Lcy4;->n:Le10;

    .line 90
    .line 91
    iput-object v1, v5, Lcy4;->o:[I

    .line 92
    .line 93
    iput v9, v5, Lcy4;->r:I

    .line 94
    .line 95
    invoke-interface {v4, v2, v5}, Lq81;->b(Ljava/lang/Object;Lvd0;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    if-ne v2, v10, :cond_8

    .line 100
    .line 101
    goto :goto_3

    .line 102
    :cond_4
    iget-object v6, v0, Le10;->q:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast v6, [I

    .line 105
    .line 106
    new-instance v9, Ljava/util/ArrayList;

    .line 107
    .line 108
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 109
    .line 110
    .line 111
    array-length v11, v3

    .line 112
    const/4 v12, 0x0

    .line 113
    move v13, v12

    .line 114
    :goto_2
    if-ge v12, v11, :cond_7

    .line 115
    .line 116
    aget-object v14, v3, v12

    .line 117
    .line 118
    add-int/lit8 v15, v13, 0x1

    .line 119
    .line 120
    move-object/from16 p2, v7

    .line 121
    .line 122
    iget-object v7, v2, Ljx3;->n:Ljava/lang/Object;

    .line 123
    .line 124
    if-eqz v7, :cond_6

    .line 125
    .line 126
    check-cast v7, [I

    .line 127
    .line 128
    aget v13, v6, v13

    .line 129
    .line 130
    aget v7, v7, v13

    .line 131
    .line 132
    aget v13, v1, v13

    .line 133
    .line 134
    if-eq v7, v13, :cond_5

    .line 135
    .line 136
    invoke-virtual {v9, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    :cond_5
    add-int/lit8 v12, v12, 0x1

    .line 140
    .line 141
    move-object/from16 v7, p2

    .line 142
    .line 143
    move v13, v15

    .line 144
    goto :goto_2

    .line 145
    :cond_6
    const-string v0, "Required value was null."

    .line 146
    .line 147
    invoke-static {v0}, Lkf2;->o(Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    return-object p2

    .line 151
    :cond_7
    invoke-virtual {v9}, Ljava/util/ArrayList;->isEmpty()Z

    .line 152
    .line 153
    .line 154
    move-result v2

    .line 155
    if-nez v2, :cond_8

    .line 156
    .line 157
    invoke-static {v9}, Lq40;->T0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 158
    .line 159
    .line 160
    move-result-object v2

    .line 161
    iput-object v0, v5, Lcy4;->n:Le10;

    .line 162
    .line 163
    iput-object v1, v5, Lcy4;->o:[I

    .line 164
    .line 165
    iput v8, v5, Lcy4;->r:I

    .line 166
    .line 167
    invoke-interface {v4, v2, v5}, Lq81;->b(Ljava/lang/Object;Lvd0;)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v2

    .line 171
    if-ne v2, v10, :cond_8

    .line 172
    .line 173
    :goto_3
    return-object v10

    .line 174
    :cond_8
    :goto_4
    iget-object v0, v0, Le10;->o:Ljava/io/Serializable;

    .line 175
    .line 176
    check-cast v0, Ljx3;

    .line 177
    .line 178
    iput-object v1, v0, Ljx3;->n:Ljava/lang/Object;

    .line 179
    .line 180
    sget-object v0, Lj15;->a:Lj15;

    .line 181
    .line 182
    return-object v0
.end method

.method public final b(Ljava/lang/Object;Lvd0;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Le10;->n:I

    .line 2
    .line 3
    sget-object v1, Lj15;->a:Lj15;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    iget-object v3, p0, Le10;->o:Ljava/io/Serializable;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast p1, [I

    .line 12
    .line 13
    invoke-virtual {p0, p1, p2}, Le10;->a([ILvd0;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0

    .line 18
    :pswitch_0
    check-cast p1, Lq02;

    .line 19
    .line 20
    iget-object p2, p0, Le10;->q:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast p2, Lhx3;

    .line 23
    .line 24
    iget-object v0, p0, Le10;->p:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v0, Lhx3;

    .line 27
    .line 28
    check-cast v3, Lhx3;

    .line 29
    .line 30
    instance-of v4, p1, Lbq3;

    .line 31
    .line 32
    if-eqz v4, :cond_0

    .line 33
    .line 34
    iget p1, v3, Lhx3;->n:I

    .line 35
    .line 36
    add-int/2addr p1, v2

    .line 37
    iput p1, v3, Lhx3;->n:I

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    instance-of v4, p1, Lcq3;

    .line 41
    .line 42
    if-eqz v4, :cond_1

    .line 43
    .line 44
    iget p1, v3, Lhx3;->n:I

    .line 45
    .line 46
    add-int/lit8 p1, p1, -0x1

    .line 47
    .line 48
    iput p1, v3, Lhx3;->n:I

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    instance-of v4, p1, Laq3;

    .line 52
    .line 53
    if-eqz v4, :cond_2

    .line 54
    .line 55
    iget p1, v3, Lhx3;->n:I

    .line 56
    .line 57
    add-int/lit8 p1, p1, -0x1

    .line 58
    .line 59
    iput p1, v3, Lhx3;->n:I

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_2
    instance-of v4, p1, Lwp1;

    .line 63
    .line 64
    if-eqz v4, :cond_3

    .line 65
    .line 66
    iget p1, v0, Lhx3;->n:I

    .line 67
    .line 68
    add-int/2addr p1, v2

    .line 69
    iput p1, v0, Lhx3;->n:I

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_3
    instance-of v4, p1, Lxp1;

    .line 73
    .line 74
    if-eqz v4, :cond_4

    .line 75
    .line 76
    iget p1, v0, Lhx3;->n:I

    .line 77
    .line 78
    add-int/lit8 p1, p1, -0x1

    .line 79
    .line 80
    iput p1, v0, Lhx3;->n:I

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_4
    instance-of v4, p1, Lp91;

    .line 84
    .line 85
    if-eqz v4, :cond_5

    .line 86
    .line 87
    iget p1, p2, Lhx3;->n:I

    .line 88
    .line 89
    add-int/2addr p1, v2

    .line 90
    iput p1, p2, Lhx3;->n:I

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_5
    instance-of p1, p1, Lq91;

    .line 94
    .line 95
    if-eqz p1, :cond_6

    .line 96
    .line 97
    iget p1, p2, Lhx3;->n:I

    .line 98
    .line 99
    add-int/lit8 p1, p1, -0x1

    .line 100
    .line 101
    iput p1, p2, Lhx3;->n:I

    .line 102
    .line 103
    :cond_6
    :goto_0
    iget p1, v3, Lhx3;->n:I

    .line 104
    .line 105
    const/4 v3, 0x0

    .line 106
    if-lez p1, :cond_7

    .line 107
    .line 108
    move p1, v2

    .line 109
    goto :goto_1

    .line 110
    :cond_7
    move p1, v3

    .line 111
    :goto_1
    iget v0, v0, Lhx3;->n:I

    .line 112
    .line 113
    if-lez v0, :cond_8

    .line 114
    .line 115
    move v0, v2

    .line 116
    goto :goto_2

    .line 117
    :cond_8
    move v0, v3

    .line 118
    :goto_2
    iget p2, p2, Lhx3;->n:I

    .line 119
    .line 120
    if-lez p2, :cond_9

    .line 121
    .line 122
    move p2, v2

    .line 123
    goto :goto_3

    .line 124
    :cond_9
    move p2, v3

    .line 125
    :goto_3
    iget-object p0, p0, Le10;->r:Ljava/lang/Object;

    .line 126
    .line 127
    check-cast p0, Lck0;

    .line 128
    .line 129
    iget-boolean v4, p0, Lck0;->C:Z

    .line 130
    .line 131
    if-eq v4, p1, :cond_a

    .line 132
    .line 133
    iput-boolean p1, p0, Lck0;->C:Z

    .line 134
    .line 135
    move v3, v2

    .line 136
    :cond_a
    iget-boolean p1, p0, Lck0;->D:Z

    .line 137
    .line 138
    if-eq p1, v0, :cond_b

    .line 139
    .line 140
    iput-boolean v0, p0, Lck0;->D:Z

    .line 141
    .line 142
    move v3, v2

    .line 143
    :cond_b
    iget-boolean p1, p0, Lck0;->E:Z

    .line 144
    .line 145
    if-eq p1, p2, :cond_c

    .line 146
    .line 147
    iput-boolean p2, p0, Lck0;->E:Z

    .line 148
    .line 149
    goto :goto_4

    .line 150
    :cond_c
    move v2, v3

    .line 151
    :goto_4
    if-eqz v2, :cond_d

    .line 152
    .line 153
    invoke-static {p0}, Ljz4;->z(Lrv0;)V

    .line 154
    .line 155
    .line 156
    :cond_d
    return-object v1

    .line 157
    :pswitch_1
    instance-of v0, p2, Ld10;

    .line 158
    .line 159
    if-eqz v0, :cond_e

    .line 160
    .line 161
    move-object v0, p2

    .line 162
    check-cast v0, Ld10;

    .line 163
    .line 164
    iget v4, v0, Ld10;->r:I

    .line 165
    .line 166
    const/high16 v5, -0x80000000

    .line 167
    .line 168
    and-int v6, v4, v5

    .line 169
    .line 170
    if-eqz v6, :cond_e

    .line 171
    .line 172
    sub-int/2addr v4, v5

    .line 173
    iput v4, v0, Ld10;->r:I

    .line 174
    .line 175
    goto :goto_5

    .line 176
    :cond_e
    new-instance v0, Ld10;

    .line 177
    .line 178
    invoke-direct {v0, p0, p2}, Ld10;-><init>(Le10;Lvd0;)V

    .line 179
    .line 180
    .line 181
    :goto_5
    iget-object p2, v0, Ld10;->p:Ljava/lang/Object;

    .line 182
    .line 183
    iget v4, v0, Ld10;->r:I

    .line 184
    .line 185
    const/4 v5, 0x0

    .line 186
    if-eqz v4, :cond_10

    .line 187
    .line 188
    if-ne v4, v2, :cond_f

    .line 189
    .line 190
    iget-object p1, v0, Ld10;->o:Ljava/lang/Object;

    .line 191
    .line 192
    iget-object p0, v0, Ld10;->n:Le10;

    .line 193
    .line 194
    invoke-static {p2}, Lkb4;->X(Ljava/lang/Object;)V

    .line 195
    .line 196
    .line 197
    goto :goto_6

    .line 198
    :cond_f
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 199
    .line 200
    invoke-static {p0}, Lkf2;->o(Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    move-object v1, v5

    .line 204
    goto :goto_7

    .line 205
    :cond_10
    invoke-static {p2}, Lkb4;->X(Ljava/lang/Object;)V

    .line 206
    .line 207
    .line 208
    check-cast v3, Ljx3;

    .line 209
    .line 210
    iget-object p2, v3, Ljx3;->n:Ljava/lang/Object;

    .line 211
    .line 212
    check-cast p2, Ls22;

    .line 213
    .line 214
    if-eqz p2, :cond_11

    .line 215
    .line 216
    new-instance v3, Lkotlinx/coroutines/flow/internal/ChildCancelledException;

    .line 217
    .line 218
    invoke-direct {v3}, Lkotlinx/coroutines/flow/internal/ChildCancelledException;-><init>()V

    .line 219
    .line 220
    .line 221
    invoke-interface {p2, v3}, Ls22;->f(Ljava/util/concurrent/CancellationException;)V

    .line 222
    .line 223
    .line 224
    iput-object p0, v0, Ld10;->n:Le10;

    .line 225
    .line 226
    iput-object p1, v0, Ld10;->o:Ljava/lang/Object;

    .line 227
    .line 228
    iput v2, v0, Ld10;->r:I

    .line 229
    .line 230
    invoke-interface {p2, v0}, Ls22;->R(Lwd0;)Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object p2

    .line 234
    sget-object v0, Lxe0;->n:Lxe0;

    .line 235
    .line 236
    if-ne p2, v0, :cond_11

    .line 237
    .line 238
    move-object v1, v0

    .line 239
    goto :goto_7

    .line 240
    :cond_11
    :goto_6
    iget-object p2, p0, Le10;->o:Ljava/io/Serializable;

    .line 241
    .line 242
    check-cast p2, Ljx3;

    .line 243
    .line 244
    iget-object v0, p0, Le10;->p:Ljava/lang/Object;

    .line 245
    .line 246
    check-cast v0, Lwe0;

    .line 247
    .line 248
    new-instance v3, Lc10;

    .line 249
    .line 250
    iget-object v4, p0, Le10;->q:Ljava/lang/Object;

    .line 251
    .line 252
    check-cast v4, Lf10;

    .line 253
    .line 254
    iget-object p0, p0, Le10;->r:Ljava/lang/Object;

    .line 255
    .line 256
    check-cast p0, Lq81;

    .line 257
    .line 258
    invoke-direct {v3, v4, p0, p1, v5}, Lc10;-><init>(Lf10;Lq81;Ljava/lang/Object;Lvd0;)V

    .line 259
    .line 260
    .line 261
    sget-object p0, Lze0;->q:Lze0;

    .line 262
    .line 263
    invoke-static {v0, v5, p0, v3, v2}, Lfu;->G(Lwe0;Lne0;Lze0;Lwf1;I)Lsk4;

    .line 264
    .line 265
    .line 266
    move-result-object p0

    .line 267
    iput-object p0, p2, Ljx3;->n:Ljava/lang/Object;

    .line 268
    .line 269
    :goto_7
    return-object v1

    .line 270
    nop

    .line 271
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
