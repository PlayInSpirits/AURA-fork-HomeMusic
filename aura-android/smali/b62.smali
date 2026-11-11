.class public final synthetic Lb62;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Lkc1;

.field public final synthetic p:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lkc1;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p3, p0, Lb62;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Lb62;->o:Lkc1;

    .line 4
    .line 5
    iput-object p2, p0, Lb62;->p:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 8

    .line 1
    iget p1, p0, Lb62;->n:I

    .line 2
    .line 3
    const/4 p2, 0x0

    .line 4
    const/4 v0, 0x0

    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, Lb62;->o:Lkc1;

    .line 9
    .line 10
    check-cast p1, Lxf4;

    .line 11
    .line 12
    iget-object p0, p0, Lb62;->p:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p0, Landroid/widget/EditText;

    .line 15
    .line 16
    invoke-virtual {p0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-nez v1, :cond_2

    .line 33
    .line 34
    :try_start_0
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    if-lez p0, :cond_2

    .line 39
    .line 40
    iget-object p1, p1, Lxf4;->B0:Lpz1;

    .line 41
    .line 42
    if-eqz p1, :cond_2

    .line 43
    .line 44
    invoke-static {}, Lu52;->c()Lv52;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    iget-boolean v1, v1, Lv52;->a:Z

    .line 49
    .line 50
    if-eqz v1, :cond_0

    .line 51
    .line 52
    const-string p1, "minutes"

    .line 53
    .line 54
    invoke-static {p0, p1}, Lu52;->s(ILjava/lang/String;)V

    .line 55
    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_0
    invoke-static {}, Lyf4;->c()Lyf4;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    invoke-virtual {v1, v0}, Lyf4;->a(Z)V

    .line 63
    .line 64
    .line 65
    iput-boolean v0, v1, Lyf4;->g:Z

    .line 66
    .line 67
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 68
    .line 69
    .line 70
    move-result-wide v2

    .line 71
    int-to-long v4, p0

    .line 72
    const-wide/32 v6, 0xea60

    .line 73
    .line 74
    .line 75
    mul-long/2addr v4, v6

    .line 76
    add-long/2addr v4, v2

    .line 77
    iput-wide v4, v1, Lyf4;->e:J

    .line 78
    .line 79
    const/4 p0, 0x1

    .line 80
    iput-boolean p0, v1, Lyf4;->f:Z
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_1

    .line 81
    .line 82
    :try_start_1
    invoke-static {}, Lcom/eddyizm/tempus/App;->b()Lcom/eddyizm/tempus/App;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    invoke-static {}, Lcom/eddyizm/tempus/App;->c()Landroid/content/SharedPreferences;

    .line 90
    .line 91
    .line 92
    move-result-object p2
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 93
    :catch_0
    if-nez p2, :cond_1

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_1
    :try_start_2
    invoke-interface {p2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    const-string p2, "sleep_timer_end_time_ms"

    .line 101
    .line 102
    iget-wide v2, v1, Lyf4;->e:J

    .line 103
    .line 104
    invoke-interface {p0, p2, v2, v3}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    const-string p2, "sleep_timer_end_of_track"

    .line 109
    .line 110
    iget-boolean v0, v1, Lyf4;->g:Z

    .line 111
    .line 112
    invoke-interface {p0, p2, v0}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 117
    .line 118
    .line 119
    :goto_0
    new-instance p0, Ljq3;

    .line 120
    .line 121
    const/16 p2, 0x8

    .line 122
    .line 123
    invoke-direct {p0, p2, v1}, Ljq3;-><init>(ILjava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    iput-object p0, v1, Lyf4;->b:Ljq3;

    .line 127
    .line 128
    iget-object p2, v1, Lyf4;->a:Landroid/os/Handler;

    .line 129
    .line 130
    const-wide/16 v0, 0x3e8

    .line 131
    .line 132
    invoke-virtual {p2, p0, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 133
    .line 134
    .line 135
    iget-object p0, p1, Lpz1;->o:Ljava/lang/Object;

    .line 136
    .line 137
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;

    .line 138
    .line 139
    invoke-static {}, Lyf4;->c()Lyf4;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    new-instance p2, Lvj3;

    .line 144
    .line 145
    invoke-direct {p2, p0}, Lvj3;-><init>(Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;)V

    .line 146
    .line 147
    .line 148
    iput-object p2, p1, Lyf4;->h:Lvj3;

    .line 149
    .line 150
    invoke-virtual {p0}, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->x0()V
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_1

    .line 151
    .line 152
    .line 153
    :catch_1
    :cond_2
    :goto_1
    return-void

    .line 154
    :pswitch_0
    iget-object p1, p0, Lb62;->o:Lkc1;

    .line 155
    .line 156
    check-cast p1, Lh62;

    .line 157
    .line 158
    iget-object p0, p0, Lb62;->p:Ljava/lang/Object;

    .line 159
    .line 160
    check-cast p0, Lh52;

    .line 161
    .line 162
    sget-boolean v1, Lcom/eddyizm/tempus/lan/LanReceiverService;->y:Z

    .line 163
    .line 164
    iget-object v1, p1, Lh62;->t0:Landroid/content/Context;

    .line 165
    .line 166
    if-eqz v1, :cond_5

    .line 167
    .line 168
    sget-boolean v2, Lcom/eddyizm/tempus/lan/LanReceiverService;->y:Z

    .line 169
    .line 170
    if-eqz v2, :cond_4

    .line 171
    .line 172
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 173
    .line 174
    .line 175
    move-result-wide v2

    .line 176
    sget-wide v4, Lcom/eddyizm/tempus/lan/LanReceiverService;->A:J

    .line 177
    .line 178
    iget-wide v6, p0, Lh52;->d:J

    .line 179
    .line 180
    cmp-long v4, v2, v4

    .line 181
    .line 182
    if-gez v4, :cond_4

    .line 183
    .line 184
    cmp-long v4, v2, v6

    .line 185
    .line 186
    if-ltz v4, :cond_4

    .line 187
    .line 188
    sub-long/2addr v2, v6

    .line 189
    const-wide/32 v4, 0x1d4c0

    .line 190
    .line 191
    .line 192
    cmp-long v2, v2, v4

    .line 193
    .line 194
    if-gez v2, :cond_4

    .line 195
    .line 196
    sget-object v2, Lcom/eddyizm/tempus/lan/LanReceiverService;->B:Ljava/util/concurrent/ConcurrentHashMap;

    .line 197
    .line 198
    iget-object v3, p0, Lh52;->a:Ljava/lang/String;

    .line 199
    .line 200
    invoke-virtual {v2, v3}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object v3

    .line 204
    invoke-static {v3, p0}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 205
    .line 206
    .line 207
    move-result v3

    .line 208
    if-nez v3, :cond_3

    .line 209
    .line 210
    goto :goto_2

    .line 211
    :cond_3
    const-string v3, "lan-playback"

    .line 212
    .line 213
    invoke-virtual {v1, v3, v0}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    invoke-static {v1}, Lkb4;->a0(Landroid/content/Context;)Ljava/util/Set;

    .line 222
    .line 223
    .line 224
    move-result-object v1

    .line 225
    iget-object v3, p0, Lh52;->a:Ljava/lang/String;

    .line 226
    .line 227
    invoke-static {v1, v3}, Lkb4;->Q(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/LinkedHashSet;

    .line 228
    .line 229
    .line 230
    move-result-object v1

    .line 231
    const-string v3, "trusted"

    .line 232
    .line 233
    invoke-interface {v0, v3, v1}, Landroid/content/SharedPreferences$Editor;->putStringSet(Ljava/lang/String;Ljava/util/Set;)Landroid/content/SharedPreferences$Editor;

    .line 234
    .line 235
    .line 236
    move-result-object v0

    .line 237
    iget-object v1, p0, Lh52;->a:Ljava/lang/String;

    .line 238
    .line 239
    const-string v3, "peer-"

    .line 240
    .line 241
    invoke-virtual {v3, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 242
    .line 243
    .line 244
    move-result-object v1

    .line 245
    iget-object v3, p0, Lh52;->b:Ljava/lang/String;

    .line 246
    .line 247
    invoke-interface {v0, v1, v3}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 248
    .line 249
    .line 250
    move-result-object v0

    .line 251
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 252
    .line 253
    .line 254
    iget-object p0, p0, Lh52;->a:Ljava/lang/String;

    .line 255
    .line 256
    invoke-virtual {v2, p0}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    sget-object p0, Lw42;->a:Lw42;

    .line 260
    .line 261
    const-string p0, "Receiver approved controller"

    .line 262
    .line 263
    invoke-static {p0}, Lw42;->b(Ljava/lang/String;)V

    .line 264
    .line 265
    .line 266
    goto :goto_3

    .line 267
    :cond_4
    :goto_2
    const p0, 0x7f1302cf

    .line 268
    .line 269
    .line 270
    invoke-virtual {p1, p0}, Lh62;->s0(I)V

    .line 271
    .line 272
    .line 273
    :goto_3
    iput-object p2, p1, Lh62;->U0:Lh52;

    .line 274
    .line 275
    invoke-virtual {p1}, Lh62;->p0()V

    .line 276
    .line 277
    .line 278
    return-void

    .line 279
    :cond_5
    const-string p0, "app"

    .line 280
    .line 281
    invoke-static {p0}, Lh12;->Q(Ljava/lang/String;)V

    .line 282
    .line 283
    .line 284
    throw p2

    .line 285
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
