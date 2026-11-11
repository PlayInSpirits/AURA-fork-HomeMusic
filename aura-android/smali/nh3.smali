.class public final Lnh3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final a:Llh3;

.field public final b:Lq;

.field public final c:Lgf1;

.field public final d:Lgf1;

.field public final e:Lgf1;

.field public final f:Lgf1;

.field public g:I


# direct methods
.method public constructor <init>(Llh3;Lq;Lna;Lna;Lna;Lna;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lnh3;->a:Llh3;

    .line 8
    .line 9
    iput-object p2, p0, Lnh3;->b:Lq;

    .line 10
    .line 11
    iput-object p3, p0, Lnh3;->c:Lgf1;

    .line 12
    .line 13
    iput-object p4, p0, Lnh3;->d:Lgf1;

    .line 14
    .line 15
    iput-object p5, p0, Lnh3;->e:Lgf1;

    .line 16
    .line 17
    iput-object p6, p0, Lnh3;->f:Lgf1;

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final declared-synchronized a()Ljava/lang/Long;
    .locals 10

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lnh3;->c:Lgf1;

    .line 3
    .line 4
    invoke-interface {v0}, Lgf1;->invoke()Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Ljava/lang/Boolean;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    iget-object v1, p0, Lnh3;->d:Lgf1;

    .line 15
    .line 16
    invoke-interface {v1}, Lgf1;->invoke()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Ljava/lang/Boolean;

    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    iget-object v2, p0, Lnh3;->f:Lgf1;

    .line 27
    .line 28
    invoke-interface {v2}, Lgf1;->invoke()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    check-cast v2, Ljava/lang/Boolean;

    .line 33
    .line 34
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    const/16 v3, 0x1f4

    .line 39
    .line 40
    :cond_0
    :goto_0
    iget-object v4, p0, Lnh3;->a:Llh3;

    .line 41
    .line 42
    iget-object v5, p0, Lnh3;->e:Lgf1;

    .line 43
    .line 44
    invoke-interface {v5}, Lgf1;->invoke()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v5

    .line 48
    check-cast v5, Ljava/lang/String;

    .line 49
    .line 50
    monitor-enter v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    :try_start_1
    invoke-virtual {v4}, Llh3;->a()Ljava/util/List;

    .line 52
    .line 53
    .line 54
    move-result-object v6

    .line 55
    new-instance v7, Lw40;

    .line 56
    .line 57
    const/4 v8, 0x0

    .line 58
    invoke-direct {v7, v8, v6}, Lw40;-><init>(ILjava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    new-instance v6, Ljh3;

    .line 62
    .line 63
    invoke-direct {v6, v0, v1, v2, v5}, Ljh3;-><init>(ZZZLjava/lang/String;)V

    .line 64
    .line 65
    .line 66
    new-instance v5, Lh71;

    .line 67
    .line 68
    const/4 v9, 0x1

    .line 69
    invoke-direct {v5, v7, v9, v6}, Lh71;-><init>(Laa4;ZLif1;)V

    .line 70
    .line 71
    .line 72
    invoke-static {v5, v3}, Lfa4;->e0(Laa4;I)Laa4;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    invoke-static {v5}, Lfa4;->f0(Laa4;)Ljava/util/List;

    .line 77
    .line 78
    .line 79
    move-result-object v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 80
    :try_start_2
    monitor-exit v4

    .line 81
    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    .line 82
    .line 83
    .line 84
    move-result v4

    .line 85
    if-eqz v4, :cond_2

    .line 86
    .line 87
    iput v8, p0, Lnh3;->g:I

    .line 88
    .line 89
    iget-object v0, p0, Lnh3;->a:Llh3;

    .line 90
    .line 91
    monitor-enter v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 92
    :try_start_3
    invoke-virtual {v0}, Llh3;->a()Ljava/util/List;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 97
    .line 98
    .line 99
    move-result v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 100
    :try_start_4
    monitor-exit v0

    .line 101
    if-lez v1, :cond_1

    .line 102
    .line 103
    const-wide/32 v0, 0x493e0

    .line 104
    .line 105
    .line 106
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 107
    .line 108
    .line 109
    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 110
    goto :goto_1

    .line 111
    :catchall_0
    move-exception v0

    .line 112
    goto/16 :goto_2

    .line 113
    .line 114
    :cond_1
    const/4 v0, 0x0

    .line 115
    :goto_1
    monitor-exit p0

    .line 116
    return-object v0

    .line 117
    :catchall_1
    move-exception v1

    .line 118
    :try_start_5
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 119
    :try_start_6
    throw v1

    .line 120
    :cond_2
    iget-object v4, p0, Lnh3;->b:Lq;

    .line 121
    .line 122
    invoke-virtual {v4, v5}, Lq;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v4

    .line 126
    check-cast v4, Lmh3;

    .line 127
    .line 128
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 129
    .line 130
    .line 131
    move-result v4

    .line 132
    if-eqz v4, :cond_9

    .line 133
    .line 134
    if-eq v4, v9, :cond_8

    .line 135
    .line 136
    const/4 v6, 0x2

    .line 137
    if-eq v4, v6, :cond_6

    .line 138
    .line 139
    const/4 v7, 0x3

    .line 140
    if-eq v4, v7, :cond_4

    .line 141
    .line 142
    const/4 v0, 0x4

    .line 143
    if-eq v4, v0, :cond_6

    .line 144
    .line 145
    const/4 v0, 0x5

    .line 146
    if-ne v4, v0, :cond_3

    .line 147
    .line 148
    iget v0, p0, Lnh3;->g:I

    .line 149
    .line 150
    add-int/2addr v0, v9

    .line 151
    iput v0, p0, Lnh3;->g:I

    .line 152
    .line 153
    const-wide/32 v0, 0x1499700

    .line 154
    .line 155
    .line 156
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 157
    .line 158
    .line 159
    move-result-object v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 160
    monitor-exit p0

    .line 161
    return-object v0

    .line 162
    :cond_3
    :try_start_7
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    .line 163
    .line 164
    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 165
    .line 166
    .line 167
    throw v0

    .line 168
    :cond_4
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 169
    .line 170
    .line 171
    move-result v4

    .line 172
    if-gt v4, v9, :cond_5

    .line 173
    .line 174
    iget-object v4, p0, Lnh3;->a:Llh3;

    .line 175
    .line 176
    invoke-static {v5}, Lq40;->I0(Ljava/util/List;)Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v5

    .line 180
    check-cast v5, Lcom/eddyizm/tempus/homemusic/PlayEvent;

    .line 181
    .line 182
    invoke-virtual {v5}, Lcom/eddyizm/tempus/homemusic/PlayEvent;->getEventId()Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v5

    .line 186
    const-string v6, "Server rejected single event as too large (413)"

    .line 187
    .line 188
    invoke-static {v5, v6}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 189
    .line 190
    .line 191
    move-result-object v5

    .line 192
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 193
    .line 194
    .line 195
    invoke-virtual {v4, v5}, Llh3;->b(Ljava/util/Map;)V

    .line 196
    .line 197
    .line 198
    goto/16 :goto_0

    .line 199
    .line 200
    :cond_5
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 201
    .line 202
    .line 203
    move-result v3

    .line 204
    div-int/2addr v3, v6

    .line 205
    if-ge v3, v9, :cond_0

    .line 206
    .line 207
    move v3, v9

    .line 208
    goto/16 :goto_0

    .line 209
    .line 210
    :cond_6
    iget v0, p0, Lnh3;->g:I

    .line 211
    .line 212
    add-int/lit8 v1, v0, 0x1

    .line 213
    .line 214
    iput v1, p0, Lnh3;->g:I

    .line 215
    .line 216
    const/16 v1, 0xa

    .line 217
    .line 218
    invoke-static {v0, v8, v1}, Lgb;->m(III)I

    .line 219
    .line 220
    .line 221
    move-result v0

    .line 222
    const-wide/16 v1, 0x7530

    .line 223
    .line 224
    shl-long v0, v1, v0

    .line 225
    .line 226
    const-wide/32 v2, 0x1b7740

    .line 227
    .line 228
    .line 229
    cmp-long v4, v0, v2

    .line 230
    .line 231
    if-lez v4, :cond_7

    .line 232
    .line 233
    move-wide v0, v2

    .line 234
    :cond_7
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 235
    .line 236
    .line 237
    move-result-object v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 238
    monitor-exit p0

    .line 239
    return-object v0

    .line 240
    :cond_8
    :try_start_8
    iput v8, p0, Lnh3;->g:I

    .line 241
    .line 242
    goto/16 :goto_0

    .line 243
    .line 244
    :cond_9
    iput v8, p0, Lnh3;->g:I

    .line 245
    .line 246
    iget-object v4, p0, Lnh3;->a:Llh3;

    .line 247
    .line 248
    invoke-virtual {v4, v5}, Llh3;->c(Ljava/util/List;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 249
    .line 250
    .line 251
    goto/16 :goto_0

    .line 252
    .line 253
    :catchall_2
    move-exception v0

    .line 254
    :try_start_9
    monitor-exit v4
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 255
    :try_start_a
    throw v0

    .line 256
    :goto_2
    monitor-exit p0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    .line 257
    throw v0
.end method
