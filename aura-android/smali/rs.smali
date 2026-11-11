.class public final Lrs;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lt04;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 12
    iput p1, p0, Lrs;->a:I

    iput-object p2, p0, Lrs;->b:Ljava/lang/Object;

    iput-object p3, p0, Lrs;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/content/res/Resources;Lt04;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lrs;->a:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lrs;->c:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Lrs;->b:Ljava/lang/Object;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ldb3;)Z
    .locals 1

    .line 1
    iget v0, p0, Lrs;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/io/InputStream;

    .line 7
    .line 8
    const/4 p0, 0x1

    .line 9
    return p0

    .line 10
    :pswitch_0
    check-cast p1, Landroid/net/Uri;

    .line 11
    .line 12
    const-string p0, "android.resource"

    .line 13
    .line 14
    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    return p0

    .line 23
    :pswitch_1
    iget-object p0, p0, Lrs;->b:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast p0, Lt04;

    .line 26
    .line 27
    invoke-interface {p0, p1, p2}, Lt04;->a(Ljava/lang/Object;Ldb3;)Z

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    return p0

    .line 32
    nop

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final b(Ljava/lang/Object;IILdb3;)Lq04;
    .locals 11

    .line 1
    iget v0, p0, Lrs;->a:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    packed-switch v0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    check-cast p1, Ljava/io/InputStream;

    .line 8
    .line 9
    instance-of v0, p1, Law3;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    check-cast p1, Law3;

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    move v2, v0

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    new-instance v0, Law3;

    .line 19
    .line 20
    iget-object v2, p0, Lrs;->c:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v2, Lqj0;

    .line 23
    .line 24
    invoke-direct {v0, p1, v2}, Law3;-><init>(Ljava/io/InputStream;Lqj0;)V

    .line 25
    .line 26
    .line 27
    const/4 p1, 0x1

    .line 28
    move v2, p1

    .line 29
    move-object p1, v0

    .line 30
    :goto_0
    sget-object v3, Ln21;->p:Ljava/util/ArrayDeque;

    .line 31
    .line 32
    monitor-enter v3

    .line 33
    :try_start_0
    invoke-virtual {v3}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    check-cast v0, Ln21;

    .line 38
    .line 39
    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 40
    if-nez v0, :cond_1

    .line 41
    .line 42
    new-instance v0, Ln21;

    .line 43
    .line 44
    invoke-direct {v0}, Ljava/io/InputStream;-><init>()V

    .line 45
    .line 46
    .line 47
    :cond_1
    move-object v4, v0

    .line 48
    iput-object p1, v4, Ln21;->n:Law3;

    .line 49
    .line 50
    new-instance v0, Lmg2;

    .line 51
    .line 52
    invoke-direct {v0, v4}, Lmg2;-><init>(Ln21;)V

    .line 53
    .line 54
    .line 55
    new-instance v10, Lwo0;

    .line 56
    .line 57
    invoke-direct {v10, p1, v4}, Lwo0;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    :try_start_1
    iget-object p0, p0, Lrs;->b:Ljava/lang/Object;

    .line 61
    .line 62
    move-object v5, p0

    .line 63
    check-cast v5, Liu0;

    .line 64
    .line 65
    new-instance v6, Lyc5;

    .line 66
    .line 67
    iget-object p0, v5, Liu0;->d:Ljava/util/ArrayList;

    .line 68
    .line 69
    iget-object v7, v5, Liu0;->c:Lqj0;

    .line 70
    .line 71
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 72
    .line 73
    .line 74
    const-string v8, "Argument must not be null"

    .line 75
    .line 76
    invoke-static {v7, v8}, Lh12;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    iput-object v7, v6, Lyc5;->o:Ljava/lang/Object;

    .line 80
    .line 81
    invoke-static {p0, v8}, Lh12;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    iput-object p0, v6, Lyc5;->p:Ljava/lang/Object;

    .line 85
    .line 86
    new-instance p0, Lhg3;

    .line 87
    .line 88
    invoke-direct {p0, v0, v7}, Lhg3;-><init>(Ljava/io/InputStream;Lqj0;)V

    .line 89
    .line 90
    .line 91
    iput-object p0, v6, Lyc5;->n:Ljava/lang/Object;

    .line 92
    .line 93
    move v7, p2

    .line 94
    move v8, p3

    .line 95
    move-object v9, p4

    .line 96
    invoke-virtual/range {v5 .. v10}, Liu0;->a(Law1;IILdb3;Lhu0;)Lat;

    .line 97
    .line 98
    .line 99
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 100
    iput-object v1, v4, Ln21;->o:Ljava/io/IOException;

    .line 101
    .line 102
    iput-object v1, v4, Ln21;->n:Law3;

    .line 103
    .line 104
    monitor-enter v3

    .line 105
    :try_start_2
    invoke-virtual {v3, v4}, Ljava/util/ArrayDeque;->offer(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    monitor-exit v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 109
    if-eqz v2, :cond_2

    .line 110
    .line 111
    invoke-virtual {p1}, Law3;->f()V

    .line 112
    .line 113
    .line 114
    :cond_2
    return-object p0

    .line 115
    :catchall_0
    move-exception v0

    .line 116
    move-object p0, v0

    .line 117
    :try_start_3
    monitor-exit v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 118
    throw p0

    .line 119
    :catchall_1
    move-exception v0

    .line 120
    move-object p0, v0

    .line 121
    iput-object v1, v4, Ln21;->o:Ljava/io/IOException;

    .line 122
    .line 123
    iput-object v1, v4, Ln21;->n:Law3;

    .line 124
    .line 125
    sget-object p2, Ln21;->p:Ljava/util/ArrayDeque;

    .line 126
    .line 127
    monitor-enter p2

    .line 128
    :try_start_4
    invoke-virtual {p2, v4}, Ljava/util/ArrayDeque;->offer(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    monitor-exit p2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 132
    if-eqz v2, :cond_3

    .line 133
    .line 134
    invoke-virtual {p1}, Law3;->f()V

    .line 135
    .line 136
    .line 137
    :cond_3
    throw p0

    .line 138
    :catchall_2
    move-exception v0

    .line 139
    move-object p0, v0

    .line 140
    :try_start_5
    monitor-exit p2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 141
    throw p0

    .line 142
    :catchall_3
    move-exception v0

    .line 143
    move-object p0, v0

    .line 144
    :try_start_6
    monitor-exit v3
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 145
    throw p0

    .line 146
    :pswitch_0
    move v7, p2

    .line 147
    move v8, p3

    .line 148
    move-object v9, p4

    .line 149
    check-cast p1, Landroid/net/Uri;

    .line 150
    .line 151
    iget-object p2, p0, Lrs;->b:Ljava/lang/Object;

    .line 152
    .line 153
    check-cast p2, Lv04;

    .line 154
    .line 155
    invoke-virtual {p2, p1, v9}, Lv04;->c(Landroid/net/Uri;Ldb3;)Lq04;

    .line 156
    .line 157
    .line 158
    move-result-object p1

    .line 159
    if-nez p1, :cond_4

    .line 160
    .line 161
    goto :goto_1

    .line 162
    :cond_4
    check-cast p1, Lwh1;

    .line 163
    .line 164
    invoke-virtual {p1}, Lwh1;->get()Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object p1

    .line 168
    check-cast p1, Landroid/graphics/drawable/Drawable;

    .line 169
    .line 170
    iget-object p0, p0, Lrs;->c:Ljava/lang/Object;

    .line 171
    .line 172
    check-cast p0, Lzs;

    .line 173
    .line 174
    invoke-static {p0, p1, v7, v8}, Lvv0;->a(Lzs;Landroid/graphics/drawable/Drawable;II)Lat;

    .line 175
    .line 176
    .line 177
    move-result-object v1

    .line 178
    :goto_1
    return-object v1

    .line 179
    :pswitch_1
    move v7, p2

    .line 180
    move v8, p3

    .line 181
    move-object v9, p4

    .line 182
    iget-object p2, p0, Lrs;->b:Ljava/lang/Object;

    .line 183
    .line 184
    check-cast p2, Lt04;

    .line 185
    .line 186
    invoke-interface {p2, p1, v7, v8, v9}, Lt04;->b(Ljava/lang/Object;IILdb3;)Lq04;

    .line 187
    .line 188
    .line 189
    move-result-object p1

    .line 190
    iget-object p0, p0, Lrs;->c:Ljava/lang/Object;

    .line 191
    .line 192
    check-cast p0, Landroid/content/res/Resources;

    .line 193
    .line 194
    if-nez p1, :cond_5

    .line 195
    .line 196
    goto :goto_2

    .line 197
    :cond_5
    new-instance v1, Lat;

    .line 198
    .line 199
    invoke-direct {v1, p0, p1}, Lat;-><init>(Landroid/content/res/Resources;Lq04;)V

    .line 200
    .line 201
    .line 202
    :goto_2
    return-object v1

    .line 203
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
