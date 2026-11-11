.class public final synthetic Lyn1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Ljava/lang/String;

.field public final synthetic p:Lfo1;


# direct methods
.method public synthetic constructor <init>(Lfo1;Ljava/lang/String;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lyn1;->n:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lyn1;->p:Lfo1;

    .line 8
    .line 9
    iput-object p2, p0, Lyn1;->o:Ljava/lang/String;

    .line 10
    .line 11
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lfo1;)V
    .locals 1

    .line 12
    const/4 v0, 0x1

    iput v0, p0, Lyn1;->n:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyn1;->o:Ljava/lang/String;

    iput-object p2, p0, Lyn1;->p:Lfo1;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 9

    .line 1
    iget v0, p0, Lyn1;->n:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lrr1;->k()Lo83;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Lo83;->a()Ln83;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sget-object v1, Lbe0;->g:Li80;

    .line 15
    .line 16
    iput-object v1, v0, Ln83;->k:Lbe0;

    .line 17
    .line 18
    const-wide/16 v1, 0xf

    .line 19
    .line 20
    sget-object v3, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 21
    .line 22
    invoke-virtual {v0, v1, v2, v3}, Ln83;->a(JLjava/util/concurrent/TimeUnit;)V

    .line 23
    .line 24
    .line 25
    new-instance v1, Lo83;

    .line 26
    .line 27
    invoke-direct {v1, v0}, Lo83;-><init>(Ln83;)V

    .line 28
    .line 29
    .line 30
    new-instance v0, Lnz3;

    .line 31
    .line 32
    invoke-direct {v0}, Lnz3;-><init>()V

    .line 33
    .line 34
    .line 35
    const-string v2, "/rest/ping.view?v=1.16.1&c=HomeMusic&f=json"

    .line 36
    .line 37
    iget-object v6, p0, Lyn1;->o:Ljava/lang/String;

    .line 38
    .line 39
    invoke-virtual {v6, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-virtual {v0, v2}, Lnz3;->d(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    new-instance v2, Loz3;

    .line 47
    .line 48
    invoke-direct {v2, v0}, Loz3;-><init>(Lnz3;)V

    .line 49
    .line 50
    .line 51
    const/4 v3, 0x0

    .line 52
    :try_start_0
    new-instance v0, Lbv3;

    .line 53
    .line 54
    invoke-direct {v0, v1, v2}, Lbv3;-><init>(Lo83;Loz3;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0}, Lbv3;->c()Lk14;

    .line 58
    .line 59
    .line 60
    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 61
    :try_start_1
    iget-object v0, v1, Lk14;->t:Ln14;

    .line 62
    .line 63
    if-eqz v0, :cond_0

    .line 64
    .line 65
    invoke-virtual {v0}, Ln14;->string()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    goto :goto_0

    .line 70
    :catchall_0
    move-exception v0

    .line 71
    move-object v2, v0

    .line 72
    goto :goto_3

    .line 73
    :cond_0
    move-object v0, v3

    .line 74
    :goto_0
    if-nez v0, :cond_1

    .line 75
    .line 76
    const-string v0, ""

    .line 77
    .line 78
    :cond_1
    const-string v2, "subsonic-response"

    .line 79
    .line 80
    invoke-static {v0, v2}, Lqm4;->o0(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 81
    .line 82
    .line 83
    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 84
    if-eqz v0, :cond_2

    .line 85
    .line 86
    const/4 v0, 0x0

    .line 87
    goto :goto_1

    .line 88
    :cond_2
    const/4 v0, 0x2

    .line 89
    :goto_1
    :try_start_2
    invoke-virtual {v1}, Lk14;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 90
    .line 91
    .line 92
    :goto_2
    move v5, v0

    .line 93
    goto :goto_4

    .line 94
    :goto_3
    :try_start_3
    throw v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 95
    :catchall_1
    move-exception v0

    .line 96
    :try_start_4
    invoke-static {v1, v2}, Lq05;->h(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 97
    .line 98
    .line 99
    throw v0
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 100
    :catch_0
    const/4 v0, 0x1

    .line 101
    goto :goto_2

    .line 102
    :goto_4
    if-nez v5, :cond_4

    .line 103
    .line 104
    :try_start_5
    const-string v0, "/api/auth/options"

    .line 105
    .line 106
    const-class v1, Lcom/eddyizm/tempus/homemusic/HubAuthOptions;

    .line 107
    .line 108
    invoke-static {v3, v0, v1}, Lrr1;->s(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    check-cast v0, Lcom/eddyizm/tempus/homemusic/HubAuthOptions;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 113
    .line 114
    goto :goto_5

    .line 115
    :catchall_2
    move-exception v0

    .line 116
    new-instance v1, Ls14;

    .line 117
    .line 118
    invoke-direct {v1, v0}, Ls14;-><init>(Ljava/lang/Throwable;)V

    .line 119
    .line 120
    .line 121
    move-object v0, v1

    .line 122
    :goto_5
    nop

    .line 123
    instance-of v1, v0, Ls14;

    .line 124
    .line 125
    if-eqz v1, :cond_3

    .line 126
    .line 127
    goto :goto_6

    .line 128
    :cond_3
    move-object v3, v0

    .line 129
    :goto_6
    check-cast v3, Lcom/eddyizm/tempus/homemusic/HubAuthOptions;

    .line 130
    .line 131
    :cond_4
    move-object v7, v3

    .line 132
    sget-object v0, Lio1;->b:Landroid/os/Handler;

    .line 133
    .line 134
    new-instance v3, Lct0;

    .line 135
    .line 136
    const/4 v8, 0x1

    .line 137
    iget-object v4, p0, Lyn1;->p:Lfo1;

    .line 138
    .line 139
    invoke-direct/range {v3 .. v8}, Lct0;-><init>(Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;I)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v0, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 143
    .line 144
    .line 145
    return-void

    .line 146
    :pswitch_0
    iget-object v1, p0, Lyn1;->o:Ljava/lang/String;

    .line 147
    .line 148
    :try_start_6
    sget-object v0, Lrr1;->a:Lrr1;

    .line 149
    .line 150
    const-string v0, "email"

    .line 151
    .line 152
    invoke-static {v0, v1}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 157
    .line 158
    .line 159
    const-string v2, "/api/auth/email/code"

    .line 160
    .line 161
    const-class v3, Lwr1;

    .line 162
    .line 163
    check-cast v0, Ljava/util/Map;

    .line 164
    .line 165
    invoke-static {v0, v2, v3}, Lrr1;->s(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    new-instance v0, Ljava/lang/ClassCastException;

    .line 169
    .line 170
    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    .line 171
    .line 172
    .line 173
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 174
    :catchall_3
    move-exception v0

    .line 175
    new-instance v2, Ls14;

    .line 176
    .line 177
    invoke-direct {v2, v0}, Ls14;-><init>(Ljava/lang/Throwable;)V

    .line 178
    .line 179
    .line 180
    sget-object v0, Lio1;->b:Landroid/os/Handler;

    .line 181
    .line 182
    new-instance v3, Lv6;

    .line 183
    .line 184
    const/16 v4, 0xb

    .line 185
    .line 186
    iget-object p0, p0, Lyn1;->p:Lfo1;

    .line 187
    .line 188
    invoke-direct {v3, p0, v2, v1, v4}, Lv6;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {v0, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 192
    .line 193
    .line 194
    return-void

    .line 195
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
