.class public final Ldefpackage/z81;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/q81;


# instance fields
.field public final synthetic n:I

.field public final o:Ljava/lang/Object;

.field public final p:Ljava/lang/Object;

.field public final q:Ldefpackage/sf1;


# direct methods
.method public constructor <init>(Ldefpackage/fx3;Ldefpackage/q81;Ldefpackage/pv3;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Ldefpackage/z81;->n:I

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldefpackage/z81;->p:Ljava/lang/Object;

    iput-object p2, p0, Ldefpackage/z81;->o:Ljava/lang/Object;

    iput-object p3, p0, Ldefpackage/z81;->q:Ldefpackage/sf1;

    return-void
.end method

.method public constructor <init>(Ldefpackage/q81;Landroidx/work/impl/WorkDatabase_Impl;Ldefpackage/x;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Ldefpackage/z81;->n:I

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldefpackage/z81;->o:Ljava/lang/Object;

    iput-object p2, p0, Ldefpackage/z81;->p:Ljava/lang/Object;

    iput-object p3, p0, Ldefpackage/z81;->q:Ldefpackage/sf1;

    return-void
.end method

.method public constructor <init>(Ldefpackage/q81;Ldefpackage/ne0;)V
    .locals 2

    .line 1
    const/4 v0, 0x2

    .line 2
    iput v0, p0, Ldefpackage/z81;->n:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p2, p0, Ldefpackage/z81;->p:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-static {p2}, Ldefpackage/te5;->O(Ldefpackage/ne0;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    iput-object p2, p0, Ldefpackage/z81;->o:Ljava/lang/Object;

    .line 14
    .line 15
    new-instance p2, Ldefpackage/p;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    const/16 v1, 0x12

    .line 19
    .line 20
    invoke-direct {p2, p1, v0, v1}, Ldefpackage/p;-><init>(Ljava/lang/Object;Ldefpackage/vd0;I)V

    .line 21
    .line 22
    .line 23
    iput-object p2, p0, Ldefpackage/z81;->q:Ldefpackage/sf1;

    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Ldefpackage/vd0;)Ljava/lang/Object;
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
    iget v3, v0, Ldefpackage/z81;->n:I

    .line 8
    .line 9
    const-string v4, "call to \'resume\' before \'invoke\' with coroutine"

    .line 10
    .line 11
    const/4 v5, 0x1

    .line 12
    const/high16 v6, -0x80000000

    .line 13
    .line 14
    const/4 v7, 0x2

    .line 15
    sget-object v8, Ldefpackage/j15;->a:Ldefpackage/j15;

    .line 16
    .line 17
    sget-object v9, Ldefpackage/xe0;->n:Ldefpackage/xe0;

    .line 18
    .line 19
    iget-object v10, v0, Ldefpackage/z81;->q:Ldefpackage/sf1;

    .line 20
    .line 21
    iget-object v11, v0, Ldefpackage/z81;->o:Ljava/lang/Object;

    .line 22
    .line 23
    iget-object v12, v0, Ldefpackage/z81;->p:Ljava/lang/Object;

    .line 24
    .line 25
    const/4 v13, 0x0

    .line 26
    packed-switch v3, :pswitch_data_0

    .line 27
    .line 28
    .line 29
    check-cast v12, Ldefpackage/ne0;

    .line 30
    .line 31
    check-cast v10, Ldefpackage/p;

    .line 32
    .line 33
    invoke-static {v12, v1, v11, v10, v2}, Ldefpackage/ud3;->J0(Ldefpackage/ne0;Ljava/lang/Object;Ljava/lang/Object;Ldefpackage/wf1;Ldefpackage/vd0;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    if-ne v0, v9, :cond_0

    .line 38
    .line 39
    move-object v8, v0

    .line 40
    :cond_0
    return-object v8

    .line 41
    :pswitch_0
    instance-of v3, v2, Ldefpackage/i91;

    .line 42
    .line 43
    if-eqz v3, :cond_1

    .line 44
    .line 45
    move-object v3, v2

    .line 46
    check-cast v3, Ldefpackage/i91;

    .line 47
    .line 48
    iget v14, v3, Ldefpackage/i91;->o:I

    .line 49
    .line 50
    and-int v15, v14, v6

    .line 51
    .line 52
    if-eqz v15, :cond_1

    .line 53
    .line 54
    sub-int/2addr v14, v6

    .line 55
    iput v14, v3, Ldefpackage/i91;->o:I

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_1
    new-instance v3, Ldefpackage/i91;

    .line 59
    .line 60
    invoke-direct {v3, v0, v2}, Ldefpackage/i91;-><init>(Ldefpackage/z81;Ldefpackage/vd0;)V

    .line 61
    .line 62
    .line 63
    :goto_0
    iget-object v0, v3, Ldefpackage/i91;->n:Ljava/lang/Object;

    .line 64
    .line 65
    iget v2, v3, Ldefpackage/i91;->o:I

    .line 66
    .line 67
    if-eqz v2, :cond_4

    .line 68
    .line 69
    if-eq v2, v5, :cond_3

    .line 70
    .line 71
    if-ne v2, v7, :cond_2

    .line 72
    .line 73
    invoke-static {v0}, Ldefpackage/kb4;->X(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    goto :goto_3

    .line 77
    :cond_2
    invoke-static {v4}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    move-object v8, v13

    .line 81
    goto :goto_3

    .line 82
    :cond_3
    iget-object v1, v3, Ldefpackage/i91;->p:Ldefpackage/q81;

    .line 83
    .line 84
    invoke-static {v0}, Ldefpackage/kb4;->X(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_4
    invoke-static {v0}, Ldefpackage/kb4;->X(Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    move-object v0, v11

    .line 92
    check-cast v0, Ldefpackage/q81;

    .line 93
    .line 94
    check-cast v1, Ljava/util/Set;

    .line 95
    .line 96
    check-cast v12, Landroidx/work/impl/WorkDatabase_Impl;

    .line 97
    .line 98
    check-cast v10, Ldefpackage/x;

    .line 99
    .line 100
    iput-object v0, v3, Ldefpackage/i91;->p:Ldefpackage/q81;

    .line 101
    .line 102
    iput v5, v3, Ldefpackage/i91;->o:I

    .line 103
    .line 104
    invoke-static {v12, v5, v10, v3}, Ldefpackage/xl;->F(Ldefpackage/s24;ZLdefpackage/if1;Ldefpackage/wd0;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    if-ne v1, v9, :cond_5

    .line 109
    .line 110
    goto :goto_2

    .line 111
    :cond_5
    move-object/from16 v16, v1

    .line 112
    .line 113
    move-object v1, v0

    .line 114
    move-object/from16 v0, v16

    .line 115
    .line 116
    :goto_1
    iput-object v13, v3, Ldefpackage/i91;->p:Ldefpackage/q81;

    .line 117
    .line 118
    iput v7, v3, Ldefpackage/i91;->o:I

    .line 119
    .line 120
    invoke-interface {v1, v0, v3}, Ldefpackage/q81;->b(Ljava/lang/Object;Ldefpackage/vd0;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    if-ne v0, v9, :cond_6

    .line 125
    .line 126
    :goto_2
    move-object v8, v9

    .line 127
    :cond_6
    :goto_3
    return-object v8

    .line 128
    :pswitch_1
    instance-of v3, v2, Ldefpackage/y81;

    .line 129
    .line 130
    if-eqz v3, :cond_7

    .line 131
    .line 132
    move-object v3, v2

    .line 133
    check-cast v3, Ldefpackage/y81;

    .line 134
    .line 135
    iget v14, v3, Ldefpackage/y81;->r:I

    .line 136
    .line 137
    and-int v15, v14, v6

    .line 138
    .line 139
    if-eqz v15, :cond_7

    .line 140
    .line 141
    sub-int/2addr v14, v6

    .line 142
    iput v14, v3, Ldefpackage/y81;->r:I

    .line 143
    .line 144
    goto :goto_4

    .line 145
    :cond_7
    new-instance v3, Ldefpackage/y81;

    .line 146
    .line 147
    invoke-direct {v3, v0, v2}, Ldefpackage/y81;-><init>(Ldefpackage/z81;Ldefpackage/vd0;)V

    .line 148
    .line 149
    .line 150
    :goto_4
    iget-object v2, v3, Ldefpackage/y81;->p:Ljava/lang/Object;

    .line 151
    .line 152
    iget v6, v3, Ldefpackage/y81;->r:I

    .line 153
    .line 154
    const/4 v14, 0x3

    .line 155
    if-eqz v6, :cond_b

    .line 156
    .line 157
    if-eq v6, v5, :cond_8

    .line 158
    .line 159
    if-eq v6, v7, :cond_a

    .line 160
    .line 161
    if-ne v6, v14, :cond_9

    .line 162
    .line 163
    :cond_8
    invoke-static {v2}, Ldefpackage/kb4;->X(Ljava/lang/Object;)V

    .line 164
    .line 165
    .line 166
    goto :goto_7

    .line 167
    :cond_9
    invoke-static {v4}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    move-object v8, v13

    .line 171
    goto :goto_7

    .line 172
    :cond_a
    iget-object v0, v3, Ldefpackage/y81;->o:Ljava/lang/Object;

    .line 173
    .line 174
    iget-object v1, v3, Ldefpackage/y81;->n:Ldefpackage/z81;

    .line 175
    .line 176
    invoke-static {v2}, Ldefpackage/kb4;->X(Ljava/lang/Object;)V

    .line 177
    .line 178
    .line 179
    move-object/from16 v16, v1

    .line 180
    .line 181
    move-object v1, v0

    .line 182
    move-object/from16 v0, v16

    .line 183
    .line 184
    goto :goto_5

    .line 185
    :cond_b
    invoke-static {v2}, Ldefpackage/kb4;->X(Ljava/lang/Object;)V

    .line 186
    .line 187
    .line 188
    check-cast v12, Ldefpackage/fx3;

    .line 189
    .line 190
    iget-boolean v2, v12, Ldefpackage/fx3;->n:Z

    .line 191
    .line 192
    if-eqz v2, :cond_c

    .line 193
    .line 194
    check-cast v11, Ldefpackage/q81;

    .line 195
    .line 196
    iput v5, v3, Ldefpackage/y81;->r:I

    .line 197
    .line 198
    invoke-interface {v11, v1, v3}, Ldefpackage/q81;->b(Ljava/lang/Object;Ldefpackage/vd0;)Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    if-ne v0, v9, :cond_e

    .line 203
    .line 204
    goto :goto_6

    .line 205
    :cond_c
    check-cast v10, Ldefpackage/pv3;

    .line 206
    .line 207
    iput-object v0, v3, Ldefpackage/y81;->n:Ldefpackage/z81;

    .line 208
    .line 209
    iput-object v1, v3, Ldefpackage/y81;->o:Ljava/lang/Object;

    .line 210
    .line 211
    iput v7, v3, Ldefpackage/y81;->r:I

    .line 212
    .line 213
    invoke-virtual {v10, v1, v3}, Ldefpackage/pv3;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v2

    .line 217
    if-ne v2, v9, :cond_d

    .line 218
    .line 219
    goto :goto_6

    .line 220
    :cond_d
    :goto_5
    check-cast v2, Ljava/lang/Boolean;

    .line 221
    .line 222
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 223
    .line 224
    .line 225
    move-result v2

    .line 226
    if-nez v2, :cond_e

    .line 227
    .line 228
    iget-object v2, v0, Ldefpackage/z81;->p:Ljava/lang/Object;

    .line 229
    .line 230
    check-cast v2, Ldefpackage/fx3;

    .line 231
    .line 232
    iput-boolean v5, v2, Ldefpackage/fx3;->n:Z

    .line 233
    .line 234
    iget-object v0, v0, Ldefpackage/z81;->o:Ljava/lang/Object;

    .line 235
    .line 236
    check-cast v0, Ldefpackage/q81;

    .line 237
    .line 238
    iput-object v13, v3, Ldefpackage/y81;->n:Ldefpackage/z81;

    .line 239
    .line 240
    iput-object v13, v3, Ldefpackage/y81;->o:Ljava/lang/Object;

    .line 241
    .line 242
    iput v14, v3, Ldefpackage/y81;->r:I

    .line 243
    .line 244
    invoke-interface {v0, v1, v3}, Ldefpackage/q81;->b(Ljava/lang/Object;Ldefpackage/vd0;)Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object v0

    .line 248
    if-ne v0, v9, :cond_e

    .line 249
    .line 250
    :goto_6
    move-object v8, v9

    .line 251
    :cond_e
    :goto_7
    return-object v8

    .line 252
    nop

    .line 253
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
