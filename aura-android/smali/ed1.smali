.class public final Led1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lw92;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Ljava/lang/Object;

.field public final synthetic p:Ljava/lang/Object;

.field public final synthetic q:Ljava/lang/Object;

.field public final synthetic r:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lld1;Ljava/lang/String;Lzd1;Lea2;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Led1;->n:I

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Led1;->r:Ljava/lang/Object;

    iput-object p2, p0, Led1;->o:Ljava/lang/Object;

    iput-object p3, p0, Led1;->p:Ljava/lang/Object;

    iput-object p4, p0, Led1;->q:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ltd0;Led;Ltv3;Ljx3;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Led1;->n:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Led1;->o:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Led1;->p:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p3, p0, Led1;->q:Ljava/lang/Object;

    .line 12
    .line 13
    iput-object p4, p0, Led1;->r:Ljava/lang/Object;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final b(Lba2;Lq92;)V
    .locals 10

    .line 1
    iget v0, p0, Led1;->n:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    sget-object v0, Lgc5;->a:[I

    .line 7
    .line 8
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 9
    .line 10
    .line 11
    move-result p2

    .line 12
    aget p2, v0, p2

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    const/4 v1, 0x1

    .line 16
    packed-switch p2, :pswitch_data_1

    .line 17
    .line 18
    .line 19
    invoke-static {}, Ler1;->n()V

    .line 20
    .line 21
    .line 22
    goto/16 :goto_6

    .line 23
    .line 24
    :pswitch_0
    iget-object p0, p0, Led1;->q:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p0, Ltv3;

    .line 27
    .line 28
    invoke-virtual {p0}, Ltv3;->x()V

    .line 29
    .line 30
    .line 31
    goto/16 :goto_6

    .line 32
    .line 33
    :pswitch_1
    iget-object p0, p0, Led1;->q:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast p0, Ltv3;

    .line 36
    .line 37
    iget-object p1, p0, Ltv3;->c:Ljava/lang/Object;

    .line 38
    .line 39
    monitor-enter p1

    .line 40
    :try_start_0
    iput-boolean v1, p0, Ltv3;->t:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 41
    .line 42
    monitor-exit p1

    .line 43
    goto/16 :goto_6

    .line 44
    .line 45
    :catchall_0
    move-exception v0

    .line 46
    move-object p0, v0

    .line 47
    monitor-exit p1

    .line 48
    throw p0

    .line 49
    :pswitch_2
    iget-object p1, p0, Led1;->p:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast p1, Led;

    .line 52
    .line 53
    const/4 p2, 0x0

    .line 54
    if-eqz p1, :cond_2

    .line 55
    .line 56
    iget-object p1, p1, Led;->p:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast p1, Lll;

    .line 59
    .line 60
    iget-object v2, p1, Lll;->p:Ljava/lang/Object;

    .line 61
    .line 62
    monitor-enter v2

    .line 63
    :try_start_1
    iget-object v3, p1, Lll;->p:Ljava/lang/Object;

    .line 64
    .line 65
    monitor-enter v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 66
    :try_start_2
    iget-boolean v4, p1, Lll;->o:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 67
    .line 68
    :try_start_3
    monitor-exit v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 69
    if-eqz v4, :cond_0

    .line 70
    .line 71
    :goto_0
    monitor-exit v2

    .line 72
    goto :goto_3

    .line 73
    :cond_0
    :try_start_4
    iget-object v3, p1, Lll;->q:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v3, Ljava/util/ArrayList;

    .line 76
    .line 77
    iget-object v4, p1, Lll;->r:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v4, Ljava/util/ArrayList;

    .line 80
    .line 81
    iput-object v4, p1, Lll;->q:Ljava/lang/Object;

    .line 82
    .line 83
    iput-object v3, p1, Lll;->r:Ljava/lang/Object;

    .line 84
    .line 85
    iput-boolean v1, p1, Lll;->o:Z

    .line 86
    .line 87
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 88
    .line 89
    .line 90
    move-result p1

    .line 91
    move v1, p2

    .line 92
    :goto_1
    if-ge v1, p1, :cond_1

    .line 93
    .line 94
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v4

    .line 98
    check-cast v4, Lvd0;

    .line 99
    .line 100
    sget-object v5, Lj15;->a:Lj15;

    .line 101
    .line 102
    invoke-interface {v4, v5}, Lvd0;->resumeWith(Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    add-int/lit8 v1, v1, 0x1

    .line 106
    .line 107
    goto :goto_1

    .line 108
    :catchall_1
    move-exception v0

    .line 109
    move-object p0, v0

    .line 110
    goto :goto_2

    .line 111
    :cond_1
    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 112
    .line 113
    .line 114
    goto :goto_0

    .line 115
    :catchall_2
    move-exception v0

    .line 116
    move-object p0, v0

    .line 117
    monitor-exit v3

    .line 118
    throw p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 119
    :goto_2
    monitor-exit v2

    .line 120
    throw p0

    .line 121
    :cond_2
    :goto_3
    iget-object p0, p0, Led1;->q:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast p0, Ltv3;

    .line 124
    .line 125
    iget-object p1, p0, Ltv3;->c:Ljava/lang/Object;

    .line 126
    .line 127
    monitor-enter p1

    .line 128
    :try_start_5
    iget-boolean v1, p0, Ltv3;->t:Z

    .line 129
    .line 130
    if-eqz v1, :cond_3

    .line 131
    .line 132
    iput-boolean p2, p0, Ltv3;->t:Z

    .line 133
    .line 134
    invoke-virtual {p0}, Ltv3;->y()Laz;

    .line 135
    .line 136
    .line 137
    move-result-object v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 138
    goto :goto_4

    .line 139
    :catchall_3
    move-exception v0

    .line 140
    move-object p0, v0

    .line 141
    goto :goto_5

    .line 142
    :cond_3
    :goto_4
    monitor-exit p1

    .line 143
    if-eqz v0, :cond_4

    .line 144
    .line 145
    sget-object p0, Lj15;->a:Lj15;

    .line 146
    .line 147
    check-cast v0, Lcz;

    .line 148
    .line 149
    invoke-virtual {v0, p0}, Lcz;->resumeWith(Ljava/lang/Object;)V

    .line 150
    .line 151
    .line 152
    goto :goto_6

    .line 153
    :goto_5
    monitor-exit p1

    .line 154
    throw p0

    .line 155
    :pswitch_3
    iget-object p2, p0, Led1;->o:Ljava/lang/Object;

    .line 156
    .line 157
    check-cast p2, Ltd0;

    .line 158
    .line 159
    sget-object v2, Lze0;->q:Lze0;

    .line 160
    .line 161
    new-instance v3, Lx70;

    .line 162
    .line 163
    iget-object v4, p0, Led1;->r:Ljava/lang/Object;

    .line 164
    .line 165
    check-cast v4, Ljx3;

    .line 166
    .line 167
    iget-object v5, p0, Led1;->q:Ljava/lang/Object;

    .line 168
    .line 169
    check-cast v5, Ltv3;

    .line 170
    .line 171
    const/4 v8, 0x0

    .line 172
    const/16 v9, 0x8

    .line 173
    .line 174
    move-object v7, p0

    .line 175
    move-object v6, p1

    .line 176
    invoke-direct/range {v3 .. v9}, Lx70;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lvd0;I)V

    .line 177
    .line 178
    .line 179
    invoke-static {p2, v0, v2, v3, v1}, Lfu;->G(Lwe0;Lne0;Lze0;Lwf1;I)Lsk4;

    .line 180
    .line 181
    .line 182
    :cond_4
    :goto_6
    :pswitch_4
    return-void

    .line 183
    :pswitch_5
    move-object v7, p0

    .line 184
    iget-object p0, v7, Led1;->r:Ljava/lang/Object;

    .line 185
    .line 186
    check-cast p0, Lld1;

    .line 187
    .line 188
    iget-object p1, p0, Lld1;->k:Ljava/util/Map;

    .line 189
    .line 190
    iget-object v0, v7, Led1;->o:Ljava/lang/Object;

    .line 191
    .line 192
    check-cast v0, Ljava/lang/String;

    .line 193
    .line 194
    sget-object v1, Lq92;->ON_START:Lq92;

    .line 195
    .line 196
    if-ne p2, v1, :cond_5

    .line 197
    .line 198
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v1

    .line 202
    check-cast v1, Landroid/os/Bundle;

    .line 203
    .line 204
    if-eqz v1, :cond_5

    .line 205
    .line 206
    iget-object v2, v7, Led1;->p:Ljava/lang/Object;

    .line 207
    .line 208
    check-cast v2, Lzd1;

    .line 209
    .line 210
    invoke-interface {v2, v0, v1}, Lzd1;->d(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 211
    .line 212
    .line 213
    invoke-interface {p1, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    const/4 p1, 0x2

    .line 217
    invoke-static {p1}, Lld1;->I(I)Z

    .line 218
    .line 219
    .line 220
    move-result p1

    .line 221
    if-eqz p1, :cond_5

    .line 222
    .line 223
    const-string p1, "FragmentManager"

    .line 224
    .line 225
    const-string v1, "Clearing fragment result with key "

    .line 226
    .line 227
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object v1

    .line 231
    invoke-static {p1, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 232
    .line 233
    .line 234
    :cond_5
    sget-object p1, Lq92;->ON_DESTROY:Lq92;

    .line 235
    .line 236
    if-ne p2, p1, :cond_6

    .line 237
    .line 238
    iget-object p1, v7, Led1;->q:Ljava/lang/Object;

    .line 239
    .line 240
    check-cast p1, Lea2;

    .line 241
    .line 242
    invoke-virtual {p1, v7}, Lea2;->f(Laa2;)V

    .line 243
    .line 244
    .line 245
    iget-object p0, p0, Lld1;->l:Ljava/util/Map;

    .line 246
    .line 247
    invoke-interface {p0, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    :cond_6
    return-void

    .line 251
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
    .end packed-switch

    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_4
        :pswitch_4
        :pswitch_4
    .end packed-switch
.end method
