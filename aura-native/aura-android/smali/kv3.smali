.class public final synthetic Lkv3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lif1;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:I

.field public final synthetic p:Ljava/lang/Object;

.field public final synthetic q:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/util/List;Lq25;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lkv3;->n:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput p1, p0, Lkv3;->o:I

    .line 8
    .line 9
    iput-object p2, p0, Lkv3;->p:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p3, p0, Lkv3;->q:Ljava/lang/Object;

    .line 12
    .line 13
    return-void
.end method

.method public synthetic constructor <init>(Llv3;ILp03;)V
    .locals 1

    .line 14
    const/4 v0, 0x0

    iput v0, p0, Lkv3;->n:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkv3;->p:Ljava/lang/Object;

    iput p2, p0, Lkv3;->o:I

    iput-object p3, p0, Lkv3;->q:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lkv3;->n:I

    .line 4
    .line 5
    sget-object v2, Lj15;->a:Lj15;

    .line 6
    .line 7
    iget-object v3, v0, Lkv3;->q:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v4, v0, Lkv3;->p:Ljava/lang/Object;

    .line 10
    .line 11
    iget v0, v0, Lkv3;->o:I

    .line 12
    .line 13
    packed-switch v1, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    check-cast v4, Ljava/util/List;

    .line 17
    .line 18
    check-cast v3, Lq25;

    .line 19
    .line 20
    move-object/from16 v1, p1

    .line 21
    .line 22
    check-cast v1, Ljava/util/List;

    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    new-instance v5, Ljava/util/ArrayList;

    .line 28
    .line 29
    const/16 v6, 0xa

    .line 30
    .line 31
    invoke-static {v4, v6}, Lr40;->k0(Ljava/lang/Iterable;I)I

    .line 32
    .line 33
    .line 34
    move-result v6

    .line 35
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 36
    .line 37
    .line 38
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 43
    .line 44
    .line 45
    move-result v6

    .line 46
    if-eqz v6, :cond_0

    .line 47
    .line 48
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v6

    .line 52
    check-cast v6, Lgn2;

    .line 53
    .line 54
    new-instance v7, Lp25;

    .line 55
    .line 56
    iget-wide v8, v3, Lq25;->N:J

    .line 57
    .line 58
    const-wide/16 v10, 0x1

    .line 59
    .line 60
    add-long/2addr v10, v8

    .line 61
    iput-wide v10, v3, Lq25;->N:J

    .line 62
    .line 63
    iget-object v10, v3, Lq25;->m:Lif1;

    .line 64
    .line 65
    invoke-interface {v10, v6}, Lif1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v10

    .line 69
    check-cast v10, Ljava/lang/String;

    .line 70
    .line 71
    invoke-direct {v7, v8, v9, v6, v10}, Lp25;-><init>(JLgn2;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_0
    invoke-interface {v1, v0, v5}, Ljava/util/List;->addAll(ILjava/util/Collection;)Z

    .line 79
    .line 80
    .line 81
    return-object v2

    .line 82
    :pswitch_0
    check-cast v4, Llv3;

    .line 83
    .line 84
    check-cast v3, Lp03;

    .line 85
    .line 86
    move-object/from16 v1, p1

    .line 87
    .line 88
    check-cast v1, Lt80;

    .line 89
    .line 90
    iget v5, v4, Llv3;->e:I

    .line 91
    .line 92
    if-ne v5, v0, :cond_9

    .line 93
    .line 94
    iget-object v5, v4, Llv3;->f:Lp03;

    .line 95
    .line 96
    invoke-static {v3, v5}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result v5

    .line 100
    if-eqz v5, :cond_9

    .line 101
    .line 102
    instance-of v5, v1, Lz80;

    .line 103
    .line 104
    if-eqz v5, :cond_9

    .line 105
    .line 106
    iget-object v5, v3, Lp03;->a:[J

    .line 107
    .line 108
    array-length v6, v5

    .line 109
    add-int/lit8 v6, v6, -0x2

    .line 110
    .line 111
    if-ltz v6, :cond_9

    .line 112
    .line 113
    const/4 v8, 0x0

    .line 114
    :goto_1
    aget-wide v9, v5, v8

    .line 115
    .line 116
    not-long v11, v9

    .line 117
    const/4 v13, 0x7

    .line 118
    shl-long/2addr v11, v13

    .line 119
    and-long/2addr v11, v9

    .line 120
    const-wide v13, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    and-long/2addr v11, v13

    .line 126
    cmp-long v11, v11, v13

    .line 127
    .line 128
    if-eqz v11, :cond_8

    .line 129
    .line 130
    sub-int v11, v8, v6

    .line 131
    .line 132
    not-int v11, v11

    .line 133
    ushr-int/lit8 v11, v11, 0x1f

    .line 134
    .line 135
    const/16 v12, 0x8

    .line 136
    .line 137
    rsub-int/lit8 v11, v11, 0x8

    .line 138
    .line 139
    const/4 v13, 0x0

    .line 140
    :goto_2
    if-ge v13, v11, :cond_7

    .line 141
    .line 142
    const-wide/16 v14, 0xff

    .line 143
    .line 144
    and-long/2addr v14, v9

    .line 145
    const-wide/16 v16, 0x80

    .line 146
    .line 147
    cmp-long v14, v14, v16

    .line 148
    .line 149
    if-gez v14, :cond_5

    .line 150
    .line 151
    shl-int/lit8 v14, v8, 0x3

    .line 152
    .line 153
    add-int/2addr v14, v13

    .line 154
    iget-object v15, v3, Lp03;->b:[Ljava/lang/Object;

    .line 155
    .line 156
    aget-object v15, v15, v14

    .line 157
    .line 158
    iget-object v7, v3, Lp03;->c:[I

    .line 159
    .line 160
    aget v7, v7, v14

    .line 161
    .line 162
    if-eq v7, v0, :cond_1

    .line 163
    .line 164
    const/4 v7, 0x1

    .line 165
    goto :goto_3

    .line 166
    :cond_1
    const/4 v7, 0x0

    .line 167
    :goto_3
    if-eqz v7, :cond_3

    .line 168
    .line 169
    move/from16 p1, v12

    .line 170
    .line 171
    move-object v12, v1

    .line 172
    check-cast v12, Lz80;

    .line 173
    .line 174
    move/from16 v16, v0

    .line 175
    .line 176
    iget-object v0, v12, Lz80;->t:Lw03;

    .line 177
    .line 178
    invoke-static {v0, v15, v4}, Lte5;->I(Lw03;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    move-object/from16 v17, v1

    .line 182
    .line 183
    instance-of v1, v15, Ldp0;

    .line 184
    .line 185
    if-eqz v1, :cond_4

    .line 186
    .line 187
    move-object v1, v15

    .line 188
    check-cast v1, Ldp0;

    .line 189
    .line 190
    invoke-virtual {v0, v1}, Lw03;->c(Ljava/lang/Object;)Z

    .line 191
    .line 192
    .line 193
    move-result v0

    .line 194
    if-nez v0, :cond_2

    .line 195
    .line 196
    iget-object v0, v12, Lz80;->w:Lw03;

    .line 197
    .line 198
    invoke-static {v0, v1}, Lte5;->J(Lw03;Ljava/lang/Object;)V

    .line 199
    .line 200
    .line 201
    :cond_2
    iget-object v0, v4, Llv3;->g:Lw03;

    .line 202
    .line 203
    if-eqz v0, :cond_4

    .line 204
    .line 205
    invoke-virtual {v0, v15}, Lw03;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    goto :goto_4

    .line 209
    :cond_3
    move/from16 v16, v0

    .line 210
    .line 211
    move-object/from16 v17, v1

    .line 212
    .line 213
    move/from16 p1, v12

    .line 214
    .line 215
    :cond_4
    :goto_4
    if-eqz v7, :cond_6

    .line 216
    .line 217
    invoke-virtual {v3, v14}, Lp03;->f(I)V

    .line 218
    .line 219
    .line 220
    goto :goto_5

    .line 221
    :cond_5
    move/from16 v16, v0

    .line 222
    .line 223
    move-object/from16 v17, v1

    .line 224
    .line 225
    move/from16 p1, v12

    .line 226
    .line 227
    :cond_6
    :goto_5
    shr-long v9, v9, p1

    .line 228
    .line 229
    add-int/lit8 v13, v13, 0x1

    .line 230
    .line 231
    move/from16 v12, p1

    .line 232
    .line 233
    move/from16 v0, v16

    .line 234
    .line 235
    move-object/from16 v1, v17

    .line 236
    .line 237
    goto :goto_2

    .line 238
    :cond_7
    move/from16 v16, v0

    .line 239
    .line 240
    move-object/from16 v17, v1

    .line 241
    .line 242
    move v0, v12

    .line 243
    if-ne v11, v0, :cond_9

    .line 244
    .line 245
    goto :goto_6

    .line 246
    :cond_8
    move/from16 v16, v0

    .line 247
    .line 248
    move-object/from16 v17, v1

    .line 249
    .line 250
    :goto_6
    if-eq v8, v6, :cond_9

    .line 251
    .line 252
    add-int/lit8 v8, v8, 0x1

    .line 253
    .line 254
    move/from16 v0, v16

    .line 255
    .line 256
    move-object/from16 v1, v17

    .line 257
    .line 258
    goto/16 :goto_1

    .line 259
    .line 260
    :cond_9
    return-object v2

    .line 261
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
