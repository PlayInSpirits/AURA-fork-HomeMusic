.class public final Lx70;
.super Lep4;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lwf1;


# instance fields
.field public final synthetic o:I

.field public p:I

.field public q:Ljava/lang/Object;

.field public r:Ljava/lang/Object;

.field public synthetic s:Ljava/lang/Object;

.field public final synthetic t:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lb13;Lty1;Lvd0;)V
    .locals 1

    const/4 v0, 0x5

    iput v0, p0, Lx70;->o:I

    .line 18
    iput-object p1, p0, Lx70;->s:Ljava/lang/Object;

    iput-object p2, p0, Lx70;->t:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lep4;-><init>(ILvd0;)V

    return-void
.end method

.method public constructor <init>(Lhw4;Lvd0;)V
    .locals 1

    const/4 v0, 0x6

    iput v0, p0, Lx70;->o:I

    .line 16
    iput-object p1, p0, Lx70;->t:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lep4;-><init>(ILvd0;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/io/Serializable;Lvd0;I)V
    .locals 0

    .line 17
    iput p5, p0, Lx70;->o:I

    iput-object p1, p0, Lx70;->r:Ljava/lang/Object;

    iput-object p2, p0, Lx70;->s:Ljava/lang/Object;

    iput-object p3, p0, Lx70;->t:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lep4;-><init>(ILvd0;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lvd0;I)V
    .locals 0

    .line 1
    iput p6, p0, Lx70;->o:I

    .line 2
    .line 3
    iput-object p1, p0, Lx70;->q:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Lx70;->r:Ljava/lang/Object;

    .line 6
    .line 7
    iput-object p3, p0, Lx70;->s:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p4, p0, Lx70;->t:Ljava/lang/Object;

    .line 10
    .line 11
    const/4 p1, 0x2

    .line 12
    invoke-direct {p0, p1, p5}, Lep4;-><init>(ILvd0;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvd0;)Lvd0;
    .locals 10

    .line 1
    iget v0, p0, Lx70;->o:I

    .line 2
    .line 3
    iget-object v1, p0, Lx70;->t:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v2, Lx70;

    .line 9
    .line 10
    iget-object p1, p0, Lx70;->q:Ljava/lang/Object;

    .line 11
    .line 12
    move-object v3, p1

    .line 13
    check-cast v3, Loc2;

    .line 14
    .line 15
    iget-object p1, p0, Lx70;->r:Ljava/lang/Object;

    .line 16
    .line 17
    move-object v4, p1

    .line 18
    check-cast v4, Ldd5;

    .line 19
    .line 20
    iget-object p0, p0, Lx70;->s:Ljava/lang/Object;

    .line 21
    .line 22
    move-object v5, p0

    .line 23
    check-cast v5, Lqc5;

    .line 24
    .line 25
    move-object v6, v1

    .line 26
    check-cast v6, Landroid/content/Context;

    .line 27
    .line 28
    const/16 v8, 0x9

    .line 29
    .line 30
    move-object v7, p2

    .line 31
    invoke-direct/range {v2 .. v8}, Lx70;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lvd0;I)V

    .line 32
    .line 33
    .line 34
    return-object v2

    .line 35
    :pswitch_0
    move-object v8, p2

    .line 36
    new-instance v3, Lx70;

    .line 37
    .line 38
    iget-object p1, p0, Lx70;->q:Ljava/lang/Object;

    .line 39
    .line 40
    move-object v4, p1

    .line 41
    check-cast v4, Ljx3;

    .line 42
    .line 43
    iget-object p1, p0, Lx70;->r:Ljava/lang/Object;

    .line 44
    .line 45
    move-object v5, p1

    .line 46
    check-cast v5, Ltv3;

    .line 47
    .line 48
    iget-object p0, p0, Lx70;->s:Ljava/lang/Object;

    .line 49
    .line 50
    move-object v6, p0

    .line 51
    check-cast v6, Lba2;

    .line 52
    .line 53
    move-object v7, v1

    .line 54
    check-cast v7, Led1;

    .line 55
    .line 56
    const/16 v9, 0x8

    .line 57
    .line 58
    invoke-direct/range {v3 .. v9}, Lx70;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lvd0;I)V

    .line 59
    .line 60
    .line 61
    return-object v3

    .line 62
    :pswitch_1
    move-object v8, p2

    .line 63
    new-instance v3, Lx70;

    .line 64
    .line 65
    iget-object p2, p0, Lx70;->r:Ljava/lang/Object;

    .line 66
    .line 67
    move-object v4, p2

    .line 68
    check-cast v4, Ljy4;

    .line 69
    .line 70
    iget-object p0, p0, Lx70;->s:Ljava/lang/Object;

    .line 71
    .line 72
    move-object v5, p0

    .line 73
    check-cast v5, [I

    .line 74
    .line 75
    move-object v6, v1

    .line 76
    check-cast v6, [Ljava/lang/String;

    .line 77
    .line 78
    move-object v7, v8

    .line 79
    const/4 v8, 0x7

    .line 80
    invoke-direct/range {v3 .. v8}, Lx70;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/io/Serializable;Lvd0;I)V

    .line 81
    .line 82
    .line 83
    iput-object p1, v3, Lx70;->q:Ljava/lang/Object;

    .line 84
    .line 85
    return-object v3

    .line 86
    :pswitch_2
    move-object v8, p2

    .line 87
    new-instance p0, Lx70;

    .line 88
    .line 89
    check-cast v1, Lhw4;

    .line 90
    .line 91
    invoke-direct {p0, v1, v8}, Lx70;-><init>(Lhw4;Lvd0;)V

    .line 92
    .line 93
    .line 94
    iput-object p1, p0, Lx70;->s:Ljava/lang/Object;

    .line 95
    .line 96
    return-object p0

    .line 97
    :pswitch_3
    move-object v8, p2

    .line 98
    new-instance p2, Lx70;

    .line 99
    .line 100
    iget-object p0, p0, Lx70;->s:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast p0, Lb13;

    .line 103
    .line 104
    check-cast v1, Lty1;

    .line 105
    .line 106
    invoke-direct {p2, p0, v1, v8}, Lx70;-><init>(Lb13;Lty1;Lvd0;)V

    .line 107
    .line 108
    .line 109
    iput-object p1, p2, Lx70;->r:Ljava/lang/Object;

    .line 110
    .line 111
    return-object p2

    .line 112
    :pswitch_4
    move-object v8, p2

    .line 113
    new-instance v3, Lx70;

    .line 114
    .line 115
    iget-object p1, p0, Lx70;->q:Ljava/lang/Object;

    .line 116
    .line 117
    move-object v4, p1

    .line 118
    check-cast v4, Lil4;

    .line 119
    .line 120
    iget-object p1, p0, Lx70;->r:Ljava/lang/Object;

    .line 121
    .line 122
    move-object v5, p1

    .line 123
    check-cast v5, Lp81;

    .line 124
    .line 125
    iget-object p0, p0, Lx70;->s:Ljava/lang/Object;

    .line 126
    .line 127
    move-object v6, p0

    .line 128
    check-cast v6, Lnl4;

    .line 129
    .line 130
    move-object v7, v1

    .line 131
    check-cast v7, Ljava/lang/Float;

    .line 132
    .line 133
    const/4 v9, 0x4

    .line 134
    invoke-direct/range {v3 .. v9}, Lx70;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lvd0;I)V

    .line 135
    .line 136
    .line 137
    return-object v3

    .line 138
    :pswitch_5
    move-object v8, p2

    .line 139
    new-instance v3, Lx70;

    .line 140
    .line 141
    iget-object p2, p0, Lx70;->r:Ljava/lang/Object;

    .line 142
    .line 143
    move-object v4, p2

    .line 144
    check-cast v4, Lp81;

    .line 145
    .line 146
    iget-object p0, p0, Lx70;->s:Ljava/lang/Object;

    .line 147
    .line 148
    move-object v5, p0

    .line 149
    check-cast v5, Lnl4;

    .line 150
    .line 151
    move-object v6, v1

    .line 152
    check-cast v6, Ljava/lang/Float;

    .line 153
    .line 154
    move-object v7, v8

    .line 155
    const/4 v8, 0x3

    .line 156
    invoke-direct/range {v3 .. v8}, Lx70;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/io/Serializable;Lvd0;I)V

    .line 157
    .line 158
    .line 159
    iput-object p1, v3, Lx70;->q:Ljava/lang/Object;

    .line 160
    .line 161
    return-object v3

    .line 162
    :pswitch_6
    move-object v8, p2

    .line 163
    new-instance v3, Lx70;

    .line 164
    .line 165
    iget-object p1, p0, Lx70;->q:Ljava/lang/Object;

    .line 166
    .line 167
    move-object v4, p1

    .line 168
    check-cast v4, Landroidx/work/impl/workers/ConstraintTrackingWorker;

    .line 169
    .line 170
    iget-object p1, p0, Lx70;->r:Ljava/lang/Object;

    .line 171
    .line 172
    move-object v5, p1

    .line 173
    check-cast v5, Loc2;

    .line 174
    .line 175
    iget-object p0, p0, Lx70;->s:Ljava/lang/Object;

    .line 176
    .line 177
    move-object v6, p0

    .line 178
    check-cast v6, Lc52;

    .line 179
    .line 180
    move-object v7, v1

    .line 181
    check-cast v7, Ldd5;

    .line 182
    .line 183
    const/4 v9, 0x2

    .line 184
    invoke-direct/range {v3 .. v9}, Lx70;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lvd0;I)V

    .line 185
    .line 186
    .line 187
    return-object v3

    .line 188
    :pswitch_7
    move-object v8, p2

    .line 189
    new-instance v3, Lx70;

    .line 190
    .line 191
    iget-object p1, p0, Lx70;->q:Ljava/lang/Object;

    .line 192
    .line 193
    move-object v4, p1

    .line 194
    check-cast v4, Lc52;

    .line 195
    .line 196
    iget-object p1, p0, Lx70;->r:Ljava/lang/Object;

    .line 197
    .line 198
    move-object v5, p1

    .line 199
    check-cast v5, Ldd5;

    .line 200
    .line 201
    iget-object p0, p0, Lx70;->s:Ljava/lang/Object;

    .line 202
    .line 203
    move-object v6, p0

    .line 204
    check-cast v6, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 205
    .line 206
    move-object v7, v1

    .line 207
    check-cast v7, Lic2;

    .line 208
    .line 209
    const/4 v9, 0x1

    .line 210
    invoke-direct/range {v3 .. v9}, Lx70;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lvd0;I)V

    .line 211
    .line 212
    .line 213
    return-object v3

    .line 214
    :pswitch_8
    move-object v8, p2

    .line 215
    new-instance v3, Lx70;

    .line 216
    .line 217
    iget-object p1, p0, Lx70;->q:Ljava/lang/Object;

    .line 218
    .line 219
    move-object v4, p1

    .line 220
    check-cast v4, La80;

    .line 221
    .line 222
    iget-object p1, p0, Lx70;->r:Ljava/lang/Object;

    .line 223
    .line 224
    move-object v5, p1

    .line 225
    check-cast v5, Landroid/view/ScrollCaptureSession;

    .line 226
    .line 227
    iget-object p0, p0, Lx70;->s:Ljava/lang/Object;

    .line 228
    .line 229
    move-object v6, p0

    .line 230
    check-cast v6, Landroid/graphics/Rect;

    .line 231
    .line 232
    move-object v7, v1

    .line 233
    check-cast v7, Ljava/util/function/Consumer;

    .line 234
    .line 235
    const/4 v9, 0x0

    .line 236
    invoke-direct/range {v3 .. v9}, Lx70;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lvd0;I)V

    .line 237
    .line 238
    .line 239
    return-object v3

    .line 240
    nop

    .line 241
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lx70;->o:I

    .line 2
    .line 3
    sget-object v1, Lxe0;->n:Lxe0;

    .line 4
    .line 5
    sget-object v2, Lj15;->a:Lj15;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p1, Lwe0;

    .line 11
    .line 12
    check-cast p2, Lvd0;

    .line 13
    .line 14
    invoke-virtual {p0, p1, p2}, Lx70;->create(Ljava/lang/Object;Lvd0;)Lvd0;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    check-cast p0, Lx70;

    .line 19
    .line 20
    invoke-virtual {p0, v2}, Lx70;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0

    .line 25
    :pswitch_0
    check-cast p1, Lwe0;

    .line 26
    .line 27
    check-cast p2, Lvd0;

    .line 28
    .line 29
    invoke-virtual {p0, p1, p2}, Lx70;->create(Ljava/lang/Object;Lvd0;)Lvd0;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    check-cast p0, Lx70;

    .line 34
    .line 35
    invoke-virtual {p0, v2}, Lx70;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, Lq81;

    .line 41
    .line 42
    check-cast p2, Lvd0;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, Lx70;->create(Ljava/lang/Object;Lvd0;)Lvd0;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, Lx70;

    .line 49
    .line 50
    invoke-virtual {p0, v2}, Lx70;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    return-object v1

    .line 54
    :pswitch_2
    check-cast p1, Lwe0;

    .line 55
    .line 56
    check-cast p2, Lvd0;

    .line 57
    .line 58
    invoke-virtual {p0, p1, p2}, Lx70;->create(Ljava/lang/Object;Lvd0;)Lvd0;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    check-cast p0, Lx70;

    .line 63
    .line 64
    invoke-virtual {p0, v2}, Lx70;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    return-object p0

    .line 69
    :pswitch_3
    check-cast p1, Lwe0;

    .line 70
    .line 71
    check-cast p2, Lvd0;

    .line 72
    .line 73
    invoke-virtual {p0, p1, p2}, Lx70;->create(Ljava/lang/Object;Lvd0;)Lvd0;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    check-cast p0, Lx70;

    .line 78
    .line 79
    invoke-virtual {p0, v2}, Lx70;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    return-object v1

    .line 83
    :pswitch_4
    check-cast p1, Lwe0;

    .line 84
    .line 85
    check-cast p2, Lvd0;

    .line 86
    .line 87
    invoke-virtual {p0, p1, p2}, Lx70;->create(Ljava/lang/Object;Lvd0;)Lvd0;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    check-cast p0, Lx70;

    .line 92
    .line 93
    invoke-virtual {p0, v2}, Lx70;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    return-object p0

    .line 98
    :pswitch_5
    check-cast p1, Lgd4;

    .line 99
    .line 100
    check-cast p2, Lvd0;

    .line 101
    .line 102
    invoke-virtual {p0, p1, p2}, Lx70;->create(Ljava/lang/Object;Lvd0;)Lvd0;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    check-cast p0, Lx70;

    .line 107
    .line 108
    invoke-virtual {p0, v2}, Lx70;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    return-object p0

    .line 113
    :pswitch_6
    check-cast p1, Lwe0;

    .line 114
    .line 115
    check-cast p2, Lvd0;

    .line 116
    .line 117
    invoke-virtual {p0, p1, p2}, Lx70;->create(Ljava/lang/Object;Lvd0;)Lvd0;

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    check-cast p0, Lx70;

    .line 122
    .line 123
    invoke-virtual {p0, v2}, Lx70;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    return-object p0

    .line 128
    :pswitch_7
    check-cast p1, Lwe0;

    .line 129
    .line 130
    check-cast p2, Lvd0;

    .line 131
    .line 132
    invoke-virtual {p0, p1, p2}, Lx70;->create(Ljava/lang/Object;Lvd0;)Lvd0;

    .line 133
    .line 134
    .line 135
    move-result-object p0

    .line 136
    check-cast p0, Lx70;

    .line 137
    .line 138
    invoke-virtual {p0, v2}, Lx70;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object p0

    .line 142
    return-object p0

    .line 143
    :pswitch_8
    check-cast p1, Lwe0;

    .line 144
    .line 145
    check-cast p2, Lvd0;

    .line 146
    .line 147
    invoke-virtual {p0, p1, p2}, Lx70;->create(Ljava/lang/Object;Lvd0;)Lvd0;

    .line 148
    .line 149
    .line 150
    move-result-object p0

    .line 151
    check-cast p0, Lx70;

    .line 152
    .line 153
    invoke-virtual {p0, v2}, Lx70;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object p0

    .line 157
    return-object p0

    .line 158
    nop

    .line 159
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lx70;->o:I

    .line 4
    .line 5
    const/4 v2, 0x3

    .line 6
    sget-object v3, Lj15;->a:Lj15;

    .line 7
    .line 8
    const/4 v4, 0x2

    .line 9
    iget-object v5, v0, Lx70;->t:Ljava/lang/Object;

    .line 10
    .line 11
    const-string v6, "call to \'resume\' before \'invoke\' with coroutine"

    .line 12
    .line 13
    sget-object v7, Lxe0;->n:Lxe0;

    .line 14
    .line 15
    const/4 v8, 0x1

    .line 16
    const/4 v9, 0x0

    .line 17
    packed-switch v1, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    iget-object v1, v0, Lx70;->r:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v1, Ldd5;

    .line 23
    .line 24
    iget-object v1, v1, Ldd5;->c:Ljava/lang/String;

    .line 25
    .line 26
    iget-object v2, v0, Lx70;->q:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v2, Loc2;

    .line 29
    .line 30
    iget v3, v0, Lx70;->p:I

    .line 31
    .line 32
    if-eqz v3, :cond_2

    .line 33
    .line 34
    if-eq v3, v8, :cond_1

    .line 35
    .line 36
    if-ne v3, v4, :cond_0

    .line 37
    .line 38
    invoke-static/range {p1 .. p1}, Lkb4;->X(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    move-object/from16 v9, p1

    .line 42
    .line 43
    goto/16 :goto_2

    .line 44
    .line 45
    :cond_0
    invoke-static {v6}, Lkf2;->o(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    goto/16 :goto_2

    .line 49
    .line 50
    :cond_1
    invoke-static/range {p1 .. p1}, Lkb4;->X(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    move-object/from16 v3, p1

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_2
    invoke-static/range {p1 .. p1}, Lkb4;->X(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v2}, Loc2;->a()Lry;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    iput v8, v0, Lx70;->p:I

    .line 64
    .line 65
    invoke-static {v3, v2, v0}, Lud5;->a(Lic2;Loc2;Lep4;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    if-ne v3, v7, :cond_3

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_3
    :goto_0
    move-object v13, v3

    .line 73
    check-cast v13, Lmb1;

    .line 74
    .line 75
    if-eqz v13, :cond_5

    .line 76
    .line 77
    sget-object v3, Lpc5;->a:Ljava/lang/String;

    .line 78
    .line 79
    invoke-static {}, Lcx;->f()Lcx;

    .line 80
    .line 81
    .line 82
    move-result-object v6

    .line 83
    new-instance v8, Ljava/lang/StringBuilder;

    .line 84
    .line 85
    const-string v9, "Updating notification for "

    .line 86
    .line 87
    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    invoke-virtual {v6, v3, v1}, Lcx;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    iget-object v1, v0, Lx70;->s:Ljava/lang/Object;

    .line 101
    .line 102
    move-object v11, v1

    .line 103
    check-cast v11, Lqc5;

    .line 104
    .line 105
    move-object v14, v5

    .line 106
    check-cast v14, Landroid/content/Context;

    .line 107
    .line 108
    iget-object v1, v2, Loc2;->b:Landroidx/work/WorkerParameters;

    .line 109
    .line 110
    iget-object v12, v1, Landroidx/work/WorkerParameters;->a:Ljava/util/UUID;

    .line 111
    .line 112
    iget-object v1, v11, Lqc5;->a:Lbq4;

    .line 113
    .line 114
    iget-object v1, v1, Lbq4;->n:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast v1, Lia4;

    .line 117
    .line 118
    new-instance v10, Luy1;

    .line 119
    .line 120
    const/4 v15, 0x2

    .line 121
    invoke-direct/range {v10 .. v15}, Luy1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    new-instance v2, Lef0;

    .line 128
    .line 129
    const/16 v3, 0x9

    .line 130
    .line 131
    invoke-direct {v2, v3, v1, v10}, Lef0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    invoke-static {v2}, Lvr1;->v(Lpy;)Lry;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    iput v4, v0, Lx70;->p:I

    .line 139
    .line 140
    invoke-static {v1, v0}, Lfu;->e(Lic2;Lep4;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    if-ne v0, v7, :cond_4

    .line 145
    .line 146
    :goto_1
    move-object v9, v7

    .line 147
    goto :goto_2

    .line 148
    :cond_4
    move-object v9, v0

    .line 149
    goto :goto_2

    .line 150
    :cond_5
    const-string v0, "Worker was marked important ("

    .line 151
    .line 152
    const-string v2, ") but did not provide ForegroundInfo"

    .line 153
    .line 154
    invoke-static {v0, v1, v2}, Lxa3;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    invoke-static {v0}, Lkf2;->o(Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    :goto_2
    return-object v9

    .line 162
    :pswitch_0
    check-cast v5, Led1;

    .line 163
    .line 164
    iget-object v1, v0, Lx70;->s:Ljava/lang/Object;

    .line 165
    .line 166
    check-cast v1, Lba2;

    .line 167
    .line 168
    iget-object v2, v0, Lx70;->r:Ljava/lang/Object;

    .line 169
    .line 170
    move-object v11, v2

    .line 171
    check-cast v11, Ltv3;

    .line 172
    .line 173
    iget v2, v0, Lx70;->p:I

    .line 174
    .line 175
    if-eqz v2, :cond_7

    .line 176
    .line 177
    if-ne v2, v8, :cond_6

    .line 178
    .line 179
    :try_start_0
    invoke-static/range {p1 .. p1}, Lkb4;->X(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 180
    .line 181
    .line 182
    goto :goto_5

    .line 183
    :catchall_0
    move-exception v0

    .line 184
    goto :goto_7

    .line 185
    :cond_6
    invoke-static {v6}, Lkf2;->o(Ljava/lang/String;)V

    .line 186
    .line 187
    .line 188
    move-object v3, v9

    .line 189
    goto :goto_6

    .line 190
    :cond_7
    invoke-static/range {p1 .. p1}, Lkb4;->X(Ljava/lang/Object;)V

    .line 191
    .line 192
    .line 193
    iget-object v2, v0, Lx70;->q:Ljava/lang/Object;

    .line 194
    .line 195
    check-cast v2, Ljx3;

    .line 196
    .line 197
    iget-object v2, v2, Ljx3;->n:Ljava/lang/Object;

    .line 198
    .line 199
    check-cast v2, Lrx2;

    .line 200
    .line 201
    if-eqz v2, :cond_8

    .line 202
    .line 203
    iget-object v4, v11, Ltv3;->x:Lne0;

    .line 204
    .line 205
    invoke-static {v4}, Lte5;->a(Lne0;)Ltd0;

    .line 206
    .line 207
    .line 208
    move-result-object v4

    .line 209
    iput-object v4, v2, Lrx2;->o:Ltd0;

    .line 210
    .line 211
    :cond_8
    :try_start_1
    iput v8, v0, Lx70;->p:I

    .line 212
    .line 213
    new-instance v12, Lsv3;

    .line 214
    .line 215
    const/4 v14, 0x0

    .line 216
    invoke-direct {v12, v11, v14}, Lsv3;-><init>(Ltv3;Lvd0;)V

    .line 217
    .line 218
    .line 219
    invoke-interface {v0}, Lvd0;->getContext()Lne0;

    .line 220
    .line 221
    .line 222
    move-result-object v2

    .line 223
    invoke-static {v2}, Lvr1;->x(Lne0;)Led;

    .line 224
    .line 225
    .line 226
    move-result-object v13

    .line 227
    iget-object v2, v11, Ltv3;->a:Led;

    .line 228
    .line 229
    new-instance v10, Lqv3;

    .line 230
    .line 231
    const/4 v15, 0x0

    .line 232
    invoke-direct/range {v10 .. v15}, Lqv3;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lvd0;I)V

    .line 233
    .line 234
    .line 235
    invoke-static {v2, v10, v0}, Lfu;->P(Lne0;Lwf1;Lwd0;)Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 239
    if-ne v0, v7, :cond_9

    .line 240
    .line 241
    goto :goto_3

    .line 242
    :cond_9
    move-object v0, v3

    .line 243
    :goto_3
    if-ne v0, v7, :cond_a

    .line 244
    .line 245
    goto :goto_4

    .line 246
    :cond_a
    move-object v0, v3

    .line 247
    :goto_4
    if-ne v0, v7, :cond_b

    .line 248
    .line 249
    move-object v3, v7

    .line 250
    goto :goto_6

    .line 251
    :cond_b
    :goto_5
    invoke-interface {v1}, Lba2;->h()Lea2;

    .line 252
    .line 253
    .line 254
    move-result-object v0

    .line 255
    invoke-virtual {v0, v5}, Lea2;->f(Laa2;)V

    .line 256
    .line 257
    .line 258
    :goto_6
    return-object v3

    .line 259
    :goto_7
    invoke-interface {v1}, Lba2;->h()Lea2;

    .line 260
    .line 261
    .line 262
    move-result-object v1

    .line 263
    invoke-virtual {v1, v5}, Lea2;->f(Laa2;)V

    .line 264
    .line 265
    .line 266
    throw v0

    .line 267
    :pswitch_1
    iget-object v1, v0, Lx70;->s:Ljava/lang/Object;

    .line 268
    .line 269
    check-cast v1, [I

    .line 270
    .line 271
    iget-object v3, v0, Lx70;->r:Ljava/lang/Object;

    .line 272
    .line 273
    check-cast v3, Ljy4;

    .line 274
    .line 275
    iget v10, v0, Lx70;->p:I

    .line 276
    .line 277
    if-eqz v10, :cond_f

    .line 278
    .line 279
    if-eq v10, v8, :cond_e

    .line 280
    .line 281
    if-eq v10, v4, :cond_d

    .line 282
    .line 283
    if-eq v10, v2, :cond_c

    .line 284
    .line 285
    invoke-static {v6}, Lkf2;->o(Ljava/lang/String;)V

    .line 286
    .line 287
    .line 288
    move-object v7, v9

    .line 289
    goto :goto_a

    .line 290
    :cond_c
    :try_start_2
    invoke-static/range {p1 .. p1}, Lkb4;->X(Ljava/lang/Object;)V

    .line 291
    .line 292
    .line 293
    new-instance v0, Lkotlin/KotlinNothingValueException;

    .line 294
    .line 295
    invoke-direct {v0}, Lkotlin/KotlinNothingValueException;-><init>()V

    .line 296
    .line 297
    .line 298
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 299
    :catchall_1
    move-exception v0

    .line 300
    goto :goto_b

    .line 301
    :cond_d
    iget-object v4, v0, Lx70;->q:Ljava/lang/Object;

    .line 302
    .line 303
    check-cast v4, Lq81;

    .line 304
    .line 305
    invoke-static/range {p1 .. p1}, Lkb4;->X(Ljava/lang/Object;)V

    .line 306
    .line 307
    .line 308
    goto :goto_9

    .line 309
    :cond_e
    iget-object v6, v0, Lx70;->q:Ljava/lang/Object;

    .line 310
    .line 311
    check-cast v6, Lq81;

    .line 312
    .line 313
    invoke-static/range {p1 .. p1}, Lkb4;->X(Ljava/lang/Object;)V

    .line 314
    .line 315
    .line 316
    move-object/from16 v8, p1

    .line 317
    .line 318
    goto :goto_8

    .line 319
    :cond_f
    invoke-static/range {p1 .. p1}, Lkb4;->X(Ljava/lang/Object;)V

    .line 320
    .line 321
    .line 322
    iget-object v6, v0, Lx70;->q:Ljava/lang/Object;

    .line 323
    .line 324
    check-cast v6, Lq81;

    .line 325
    .line 326
    iget-object v10, v3, Ljy4;->h:Lll;

    .line 327
    .line 328
    invoke-virtual {v10, v1}, Lll;->j([I)Z

    .line 329
    .line 330
    .line 331
    move-result v10

    .line 332
    if-eqz v10, :cond_12

    .line 333
    .line 334
    iget-object v10, v3, Ljy4;->a:Ls24;

    .line 335
    .line 336
    iput-object v6, v0, Lx70;->q:Ljava/lang/Object;

    .line 337
    .line 338
    iput v8, v0, Lx70;->p:I

    .line 339
    .line 340
    invoke-static {v10, v0}, Lxl;->o(Ls24;Lwd0;)Lne0;

    .line 341
    .line 342
    .line 343
    move-result-object v8

    .line 344
    if-ne v8, v7, :cond_10

    .line 345
    .line 346
    goto :goto_a

    .line 347
    :cond_10
    :goto_8
    check-cast v8, Lne0;

    .line 348
    .line 349
    new-instance v10, Lac0;

    .line 350
    .line 351
    const/16 v11, 0x8

    .line 352
    .line 353
    invoke-direct {v10, v3, v9, v11}, Lac0;-><init>(Ljava/lang/Object;Lvd0;I)V

    .line 354
    .line 355
    .line 356
    iput-object v6, v0, Lx70;->q:Ljava/lang/Object;

    .line 357
    .line 358
    iput v4, v0, Lx70;->p:I

    .line 359
    .line 360
    invoke-static {v8, v10, v0}, Lfu;->P(Lne0;Lwf1;Lwd0;)Ljava/lang/Object;

    .line 361
    .line 362
    .line 363
    move-result-object v4

    .line 364
    if-ne v4, v7, :cond_11

    .line 365
    .line 366
    goto :goto_a

    .line 367
    :cond_11
    move-object v4, v6

    .line 368
    :goto_9
    move-object v6, v4

    .line 369
    :cond_12
    :try_start_3
    new-instance v4, Ljx3;

    .line 370
    .line 371
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 372
    .line 373
    .line 374
    iget-object v8, v3, Ljy4;->i:Lom1;

    .line 375
    .line 376
    new-instance v10, Le10;

    .line 377
    .line 378
    check-cast v5, [Ljava/lang/String;

    .line 379
    .line 380
    invoke-direct {v10, v4, v6, v5, v1}, Le10;-><init>(Ljx3;Lq81;[Ljava/lang/String;[I)V

    .line 381
    .line 382
    .line 383
    iput-object v9, v0, Lx70;->q:Ljava/lang/Object;

    .line 384
    .line 385
    iput v2, v0, Lx70;->p:I

    .line 386
    .line 387
    invoke-virtual {v8, v10, v0}, Lom1;->f(Le10;Lwd0;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 388
    .line 389
    .line 390
    :goto_a
    return-object v7

    .line 391
    :goto_b
    iget-object v2, v3, Ljy4;->h:Lll;

    .line 392
    .line 393
    invoke-virtual {v2, v1}, Lll;->k([I)Z

    .line 394
    .line 395
    .line 396
    throw v0

    .line 397
    :pswitch_2
    check-cast v5, Lhw4;

    .line 398
    .line 399
    iget v1, v0, Lx70;->p:I

    .line 400
    .line 401
    if-eqz v1, :cond_15

    .line 402
    .line 403
    if-eq v1, v8, :cond_14

    .line 404
    .line 405
    if-ne v1, v4, :cond_13

    .line 406
    .line 407
    iget-object v1, v0, Lx70;->s:Ljava/lang/Object;

    .line 408
    .line 409
    check-cast v1, Lwe0;

    .line 410
    .line 411
    :try_start_4
    invoke-static/range {p1 .. p1}, Lkb4;->X(Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 412
    .line 413
    .line 414
    goto :goto_c

    .line 415
    :catchall_2
    move-exception v0

    .line 416
    goto/16 :goto_10

    .line 417
    .line 418
    :cond_13
    invoke-static {v6}, Lkf2;->o(Ljava/lang/String;)V

    .line 419
    .line 420
    .line 421
    move-object v3, v9

    .line 422
    goto :goto_f

    .line 423
    :cond_14
    iget-object v1, v0, Lx70;->r:Ljava/lang/Object;

    .line 424
    .line 425
    check-cast v1, Lg74;

    .line 426
    .line 427
    iget-object v2, v0, Lx70;->q:Ljava/lang/Object;

    .line 428
    .line 429
    check-cast v2, Lhw4;

    .line 430
    .line 431
    iget-object v6, v0, Lx70;->s:Ljava/lang/Object;

    .line 432
    .line 433
    check-cast v6, Lwe0;

    .line 434
    .line 435
    :try_start_5
    invoke-static/range {p1 .. p1}, Lkb4;->X(Ljava/lang/Object;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 436
    .line 437
    .line 438
    move-object v10, v2

    .line 439
    move-object v2, v6

    .line 440
    move-object/from16 v6, p1

    .line 441
    .line 442
    goto :goto_d

    .line 443
    :cond_15
    invoke-static/range {p1 .. p1}, Lkb4;->X(Ljava/lang/Object;)V

    .line 444
    .line 445
    .line 446
    iget-object v1, v0, Lx70;->s:Ljava/lang/Object;

    .line 447
    .line 448
    check-cast v1, Lwe0;

    .line 449
    .line 450
    :goto_c
    :try_start_6
    invoke-interface {v1}, Lwe0;->e()Lne0;

    .line 451
    .line 452
    .line 453
    move-result-object v2

    .line 454
    invoke-static {v2}, Lgb;->L(Lne0;)Z

    .line 455
    .line 456
    .line 457
    move-result v2

    .line 458
    if-eqz v2, :cond_18

    .line 459
    .line 460
    iget-object v2, v5, Lir2;->b:Ljava/lang/Object;

    .line 461
    .line 462
    check-cast v2, Lg74;

    .line 463
    .line 464
    iget-object v6, v5, Lhw4;->f:Law;

    .line 465
    .line 466
    iput-object v1, v0, Lx70;->s:Ljava/lang/Object;

    .line 467
    .line 468
    iput-object v5, v0, Lx70;->q:Ljava/lang/Object;

    .line 469
    .line 470
    iput-object v2, v0, Lx70;->r:Ljava/lang/Object;

    .line 471
    .line 472
    iput v8, v0, Lx70;->p:I

    .line 473
    .line 474
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 475
    .line 476
    .line 477
    invoke-static {v6, v0}, Law;->H(Law;Lep4;)Ljava/lang/Object;

    .line 478
    .line 479
    .line 480
    move-result-object v6

    .line 481
    if-ne v6, v7, :cond_16

    .line 482
    .line 483
    goto :goto_e

    .line 484
    :cond_16
    move-object v10, v2

    .line 485
    move-object v2, v1

    .line 486
    move-object v1, v10

    .line 487
    move-object v10, v5

    .line 488
    :goto_d
    check-cast v6, Lfw4;

    .line 489
    .line 490
    iput-object v2, v0, Lx70;->s:Ljava/lang/Object;

    .line 491
    .line 492
    iput-object v9, v0, Lx70;->q:Ljava/lang/Object;

    .line 493
    .line 494
    iput-object v9, v0, Lx70;->r:Ljava/lang/Object;

    .line 495
    .line 496
    iput v4, v0, Lx70;->p:I

    .line 497
    .line 498
    invoke-static {v10, v1, v6, v0}, Lhw4;->E(Lhw4;Lg74;Lfw4;Lwd0;)Ljava/lang/Object;

    .line 499
    .line 500
    .line 501
    move-result-object v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 502
    if-ne v1, v7, :cond_17

    .line 503
    .line 504
    :goto_e
    move-object v3, v7

    .line 505
    goto :goto_f

    .line 506
    :cond_17
    move-object v1, v2

    .line 507
    goto :goto_c

    .line 508
    :cond_18
    iput-object v9, v5, Lhw4;->g:Lsk4;

    .line 509
    .line 510
    :goto_f
    return-object v3

    .line 511
    :goto_10
    iput-object v9, v5, Lhw4;->g:Lsk4;

    .line 512
    .line 513
    throw v0

    .line 514
    :pswitch_3
    iget v1, v0, Lx70;->p:I

    .line 515
    .line 516
    if-eqz v1, :cond_1b

    .line 517
    .line 518
    if-eq v1, v8, :cond_1a

    .line 519
    .line 520
    if-ne v1, v4, :cond_19

    .line 521
    .line 522
    iget-object v1, v0, Lx70;->q:Ljava/lang/Object;

    .line 523
    .line 524
    check-cast v1, Lgx3;

    .line 525
    .line 526
    iget-object v2, v0, Lx70;->r:Ljava/lang/Object;

    .line 527
    .line 528
    check-cast v2, Lwe0;

    .line 529
    .line 530
    invoke-static/range {p1 .. p1}, Lkb4;->X(Ljava/lang/Object;)V

    .line 531
    .line 532
    .line 533
    move-object v13, v1

    .line 534
    move-object v14, v2

    .line 535
    goto :goto_12

    .line 536
    :cond_19
    invoke-static {v6}, Lkf2;->o(Ljava/lang/String;)V

    .line 537
    .line 538
    .line 539
    :goto_11
    move-object v7, v9

    .line 540
    goto/16 :goto_14

    .line 541
    .line 542
    :cond_1a
    iget-object v1, v0, Lx70;->q:Ljava/lang/Object;

    .line 543
    .line 544
    check-cast v1, Lgx3;

    .line 545
    .line 546
    iget-object v2, v0, Lx70;->r:Ljava/lang/Object;

    .line 547
    .line 548
    check-cast v2, Lwe0;

    .line 549
    .line 550
    invoke-static/range {p1 .. p1}, Lkb4;->X(Ljava/lang/Object;)V

    .line 551
    .line 552
    .line 553
    move-object v13, v1

    .line 554
    move-object v14, v2

    .line 555
    goto :goto_13

    .line 556
    :cond_1b
    invoke-static/range {p1 .. p1}, Lkb4;->X(Ljava/lang/Object;)V

    .line 557
    .line 558
    .line 559
    iget-object v1, v0, Lx70;->r:Ljava/lang/Object;

    .line 560
    .line 561
    check-cast v1, Lwe0;

    .line 562
    .line 563
    new-instance v2, Lgx3;

    .line 564
    .line 565
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 566
    .line 567
    .line 568
    const/high16 v3, 0x3f800000    # 1.0f

    .line 569
    .line 570
    iput v3, v2, Lgx3;->n:F

    .line 571
    .line 572
    move-object v14, v1

    .line 573
    move-object v13, v2

    .line 574
    :cond_1c
    :goto_12
    iget-object v1, v0, Lx70;->s:Ljava/lang/Object;

    .line 575
    .line 576
    move-object v11, v1

    .line 577
    check-cast v11, Lb13;

    .line 578
    .line 579
    move-object v12, v5

    .line 580
    check-cast v12, Lty1;

    .line 581
    .line 582
    new-instance v10, Lry1;

    .line 583
    .line 584
    const/4 v15, 0x0

    .line 585
    invoke-direct/range {v10 .. v15}, Lry1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 586
    .line 587
    .line 588
    iput-object v14, v0, Lx70;->r:Ljava/lang/Object;

    .line 589
    .line 590
    iput-object v13, v0, Lx70;->q:Ljava/lang/Object;

    .line 591
    .line 592
    iput v8, v0, Lx70;->p:I

    .line 593
    .line 594
    invoke-interface {v0}, Lvd0;->getContext()Lne0;

    .line 595
    .line 596
    .line 597
    move-result-object v1

    .line 598
    sget-object v2, Lfz0;->g0:Lfz0;

    .line 599
    .line 600
    invoke-interface {v1, v2}, Lne0;->K(Lme0;)Lle0;

    .line 601
    .line 602
    .line 603
    move-result-object v1

    .line 604
    if-nez v1, :cond_1e

    .line 605
    .line 606
    invoke-interface {v0}, Lvd0;->getContext()Lne0;

    .line 607
    .line 608
    .line 609
    move-result-object v1

    .line 610
    invoke-static {v1}, Lvr1;->x(Lne0;)Led;

    .line 611
    .line 612
    .line 613
    move-result-object v1

    .line 614
    invoke-virtual {v1, v10, v0}, Led;->a(Lif1;Lwd0;)Ljava/lang/Object;

    .line 615
    .line 616
    .line 617
    move-result-object v1

    .line 618
    if-ne v1, v7, :cond_1d

    .line 619
    .line 620
    goto :goto_14

    .line 621
    :cond_1d
    :goto_13
    iget v1, v13, Lgx3;->n:F

    .line 622
    .line 623
    const/4 v2, 0x0

    .line 624
    cmpg-float v1, v1, v2

    .line 625
    .line 626
    if-nez v1, :cond_1c

    .line 627
    .line 628
    new-instance v1, Lwc;

    .line 629
    .line 630
    const/4 v2, 0x7

    .line 631
    invoke-direct {v1, v2, v14}, Lwc;-><init>(ILjava/lang/Object;)V

    .line 632
    .line 633
    .line 634
    new-instance v2, Lqv3;

    .line 635
    .line 636
    invoke-direct {v2, v1, v9}, Lqv3;-><init>(Lgf1;Lvd0;)V

    .line 637
    .line 638
    .line 639
    new-instance v1, Lgc0;

    .line 640
    .line 641
    invoke-direct {v1, v8, v2}, Lgc0;-><init>(ILjava/lang/Object;)V

    .line 642
    .line 643
    .line 644
    new-instance v2, Lsy1;

    .line 645
    .line 646
    invoke-direct {v2, v4, v9}, Lep4;-><init>(ILvd0;)V

    .line 647
    .line 648
    .line 649
    iput-object v14, v0, Lx70;->r:Ljava/lang/Object;

    .line 650
    .line 651
    iput-object v13, v0, Lx70;->q:Ljava/lang/Object;

    .line 652
    .line 653
    iput v4, v0, Lx70;->p:I

    .line 654
    .line 655
    invoke-static {v1, v2, v0}, Lya4;->q(Lp81;Lwf1;Lwd0;)Ljava/lang/Object;

    .line 656
    .line 657
    .line 658
    move-result-object v1

    .line 659
    if-ne v1, v7, :cond_1c

    .line 660
    .line 661
    goto :goto_14

    .line 662
    :cond_1e
    invoke-static {}, Lkf2;->k()V

    .line 663
    .line 664
    .line 665
    goto :goto_11

    .line 666
    :goto_14
    return-object v7

    .line 667
    :pswitch_4
    iget-object v1, v0, Lx70;->r:Ljava/lang/Object;

    .line 668
    .line 669
    move-object v11, v1

    .line 670
    check-cast v11, Lp81;

    .line 671
    .line 672
    iget-object v1, v0, Lx70;->s:Ljava/lang/Object;

    .line 673
    .line 674
    move-object v12, v1

    .line 675
    check-cast v12, Lnl4;

    .line 676
    .line 677
    iget v1, v0, Lx70;->p:I

    .line 678
    .line 679
    const/4 v10, 0x4

    .line 680
    if-eqz v1, :cond_22

    .line 681
    .line 682
    if-eq v1, v8, :cond_21

    .line 683
    .line 684
    if-eq v1, v4, :cond_20

    .line 685
    .line 686
    if-eq v1, v2, :cond_21

    .line 687
    .line 688
    if-ne v1, v10, :cond_1f

    .line 689
    .line 690
    goto :goto_15

    .line 691
    :cond_1f
    invoke-static {v6}, Lkf2;->o(Ljava/lang/String;)V

    .line 692
    .line 693
    .line 694
    move-object v3, v9

    .line 695
    goto/16 :goto_1a

    .line 696
    .line 697
    :cond_20
    invoke-static/range {p1 .. p1}, Lkb4;->X(Ljava/lang/Object;)V

    .line 698
    .line 699
    .line 700
    goto :goto_16

    .line 701
    :cond_21
    :goto_15
    invoke-static/range {p1 .. p1}, Lkb4;->X(Ljava/lang/Object;)V

    .line 702
    .line 703
    .line 704
    goto/16 :goto_1a

    .line 705
    .line 706
    :cond_22
    invoke-static/range {p1 .. p1}, Lkb4;->X(Ljava/lang/Object;)V

    .line 707
    .line 708
    .line 709
    iget-object v1, v0, Lx70;->q:Ljava/lang/Object;

    .line 710
    .line 711
    check-cast v1, Lil4;

    .line 712
    .line 713
    sget-object v6, Lid4;->a:Lxi4;

    .line 714
    .line 715
    if-ne v1, v6, :cond_23

    .line 716
    .line 717
    iput v8, v0, Lx70;->p:I

    .line 718
    .line 719
    invoke-interface {v11, v12, v0}, Lp81;->a(Lq81;Lvd0;)Ljava/lang/Object;

    .line 720
    .line 721
    .line 722
    move-result-object v0

    .line 723
    if-ne v0, v7, :cond_28

    .line 724
    .line 725
    goto/16 :goto_19

    .line 726
    .line 727
    :cond_23
    sget-object v6, Lid4;->b:Lxi4;

    .line 728
    .line 729
    const/4 v14, 0x0

    .line 730
    if-ne v1, v6, :cond_25

    .line 731
    .line 732
    invoke-virtual {v12}, Lm2;->h()Lon4;

    .line 733
    .line 734
    .line 735
    move-result-object v1

    .line 736
    new-instance v5, Lf91;

    .line 737
    .line 738
    invoke-direct {v5, v4, v14}, Lep4;-><init>(ILvd0;)V

    .line 739
    .line 740
    .line 741
    iput v4, v0, Lx70;->p:I

    .line 742
    .line 743
    invoke-static {v1, v5, v0}, Lya4;->q(Lp81;Lwf1;Lwd0;)Ljava/lang/Object;

    .line 744
    .line 745
    .line 746
    move-result-object v1

    .line 747
    if-ne v1, v7, :cond_24

    .line 748
    .line 749
    goto/16 :goto_19

    .line 750
    .line 751
    :cond_24
    :goto_16
    iput v2, v0, Lx70;->p:I

    .line 752
    .line 753
    invoke-interface {v11, v12, v0}, Lp81;->a(Lq81;Lvd0;)Ljava/lang/Object;

    .line 754
    .line 755
    .line 756
    move-result-object v0

    .line 757
    if-ne v0, v7, :cond_28

    .line 758
    .line 759
    goto :goto_19

    .line 760
    :cond_25
    invoke-virtual {v12}, Lm2;->h()Lon4;

    .line 761
    .line 762
    .line 763
    move-result-object v17

    .line 764
    new-instance v2, Lhl4;

    .line 765
    .line 766
    invoke-direct {v2, v1, v14}, Lhl4;-><init>(Lil4;Lvd0;)V

    .line 767
    .line 768
    .line 769
    sget v1, Lb91;->a:I

    .line 770
    .line 771
    new-instance v15, Lf10;

    .line 772
    .line 773
    sget-object v18, Lq01;->n:Lq01;

    .line 774
    .line 775
    const/16 v19, -0x2

    .line 776
    .line 777
    sget-object v20, Lwv;->n:Lwv;

    .line 778
    .line 779
    move-object/from16 v16, v2

    .line 780
    .line 781
    invoke-direct/range {v15 .. v20}, Lf10;-><init>(Lxf1;Lp81;Lne0;ILwv;)V

    .line 782
    .line 783
    .line 784
    new-instance v1, Lpv3;

    .line 785
    .line 786
    invoke-direct {v1, v4, v14, v8}, Lpv3;-><init>(ILvd0;I)V

    .line 787
    .line 788
    .line 789
    new-instance v2, Lx81;

    .line 790
    .line 791
    invoke-direct {v2, v15, v1, v8}, Lx81;-><init>(Lp81;Lsf1;I)V

    .line 792
    .line 793
    .line 794
    invoke-static {v2}, Lya4;->m(Lp81;)Lp81;

    .line 795
    .line 796
    .line 797
    move-result-object v1

    .line 798
    invoke-static {v1}, Lya4;->m(Lp81;)Lp81;

    .line 799
    .line 800
    .line 801
    move-result-object v1

    .line 802
    move v2, v10

    .line 803
    new-instance v10, Lx70;

    .line 804
    .line 805
    move-object v13, v5

    .line 806
    check-cast v13, Ljava/lang/Float;

    .line 807
    .line 808
    const/4 v15, 0x3

    .line 809
    invoke-direct/range {v10 .. v15}, Lx70;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/io/Serializable;Lvd0;I)V

    .line 810
    .line 811
    .line 812
    iput v2, v0, Lx70;->p:I

    .line 813
    .line 814
    new-instance v2, La91;

    .line 815
    .line 816
    invoke-direct {v2, v10, v14}, La91;-><init>(Lwf1;Lvd0;)V

    .line 817
    .line 818
    .line 819
    move-object/from16 v21, v18

    .line 820
    .line 821
    new-instance v18, Lf10;

    .line 822
    .line 823
    const/16 v22, -0x2

    .line 824
    .line 825
    move-object/from16 v19, v2

    .line 826
    .line 827
    move-object/from16 v23, v20

    .line 828
    .line 829
    move-object/from16 v20, v1

    .line 830
    .line 831
    invoke-direct/range {v18 .. v23}, Lf10;-><init>(Lxf1;Lp81;Lne0;ILwv;)V

    .line 832
    .line 833
    .line 834
    move-object/from16 v1, v18

    .line 835
    .line 836
    const/4 v2, 0x0

    .line 837
    invoke-static {v1, v2}, Lya4;->e(Lp81;I)Lp81;

    .line 838
    .line 839
    .line 840
    move-result-object v1

    .line 841
    sget-object v2, Ln63;->n:Ln63;

    .line 842
    .line 843
    invoke-interface {v1, v2, v0}, Lp81;->a(Lq81;Lvd0;)Ljava/lang/Object;

    .line 844
    .line 845
    .line 846
    move-result-object v0

    .line 847
    if-ne v0, v7, :cond_26

    .line 848
    .line 849
    goto :goto_17

    .line 850
    :cond_26
    move-object v0, v3

    .line 851
    :goto_17
    if-ne v0, v7, :cond_27

    .line 852
    .line 853
    goto :goto_18

    .line 854
    :cond_27
    move-object v0, v3

    .line 855
    :goto_18
    if-ne v0, v7, :cond_28

    .line 856
    .line 857
    :goto_19
    move-object v3, v7

    .line 858
    :cond_28
    :goto_1a
    return-object v3

    .line 859
    :pswitch_5
    iget-object v1, v0, Lx70;->s:Ljava/lang/Object;

    .line 860
    .line 861
    check-cast v1, Lnl4;

    .line 862
    .line 863
    iget v2, v0, Lx70;->p:I

    .line 864
    .line 865
    if-eqz v2, :cond_2a

    .line 866
    .line 867
    if-ne v2, v8, :cond_29

    .line 868
    .line 869
    invoke-static/range {p1 .. p1}, Lkb4;->X(Ljava/lang/Object;)V

    .line 870
    .line 871
    .line 872
    goto :goto_1c

    .line 873
    :cond_29
    invoke-static {v6}, Lkf2;->o(Ljava/lang/String;)V

    .line 874
    .line 875
    .line 876
    :goto_1b
    move-object v3, v9

    .line 877
    goto :goto_1c

    .line 878
    :cond_2a
    invoke-static/range {p1 .. p1}, Lkb4;->X(Ljava/lang/Object;)V

    .line 879
    .line 880
    .line 881
    iget-object v2, v0, Lx70;->q:Ljava/lang/Object;

    .line 882
    .line 883
    check-cast v2, Lgd4;

    .line 884
    .line 885
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 886
    .line 887
    .line 888
    move-result v2

    .line 889
    if-eqz v2, :cond_2d

    .line 890
    .line 891
    if-eq v2, v8, :cond_2e

    .line 892
    .line 893
    if-ne v2, v4, :cond_2c

    .line 894
    .line 895
    check-cast v5, Ljava/lang/Float;

    .line 896
    .line 897
    sget-object v0, Lg12;->e:Lf01;

    .line 898
    .line 899
    if-eq v5, v0, :cond_2b

    .line 900
    .line 901
    invoke-virtual {v1, v9, v5}, Lnl4;->j(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 902
    .line 903
    .line 904
    goto :goto_1c

    .line 905
    :cond_2b
    const-string v0, "MutableStateFlow.resetReplayCache is not supported"

    .line 906
    .line 907
    invoke-static {v0}, Ler1;->l(Ljava/lang/String;)V

    .line 908
    .line 909
    .line 910
    goto :goto_1b

    .line 911
    :cond_2c
    invoke-static {}, Ler1;->n()V

    .line 912
    .line 913
    .line 914
    goto :goto_1b

    .line 915
    :cond_2d
    iget-object v2, v0, Lx70;->r:Ljava/lang/Object;

    .line 916
    .line 917
    check-cast v2, Lp81;

    .line 918
    .line 919
    iput v8, v0, Lx70;->p:I

    .line 920
    .line 921
    invoke-interface {v2, v1, v0}, Lp81;->a(Lq81;Lvd0;)Ljava/lang/Object;

    .line 922
    .line 923
    .line 924
    move-result-object v0

    .line 925
    if-ne v0, v7, :cond_2e

    .line 926
    .line 927
    move-object v3, v7

    .line 928
    :cond_2e
    :goto_1c
    return-object v3

    .line 929
    :pswitch_6
    iget v1, v0, Lx70;->p:I

    .line 930
    .line 931
    if-eqz v1, :cond_30

    .line 932
    .line 933
    if-ne v1, v8, :cond_2f

    .line 934
    .line 935
    invoke-static/range {p1 .. p1}, Lkb4;->X(Ljava/lang/Object;)V

    .line 936
    .line 937
    .line 938
    move-object/from16 v0, p1

    .line 939
    .line 940
    goto :goto_1d

    .line 941
    :cond_2f
    invoke-static {v6}, Lkf2;->o(Ljava/lang/String;)V

    .line 942
    .line 943
    .line 944
    move-object v0, v9

    .line 945
    goto :goto_1d

    .line 946
    :cond_30
    invoke-static/range {p1 .. p1}, Lkb4;->X(Ljava/lang/Object;)V

    .line 947
    .line 948
    .line 949
    iget-object v1, v0, Lx70;->q:Ljava/lang/Object;

    .line 950
    .line 951
    check-cast v1, Landroidx/work/impl/workers/ConstraintTrackingWorker;

    .line 952
    .line 953
    iget-object v2, v0, Lx70;->r:Ljava/lang/Object;

    .line 954
    .line 955
    check-cast v2, Loc2;

    .line 956
    .line 957
    iget-object v3, v0, Lx70;->s:Ljava/lang/Object;

    .line 958
    .line 959
    check-cast v3, Lc52;

    .line 960
    .line 961
    check-cast v5, Ldd5;

    .line 962
    .line 963
    iput v8, v0, Lx70;->p:I

    .line 964
    .line 965
    invoke-static {v1, v2, v3, v5, v0}, Landroidx/work/impl/workers/ConstraintTrackingWorker;->e(Landroidx/work/impl/workers/ConstraintTrackingWorker;Loc2;Lc52;Ldd5;Lwd0;)Ljava/lang/Object;

    .line 966
    .line 967
    .line 968
    move-result-object v0

    .line 969
    if-ne v0, v7, :cond_31

    .line 970
    .line 971
    move-object v0, v7

    .line 972
    :cond_31
    :goto_1d
    return-object v0

    .line 973
    :pswitch_7
    iget v1, v0, Lx70;->p:I

    .line 974
    .line 975
    if-eqz v1, :cond_33

    .line 976
    .line 977
    if-ne v1, v8, :cond_32

    .line 978
    .line 979
    invoke-static/range {p1 .. p1}, Lkb4;->X(Ljava/lang/Object;)V

    .line 980
    .line 981
    .line 982
    move-object/from16 v1, p1

    .line 983
    .line 984
    goto :goto_1e

    .line 985
    :cond_32
    invoke-static {v6}, Lkf2;->o(Ljava/lang/String;)V

    .line 986
    .line 987
    .line 988
    move-object v3, v9

    .line 989
    goto :goto_1f

    .line 990
    :cond_33
    invoke-static/range {p1 .. p1}, Lkb4;->X(Ljava/lang/Object;)V

    .line 991
    .line 992
    .line 993
    iget-object v1, v0, Lx70;->q:Ljava/lang/Object;

    .line 994
    .line 995
    check-cast v1, Lc52;

    .line 996
    .line 997
    iget-object v2, v0, Lx70;->r:Ljava/lang/Object;

    .line 998
    .line 999
    check-cast v2, Ldd5;

    .line 1000
    .line 1001
    iput v8, v0, Lx70;->p:I

    .line 1002
    .line 1003
    invoke-static {v1, v2, v0}, Lic0;->a(Lc52;Ldd5;Lwd0;)Ljava/lang/Object;

    .line 1004
    .line 1005
    .line 1006
    move-result-object v1

    .line 1007
    if-ne v1, v7, :cond_34

    .line 1008
    .line 1009
    move-object v3, v7

    .line 1010
    goto :goto_1f

    .line 1011
    :cond_34
    :goto_1e
    check-cast v1, Ljava/lang/Number;

    .line 1012
    .line 1013
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 1014
    .line 1015
    .line 1016
    move-result v1

    .line 1017
    iget-object v0, v0, Lx70;->s:Ljava/lang/Object;

    .line 1018
    .line 1019
    check-cast v0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 1020
    .line 1021
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 1022
    .line 1023
    .line 1024
    check-cast v5, Lic2;

    .line 1025
    .line 1026
    invoke-interface {v5, v8}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 1027
    .line 1028
    .line 1029
    :goto_1f
    return-object v3

    .line 1030
    :pswitch_8
    iget v1, v0, Lx70;->p:I

    .line 1031
    .line 1032
    if-eqz v1, :cond_36

    .line 1033
    .line 1034
    if-ne v1, v8, :cond_35

    .line 1035
    .line 1036
    invoke-static/range {p1 .. p1}, Lkb4;->X(Ljava/lang/Object;)V

    .line 1037
    .line 1038
    .line 1039
    move-object/from16 v0, p1

    .line 1040
    .line 1041
    goto :goto_20

    .line 1042
    :cond_35
    invoke-static {v6}, Lkf2;->o(Ljava/lang/String;)V

    .line 1043
    .line 1044
    .line 1045
    move-object v3, v9

    .line 1046
    goto :goto_21

    .line 1047
    :cond_36
    invoke-static/range {p1 .. p1}, Lkb4;->X(Ljava/lang/Object;)V

    .line 1048
    .line 1049
    .line 1050
    iget-object v1, v0, Lx70;->q:Ljava/lang/Object;

    .line 1051
    .line 1052
    check-cast v1, La80;

    .line 1053
    .line 1054
    iget-object v2, v0, Lx70;->r:Ljava/lang/Object;

    .line 1055
    .line 1056
    check-cast v2, Landroid/view/ScrollCaptureSession;

    .line 1057
    .line 1058
    iget-object v4, v0, Lx70;->s:Ljava/lang/Object;

    .line 1059
    .line 1060
    check-cast v4, Landroid/graphics/Rect;

    .line 1061
    .line 1062
    new-instance v6, Lk02;

    .line 1063
    .line 1064
    iget v9, v4, Landroid/graphics/Rect;->left:I

    .line 1065
    .line 1066
    iget v10, v4, Landroid/graphics/Rect;->top:I

    .line 1067
    .line 1068
    iget v11, v4, Landroid/graphics/Rect;->right:I

    .line 1069
    .line 1070
    iget v4, v4, Landroid/graphics/Rect;->bottom:I

    .line 1071
    .line 1072
    invoke-direct {v6, v9, v10, v11, v4}, Lk02;-><init>(IIII)V

    .line 1073
    .line 1074
    .line 1075
    iput v8, v0, Lx70;->p:I

    .line 1076
    .line 1077
    invoke-static {v1, v2, v6, v0}, La80;->a(La80;Landroid/view/ScrollCaptureSession;Lk02;Lwd0;)Ljava/lang/Object;

    .line 1078
    .line 1079
    .line 1080
    move-result-object v0

    .line 1081
    if-ne v0, v7, :cond_37

    .line 1082
    .line 1083
    move-object v3, v7

    .line 1084
    goto :goto_21

    .line 1085
    :cond_37
    :goto_20
    check-cast v0, Lk02;

    .line 1086
    .line 1087
    check-cast v5, Ljava/util/function/Consumer;

    .line 1088
    .line 1089
    invoke-static {v0}, Luo;->U(Lk02;)Landroid/graphics/Rect;

    .line 1090
    .line 1091
    .line 1092
    move-result-object v0

    .line 1093
    invoke-interface {v5, v0}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    .line 1094
    .line 1095
    .line 1096
    :goto_21
    return-object v3

    .line 1097
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
