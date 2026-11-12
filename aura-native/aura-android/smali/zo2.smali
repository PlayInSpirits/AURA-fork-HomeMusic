.class public final Lzo2;
.super Lqq2;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final synthetic F:I


# instance fields
.field public final A:Luo2;

.field public final B:Lym;

.field public C:Ljava/util/ArrayList;

.field public final D:Landroid/util/ArrayMap;

.field public E:Ljava/lang/String;

.field public final v:Landroid/media/MediaRouter2;

.field public final w:Lhg3;

.field public final x:Landroid/util/ArrayMap;

.field public final y:Landroid/media/MediaRouter2$RouteCallback;

.field public final z:Lyo2;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-string v0, "MR2Provider"

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lhg3;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, v0}, Lqq2;-><init>(Landroid/content/Context;Lom1;)V

    .line 3
    .line 4
    .line 5
    new-instance v0, Landroid/util/ArrayMap;

    .line 6
    .line 7
    invoke-direct {v0}, Landroid/util/ArrayMap;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lzo2;->x:Landroid/util/ArrayMap;

    .line 11
    .line 12
    new-instance v0, Lyo2;

    .line 13
    .line 14
    invoke-direct {v0, p0}, Lyo2;-><init>(Lzo2;)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lzo2;->z:Lyo2;

    .line 18
    .line 19
    new-instance v0, Luo2;

    .line 20
    .line 21
    invoke-direct {v0, p0}, Luo2;-><init>(Lzo2;)V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Lzo2;->A:Luo2;

    .line 25
    .line 26
    new-instance v0, Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 29
    .line 30
    .line 31
    iput-object v0, p0, Lzo2;->C:Ljava/util/ArrayList;

    .line 32
    .line 33
    new-instance v0, Landroid/util/ArrayMap;

    .line 34
    .line 35
    invoke-direct {v0}, Landroid/util/ArrayMap;-><init>()V

    .line 36
    .line 37
    .line 38
    iput-object v0, p0, Lzo2;->D:Landroid/util/ArrayMap;

    .line 39
    .line 40
    invoke-static {p1}, Lto2;->d(Landroid/content/Context;)Landroid/media/MediaRouter2;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    iput-object p1, p0, Lzo2;->v:Landroid/media/MediaRouter2;

    .line 45
    .line 46
    iput-object p2, p0, Lzo2;->w:Lhg3;

    .line 47
    .line 48
    new-instance p1, Landroid/os/Handler;

    .line 49
    .line 50
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    invoke-direct {p1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 55
    .line 56
    .line 57
    new-instance p2, Lym;

    .line 58
    .line 59
    const/4 v0, 0x0

    .line 60
    invoke-direct {p2, p1, v0}, Lym;-><init>(Landroid/os/Handler;I)V

    .line 61
    .line 62
    .line 63
    iput-object p2, p0, Lzo2;->B:Lym;

    .line 64
    .line 65
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 66
    .line 67
    const/16 p2, 0x22

    .line 68
    .line 69
    if-lt p1, p2, :cond_0

    .line 70
    .line 71
    new-instance p1, Lxo2;

    .line 72
    .line 73
    const/4 p2, 0x1

    .line 74
    invoke-direct {p1, p0, p2}, Lxo2;-><init>(Lzo2;I)V

    .line 75
    .line 76
    .line 77
    iput-object p1, p0, Lzo2;->y:Landroid/media/MediaRouter2$RouteCallback;

    .line 78
    .line 79
    return-void

    .line 80
    :cond_0
    new-instance p1, Lxo2;

    .line 81
    .line 82
    invoke-direct {p1, p0, v0}, Lxo2;-><init>(Lzo2;I)V

    .line 83
    .line 84
    .line 85
    iput-object p1, p0, Lzo2;->y:Landroid/media/MediaRouter2$RouteCallback;

    .line 86
    .line 87
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Lpq2;)Lnq2;
    .locals 1

    .line 1
    iget-object p0, p0, Lzo2;->x:Landroid/util/ArrayMap;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/util/ArrayMap;->entrySet()Ljava/util/Set;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result p2

    .line 15
    if-eqz p2, :cond_1

    .line 16
    .line 17
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    check-cast p2, Ljava/util/Map$Entry;

    .line 22
    .line 23
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    check-cast p2, Lvo2;

    .line 28
    .line 29
    iget-object v0, p2, Lvo2;->f:Ljava/lang/String;

    .line 30
    .line 31
    invoke-static {p1, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_0

    .line 36
    .line 37
    return-object p2

    .line 38
    :cond_1
    const/4 p0, 0x0

    .line 39
    return-object p0
.end method

.method public final b(Ljava/lang/String;)Loq2;
    .locals 2

    .line 1
    iget-object p0, p0, Lzo2;->D:Landroid/util/ArrayMap;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroid/util/ArrayMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/String;

    .line 8
    .line 9
    new-instance p1, Lwo2;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    const/4 v1, 0x0

    .line 13
    invoke-direct {p1, v1, p0, v0}, Lwo2;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    return-object p1
.end method

.method public final d(Ljava/lang/String;Ljava/lang/String;)Loq2;
    .locals 4

    .line 1
    iget-object v0, p0, Lzo2;->D:Landroid/util/ArrayMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/util/ArrayMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/String;

    .line 8
    .line 9
    iget-object p0, p0, Lzo2;->x:Landroid/util/ArrayMap;

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/util/ArrayMap;->values()Ljava/util/Collection;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    const/4 v2, 0x0

    .line 24
    if-eqz v1, :cond_2

    .line 25
    .line 26
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    check-cast v1, Lvo2;

    .line 31
    .line 32
    iget-object v3, v1, Lvo2;->o:Lsp2;

    .line 33
    .line 34
    if-eqz v3, :cond_1

    .line 35
    .line 36
    invoke-virtual {v3}, Lsp2;->d()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    goto :goto_0

    .line 41
    :cond_1
    iget-object v3, v1, Lvo2;->g:Landroid/media/MediaRouter2$RoutingController;

    .line 42
    .line 43
    invoke-static {v3}, Lto2;->j(Landroid/media/MediaRouter2$RoutingController;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    :goto_0
    invoke-static {p2, v3}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    if-eqz v3, :cond_0

    .line 52
    .line 53
    new-instance p0, Lwo2;

    .line 54
    .line 55
    invoke-direct {p0, v2, v0, v1}, Lwo2;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    return-object p0

    .line 59
    :cond_2
    new-instance p0, Ljava/lang/StringBuilder;

    .line 60
    .line 61
    const-string v1, "Could not find the matching GroupRouteController. routeId="

    .line 62
    .line 63
    invoke-direct {p0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    const-string p1, ", routeGroupId="

    .line 70
    .line 71
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    const-string p1, "MR2Provider"

    .line 82
    .line 83
    invoke-static {p1, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 84
    .line 85
    .line 86
    new-instance p0, Lwo2;

    .line 87
    .line 88
    const/4 p1, 0x0

    .line 89
    invoke-direct {p0, v2, v0, p1}, Lwo2;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    return-object p0
.end method

.method public final e(Lup2;)V
    .locals 13

    .line 1
    sget-object v0, Lyq2;->c:Lui1;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    move v0, v1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-static {}, Lyq2;->c()Lui1;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget v0, v0, Lui1;->z:I

    .line 13
    .line 14
    :goto_0
    iget-object v2, p0, Lzo2;->y:Landroid/media/MediaRouter2$RouteCallback;

    .line 15
    .line 16
    iget-object v3, p0, Lzo2;->A:Luo2;

    .line 17
    .line 18
    iget-object v4, p0, Lzo2;->z:Lyo2;

    .line 19
    .line 20
    if-lez v0, :cond_a

    .line 21
    .line 22
    invoke-static {}, Lyq2;->c()Lui1;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    if-nez p1, :cond_1

    .line 30
    .line 31
    new-instance p1, Lup2;

    .line 32
    .line 33
    sget-object v0, Lrq2;->c:Lrq2;

    .line 34
    .line 35
    invoke-direct {p1, v0, v1}, Lup2;-><init>(Lrq2;Z)V

    .line 36
    .line 37
    .line 38
    :cond_1
    invoke-virtual {p1}, Lup2;->a()V

    .line 39
    .line 40
    .line 41
    iget-object v0, p1, Lup2;->b:Lrq2;

    .line 42
    .line 43
    invoke-virtual {v0}, Lrq2;->b()Ljava/util/ArrayList;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    const-string v5, "android.media.intent.category.LIVE_AUDIO"

    .line 48
    .line 49
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    new-instance v6, Lc52;

    .line 53
    .line 54
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v6, v0}, Lc52;->a(Ljava/util/ArrayList;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v6}, Lc52;->d()Lrq2;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-virtual {p1}, Lup2;->b()Z

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    if-eqz v0, :cond_9

    .line 69
    .line 70
    new-instance v6, Landroid/os/Bundle;

    .line 71
    .line 72
    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    .line 73
    .line 74
    .line 75
    iget-object v7, v0, Lrq2;->a:Landroid/os/Bundle;

    .line 76
    .line 77
    const-string v8, "selector"

    .line 78
    .line 79
    invoke-virtual {v6, v8, v7}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 80
    .line 81
    .line 82
    const-string v7, "activeScan"

    .line 83
    .line 84
    invoke-virtual {v6, v7, p1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 85
    .line 86
    .line 87
    iget-object p1, p0, Lzo2;->v:Landroid/media/MediaRouter2;

    .line 88
    .line 89
    invoke-virtual {v0}, Lrq2;->a()V

    .line 90
    .line 91
    .line 92
    iget-object v8, v0, Lrq2;->b:Ljava/util/List;

    .line 93
    .line 94
    const/4 v9, 0x0

    .line 95
    invoke-interface {v8, v9}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result v8

    .line 99
    if-eqz v8, :cond_2

    .line 100
    .line 101
    invoke-static {}, Ll3;->C()V

    .line 102
    .line 103
    .line 104
    new-instance v0, Ljava/util/ArrayList;

    .line 105
    .line 106
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 107
    .line 108
    .line 109
    invoke-static {v0}, Lto2;->e(Ljava/util/ArrayList;)Landroid/media/RouteDiscoveryPreference$Builder;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    invoke-static {v0}, Ll3;->i(Landroid/media/RouteDiscoveryPreference$Builder;)Landroid/media/RouteDiscoveryPreference;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    goto/16 :goto_4

    .line 118
    .line 119
    :cond_2
    invoke-virtual {v6, v7}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 120
    .line 121
    .line 122
    move-result v6

    .line 123
    new-instance v7, Ljava/util/ArrayList;

    .line 124
    .line 125
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v0}, Lrq2;->b()Ljava/util/ArrayList;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 133
    .line 134
    .line 135
    move-result v8

    .line 136
    move v9, v1

    .line 137
    :goto_1
    if-ge v9, v8, :cond_8

    .line 138
    .line 139
    invoke-virtual {v0, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v10

    .line 143
    add-int/lit8 v9, v9, 0x1

    .line 144
    .line 145
    check-cast v10, Ljava/lang/String;

    .line 146
    .line 147
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v10}, Ljava/lang/String;->hashCode()I

    .line 151
    .line 152
    .line 153
    move-result v11

    .line 154
    const/4 v12, -0x1

    .line 155
    sparse-switch v11, :sswitch_data_0

    .line 156
    .line 157
    .line 158
    goto :goto_2

    .line 159
    :sswitch_0
    const-string v11, "android.media.intent.category.REMOTE_VIDEO_PLAYBACK"

    .line 160
    .line 161
    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    move-result v11

    .line 165
    if-nez v11, :cond_3

    .line 166
    .line 167
    goto :goto_2

    .line 168
    :cond_3
    const/4 v12, 0x4

    .line 169
    goto :goto_2

    .line 170
    :sswitch_1
    const-string v11, "android.media.intent.category.REMOTE_AUDIO_PLAYBACK"

    .line 171
    .line 172
    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    move-result v11

    .line 176
    if-nez v11, :cond_4

    .line 177
    .line 178
    goto :goto_2

    .line 179
    :cond_4
    const/4 v12, 0x3

    .line 180
    goto :goto_2

    .line 181
    :sswitch_2
    const-string v11, "android.media.intent.category.LIVE_VIDEO"

    .line 182
    .line 183
    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 184
    .line 185
    .line 186
    move-result v11

    .line 187
    if-nez v11, :cond_5

    .line 188
    .line 189
    goto :goto_2

    .line 190
    :cond_5
    const/4 v12, 0x2

    .line 191
    goto :goto_2

    .line 192
    :sswitch_3
    invoke-virtual {v10, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    move-result v11

    .line 196
    if-nez v11, :cond_6

    .line 197
    .line 198
    goto :goto_2

    .line 199
    :cond_6
    const/4 v12, 0x1

    .line 200
    goto :goto_2

    .line 201
    :sswitch_4
    const-string v11, "android.media.intent.category.REMOTE_PLAYBACK"

    .line 202
    .line 203
    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 204
    .line 205
    .line 206
    move-result v11

    .line 207
    if-nez v11, :cond_7

    .line 208
    .line 209
    goto :goto_2

    .line 210
    :cond_7
    move v12, v1

    .line 211
    :goto_2
    packed-switch v12, :pswitch_data_0

    .line 212
    .line 213
    .line 214
    goto :goto_3

    .line 215
    :pswitch_0
    const-string v10, "android.media.route.feature.REMOTE_VIDEO_PLAYBACK"

    .line 216
    .line 217
    goto :goto_3

    .line 218
    :pswitch_1
    const-string v10, "android.media.route.feature.REMOTE_AUDIO_PLAYBACK"

    .line 219
    .line 220
    goto :goto_3

    .line 221
    :pswitch_2
    const-string v10, "android.media.route.feature.LIVE_VIDEO"

    .line 222
    .line 223
    goto :goto_3

    .line 224
    :pswitch_3
    const-string v10, "android.media.route.feature.LIVE_AUDIO"

    .line 225
    .line 226
    goto :goto_3

    .line 227
    :pswitch_4
    const-string v10, "android.media.route.feature.REMOTE_PLAYBACK"

    .line 228
    .line 229
    :goto_3
    invoke-virtual {v7, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 230
    .line 231
    .line 232
    goto :goto_1

    .line 233
    :cond_8
    invoke-static {v7, v6}, Lto2;->f(Ljava/util/ArrayList;Z)Landroid/media/RouteDiscoveryPreference$Builder;

    .line 234
    .line 235
    .line 236
    move-result-object v0

    .line 237
    invoke-static {v0}, Ll3;->i(Landroid/media/RouteDiscoveryPreference$Builder;)Landroid/media/RouteDiscoveryPreference;

    .line 238
    .line 239
    .line 240
    move-result-object v0

    .line 241
    :goto_4
    iget-object v1, p0, Lzo2;->B:Lym;

    .line 242
    .line 243
    invoke-static {p1, v1, v2, v0}, Lto2;->s(Landroid/media/MediaRouter2;Lym;Landroid/media/MediaRouter2$RouteCallback;Landroid/media/RouteDiscoveryPreference;)V

    .line 244
    .line 245
    .line 246
    iget-object p1, p0, Lzo2;->v:Landroid/media/MediaRouter2;

    .line 247
    .line 248
    invoke-static {p1, v1, v4}, Lto2;->r(Landroid/media/MediaRouter2;Lym;Lyo2;)V

    .line 249
    .line 250
    .line 251
    iget-object p0, p0, Lzo2;->v:Landroid/media/MediaRouter2;

    .line 252
    .line 253
    invoke-static {p0, v1, v3}, Lto2;->q(Landroid/media/MediaRouter2;Lym;Luo2;)V

    .line 254
    .line 255
    .line 256
    return-void

    .line 257
    :cond_9
    const-string p0, "selector must not be null"

    .line 258
    .line 259
    invoke-static {p0}, Lkf2;->n(Ljava/lang/String;)V

    .line 260
    .line 261
    .line 262
    return-void

    .line 263
    :cond_a
    iget-object p1, p0, Lzo2;->v:Landroid/media/MediaRouter2;

    .line 264
    .line 265
    invoke-static {p1, v2}, Lto2;->v(Landroid/media/MediaRouter2;Landroid/media/MediaRouter2$RouteCallback;)V

    .line 266
    .line 267
    .line 268
    iget-object p1, p0, Lzo2;->v:Landroid/media/MediaRouter2;

    .line 269
    .line 270
    invoke-static {p1, v4}, Lto2;->u(Landroid/media/MediaRouter2;Lyo2;)V

    .line 271
    .line 272
    .line 273
    iget-object p0, p0, Lzo2;->v:Landroid/media/MediaRouter2;

    .line 274
    .line 275
    invoke-static {p0, v3}, Lto2;->t(Landroid/media/MediaRouter2;Luo2;)V

    .line 276
    .line 277
    .line 278
    return-void

    .line 279
    :sswitch_data_0
    .sparse-switch
        -0x7b1e3633 -> :sswitch_4
        0x3909bb2a -> :sswitch_3
        0x3a2c33cf -> :sswitch_2
        0x5f7016b6 -> :sswitch_1
        0x64ea87b1 -> :sswitch_0
    .end sparse-switch

    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final h(Ljava/lang/String;)Landroid/media/MediaRoute2Info;
    .locals 4

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    iget-object p0, p0, Lzo2;->C:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x0

    .line 11
    :cond_1
    if-ge v1, v0, :cond_2

    .line 12
    .line 13
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    add-int/lit8 v1, v1, 0x1

    .line 18
    .line 19
    invoke-static {v2}, Ll3;->g(Ljava/lang/Object;)Landroid/media/MediaRoute2Info;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-static {v2}, Lto2;->i(Landroid/media/MediaRoute2Info;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    invoke-static {v3, p1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    if-eqz v3, :cond_1

    .line 32
    .line 33
    return-object v2

    .line 34
    :cond_2
    :goto_0
    const/4 p0, 0x0

    .line 35
    return-object p0
.end method

.method public final i()V
    .locals 9

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Landroid/util/ArraySet;

    .line 7
    .line 8
    invoke-direct {v1}, Landroid/util/ArraySet;-><init>()V

    .line 9
    .line 10
    .line 11
    iget-object v2, p0, Lzo2;->v:Landroid/media/MediaRouter2;

    .line 12
    .line 13
    invoke-static {v2}, Lto2;->m(Landroid/media/MediaRouter2;)Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    if-eqz v3, :cond_2

    .line 26
    .line 27
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    invoke-static {v3}, Ll3;->g(Ljava/lang/Object;)Landroid/media/MediaRoute2Info;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    if-eqz v3, :cond_0

    .line 36
    .line 37
    invoke-virtual {v1, v3}, Landroid/util/ArraySet;->contains(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    if-nez v4, :cond_0

    .line 42
    .line 43
    invoke-static {v3}, Ll3;->A(Landroid/media/MediaRoute2Info;)Z

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    if-eqz v4, :cond_1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    invoke-virtual {v1, v3}, Landroid/util/ArraySet;->add(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_2
    iget-object v1, p0, Lzo2;->C:Ljava/util/ArrayList;

    .line 58
    .line 59
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->equals(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    if-eqz v1, :cond_3

    .line 64
    .line 65
    return-void

    .line 66
    :cond_3
    iput-object v0, p0, Lzo2;->C:Ljava/util/ArrayList;

    .line 67
    .line 68
    iget-object v0, p0, Lzo2;->D:Landroid/util/ArrayMap;

    .line 69
    .line 70
    invoke-virtual {v0}, Landroid/util/ArrayMap;->clear()V

    .line 71
    .line 72
    .line 73
    iget-object v1, p0, Lzo2;->C:Ljava/util/ArrayList;

    .line 74
    .line 75
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    const/4 v3, 0x0

    .line 80
    move v4, v3

    .line 81
    :goto_1
    if-ge v4, v2, :cond_6

    .line 82
    .line 83
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v5

    .line 87
    add-int/lit8 v4, v4, 0x1

    .line 88
    .line 89
    invoke-static {v5}, Ll3;->g(Ljava/lang/Object;)Landroid/media/MediaRoute2Info;

    .line 90
    .line 91
    .line 92
    move-result-object v5

    .line 93
    invoke-static {v5}, Ll3;->j(Landroid/media/MediaRoute2Info;)Landroid/os/Bundle;

    .line 94
    .line 95
    .line 96
    move-result-object v6

    .line 97
    if-eqz v6, :cond_5

    .line 98
    .line 99
    const-string v7, "androidx.mediarouter.media.KEY_ORIGINAL_ROUTE_ID"

    .line 100
    .line 101
    invoke-virtual {v6, v7}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v8

    .line 105
    if-nez v8, :cond_4

    .line 106
    .line 107
    goto :goto_2

    .line 108
    :cond_4
    invoke-static {v5}, Ll3;->p(Landroid/media/MediaRoute2Info;)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v5

    .line 112
    invoke-virtual {v6, v7}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v6

    .line 116
    invoke-virtual {v0, v5, v6}, Landroid/util/ArrayMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    goto :goto_1

    .line 120
    :cond_5
    :goto_2
    new-instance v6, Ljava/lang/StringBuilder;

    .line 121
    .line 122
    const-string v7, "Cannot find the original route Id. route="

    .line 123
    .line 124
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v5

    .line 134
    const-string v6, "MR2Provider"

    .line 135
    .line 136
    invoke-static {v6, v5}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 137
    .line 138
    .line 139
    goto :goto_1

    .line 140
    :cond_6
    new-instance v0, Ljava/util/ArrayList;

    .line 141
    .line 142
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 143
    .line 144
    .line 145
    iget-object v1, p0, Lzo2;->C:Ljava/util/ArrayList;

    .line 146
    .line 147
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 148
    .line 149
    .line 150
    move-result v2

    .line 151
    move v4, v3

    .line 152
    :cond_7
    :goto_3
    if-ge v4, v2, :cond_8

    .line 153
    .line 154
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v5

    .line 158
    add-int/lit8 v4, v4, 0x1

    .line 159
    .line 160
    invoke-static {v5}, Ll3;->g(Ljava/lang/Object;)Landroid/media/MediaRoute2Info;

    .line 161
    .line 162
    .line 163
    move-result-object v5

    .line 164
    invoke-static {v5}, Lbu;->G(Landroid/media/MediaRoute2Info;)Lsp2;

    .line 165
    .line 166
    .line 167
    move-result-object v5

    .line 168
    if-eqz v5, :cond_7

    .line 169
    .line 170
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    goto :goto_3

    .line 174
    :cond_8
    new-instance v1, Ljava/util/ArrayList;

    .line 175
    .line 176
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 177
    .line 178
    .line 179
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 180
    .line 181
    .line 182
    move-result v2

    .line 183
    if-nez v2, :cond_b

    .line 184
    .line 185
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 186
    .line 187
    .line 188
    move-result v2

    .line 189
    :goto_4
    if-ge v3, v2, :cond_b

    .line 190
    .line 191
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v4

    .line 195
    add-int/lit8 v3, v3, 0x1

    .line 196
    .line 197
    check-cast v4, Lsp2;

    .line 198
    .line 199
    if-eqz v4, :cond_a

    .line 200
    .line 201
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 202
    .line 203
    .line 204
    move-result v5

    .line 205
    if-nez v5, :cond_9

    .line 206
    .line 207
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 208
    .line 209
    .line 210
    goto :goto_4

    .line 211
    :cond_9
    const-string p0, "route descriptor already added"

    .line 212
    .line 213
    invoke-static {p0}, Lkf2;->n(Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    return-void

    .line 217
    :cond_a
    const-string p0, "route must not be null"

    .line 218
    .line 219
    invoke-static {p0}, Lkf2;->n(Ljava/lang/String;)V

    .line 220
    .line 221
    .line 222
    return-void

    .line 223
    :cond_b
    new-instance v0, Lxk0;

    .line 224
    .line 225
    const/4 v2, 0x1

    .line 226
    invoke-direct {v0, v1, v2}, Lxk0;-><init>(Ljava/util/ArrayList;Z)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {p0, v0}, Lqq2;->f(Lxk0;)V

    .line 230
    .line 231
    .line 232
    return-void
.end method

.method public final j(Landroid/media/MediaRouter2$RoutingController;)V
    .locals 13

    .line 1
    iget-object v0, p0, Lzo2;->x:Landroid/util/ArrayMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/util/ArrayMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    move-object v1, v0

    .line 8
    check-cast v1, Lvo2;

    .line 9
    .line 10
    const-string v2, "MR2Provider"

    .line 11
    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    new-instance p0, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    const-string v0, "setDynamicRouteDescriptors: No matching routeController found. routingController="

    .line 17
    .line 18
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-static {v2, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_0
    invoke-static {p1}, Lto2;->l(Landroid/media/MediaRouter2$RoutingController;)Ljava/util/List;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    if-eqz v3, :cond_1

    .line 41
    .line 42
    new-instance p0, Ljava/lang/StringBuilder;

    .line 43
    .line 44
    const-string v0, "setDynamicRouteDescriptors: No selected routes. This may happen when the selected routes become invalid.routingController="

    .line 45
    .line 46
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    invoke-static {v2, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :cond_1
    invoke-static {v0}, Lbu;->p(Ljava/util/List;)Ljava/util/ArrayList;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    const/4 v4, 0x0

    .line 65
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    invoke-static {v0}, Ll3;->g(Ljava/lang/Object;)Landroid/media/MediaRoute2Info;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-static {v0}, Lbu;->G(Landroid/media/MediaRoute2Info;)Lsp2;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    invoke-static {p1}, Lto2;->g(Landroid/media/MediaRouter2$RoutingController;)Landroid/os/Bundle;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    iget-object v5, p0, Lqq2;->n:Landroid/content/Context;

    .line 82
    .line 83
    const v6, 0x7f13036b

    .line 84
    .line 85
    .line 86
    invoke-virtual {v5, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v5

    .line 90
    const/4 v6, 0x0

    .line 91
    if-eqz v0, :cond_3

    .line 92
    .line 93
    :try_start_0
    const-string v7, "androidx.mediarouter.media.KEY_SESSION_NAME"

    .line 94
    .line 95
    invoke-virtual {v0, v7}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v7

    .line 99
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 100
    .line 101
    .line 102
    move-result v8

    .line 103
    if-nez v8, :cond_2

    .line 104
    .line 105
    move-object v5, v7

    .line 106
    :cond_2
    const-string v7, "androidx.mediarouter.media.KEY_GROUP_ROUTE"

    .line 107
    .line 108
    invoke-virtual {v0, v7}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    if-eqz v0, :cond_3

    .line 113
    .line 114
    new-instance v7, Lsp2;

    .line 115
    .line 116
    invoke-direct {v7, v0}, Lsp2;-><init>(Landroid/os/Bundle;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 117
    .line 118
    .line 119
    move-object v6, v7

    .line 120
    goto :goto_0

    .line 121
    :catch_0
    move-exception v0

    .line 122
    const-string v7, "Exception while unparceling control hints."

    .line 123
    .line 124
    invoke-static {v2, v7, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 125
    .line 126
    .line 127
    :cond_3
    :goto_0
    const/4 v0, 0x1

    .line 128
    if-nez v6, :cond_4

    .line 129
    .line 130
    new-instance v6, Lss0;

    .line 131
    .line 132
    invoke-static {p1}, Lto2;->j(Landroid/media/MediaRouter2$RoutingController;)Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v7

    .line 136
    invoke-direct {v6, v7, v5}, Lss0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    iget-object v5, v6, Lss0;->n:Ljava/lang/Object;

    .line 140
    .line 141
    check-cast v5, Landroid/os/Bundle;

    .line 142
    .line 143
    const/4 v7, 0x2

    .line 144
    const-string v8, "connectionState"

    .line 145
    .line 146
    invoke-virtual {v5, v8, v7}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 147
    .line 148
    .line 149
    const-string v7, "playbackType"

    .line 150
    .line 151
    invoke-virtual {v5, v7, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 152
    .line 153
    .line 154
    goto :goto_1

    .line 155
    :cond_4
    new-instance v5, Lss0;

    .line 156
    .line 157
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 158
    .line 159
    .line 160
    new-instance v7, Ljava/util/ArrayList;

    .line 161
    .line 162
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 163
    .line 164
    .line 165
    iput-object v7, v5, Lss0;->o:Ljava/lang/Object;

    .line 166
    .line 167
    new-instance v7, Ljava/util/ArrayList;

    .line 168
    .line 169
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 170
    .line 171
    .line 172
    iput-object v7, v5, Lss0;->p:Ljava/lang/Object;

    .line 173
    .line 174
    new-instance v7, Ljava/util/HashSet;

    .line 175
    .line 176
    invoke-direct {v7}, Ljava/util/HashSet;-><init>()V

    .line 177
    .line 178
    .line 179
    iput-object v7, v5, Lss0;->q:Ljava/lang/Object;

    .line 180
    .line 181
    new-instance v7, Landroid/os/Bundle;

    .line 182
    .line 183
    iget-object v8, v6, Lsp2;->a:Landroid/os/Bundle;

    .line 184
    .line 185
    invoke-direct {v7, v8}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 186
    .line 187
    .line 188
    iput-object v7, v5, Lss0;->n:Ljava/lang/Object;

    .line 189
    .line 190
    invoke-virtual {v6}, Lsp2;->c()Ljava/util/ArrayList;

    .line 191
    .line 192
    .line 193
    move-result-object v7

    .line 194
    iput-object v7, v5, Lss0;->o:Ljava/lang/Object;

    .line 195
    .line 196
    invoke-virtual {v6}, Lsp2;->b()Ljava/util/ArrayList;

    .line 197
    .line 198
    .line 199
    move-result-object v7

    .line 200
    iput-object v7, v5, Lss0;->p:Ljava/lang/Object;

    .line 201
    .line 202
    invoke-virtual {v6}, Lsp2;->a()Ljava/util/HashSet;

    .line 203
    .line 204
    .line 205
    move-result-object v6

    .line 206
    iput-object v6, v5, Lss0;->q:Ljava/lang/Object;

    .line 207
    .line 208
    move-object v6, v5

    .line 209
    :goto_1
    iget-object v5, v6, Lss0;->n:Ljava/lang/Object;

    .line 210
    .line 211
    check-cast v5, Landroid/os/Bundle;

    .line 212
    .line 213
    invoke-static {p1}, Lto2;->b(Landroid/media/MediaRouter2$RoutingController;)I

    .line 214
    .line 215
    .line 216
    move-result v7

    .line 217
    const-string v8, "volume"

    .line 218
    .line 219
    invoke-virtual {v5, v8, v7}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 220
    .line 221
    .line 222
    invoke-static {p1}, Lto2;->y(Landroid/media/MediaRouter2$RoutingController;)I

    .line 223
    .line 224
    .line 225
    move-result v7

    .line 226
    const-string v8, "volumeMax"

    .line 227
    .line 228
    invoke-virtual {v5, v8, v7}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 229
    .line 230
    .line 231
    invoke-static {p1}, Lto2;->C(Landroid/media/MediaRouter2$RoutingController;)I

    .line 232
    .line 233
    .line 234
    move-result v7

    .line 235
    const-string v8, "volumeHandling"

    .line 236
    .line 237
    invoke-virtual {v5, v8, v7}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 238
    .line 239
    .line 240
    iget-object v5, v6, Lss0;->p:Ljava/lang/Object;

    .line 241
    .line 242
    check-cast v5, Ljava/util/ArrayList;

    .line 243
    .line 244
    invoke-virtual {v5}, Ljava/util/ArrayList;->clear()V

    .line 245
    .line 246
    .line 247
    invoke-virtual {v4}, Lsp2;->b()Ljava/util/ArrayList;

    .line 248
    .line 249
    .line 250
    move-result-object v4

    .line 251
    invoke-virtual {v6, v4}, Lss0;->n(Ljava/util/ArrayList;)V

    .line 252
    .line 253
    .line 254
    iget-object v4, v6, Lss0;->o:Ljava/lang/Object;

    .line 255
    .line 256
    check-cast v4, Ljava/util/ArrayList;

    .line 257
    .line 258
    invoke-virtual {v4}, Ljava/util/ArrayList;->clear()V

    .line 259
    .line 260
    .line 261
    invoke-virtual {v6, v3}, Lss0;->p(Ljava/util/ArrayList;)V

    .line 262
    .line 263
    .line 264
    invoke-virtual {v6}, Lss0;->r()Lsp2;

    .line 265
    .line 266
    .line 267
    move-result-object v4

    .line 268
    invoke-static {p1}, Lto2;->A(Landroid/media/MediaRouter2$RoutingController;)Ljava/util/List;

    .line 269
    .line 270
    .line 271
    move-result-object v5

    .line 272
    invoke-static {v5}, Lbu;->p(Ljava/util/List;)Ljava/util/ArrayList;

    .line 273
    .line 274
    .line 275
    move-result-object v5

    .line 276
    invoke-static {p1}, Lto2;->D(Landroid/media/MediaRouter2$RoutingController;)Ljava/util/List;

    .line 277
    .line 278
    .line 279
    move-result-object p1

    .line 280
    invoke-static {p1}, Lbu;->p(Ljava/util/List;)Ljava/util/ArrayList;

    .line 281
    .line 282
    .line 283
    move-result-object p1

    .line 284
    iget-object p0, p0, Lqq2;->t:Lxk0;

    .line 285
    .line 286
    if-nez p0, :cond_5

    .line 287
    .line 288
    const-string p0, "setDynamicRouteDescriptors: providerDescriptor is not set."

    .line 289
    .line 290
    invoke-static {v2, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 291
    .line 292
    .line 293
    return-void

    .line 294
    :cond_5
    new-instance v2, Ljava/util/ArrayList;

    .line 295
    .line 296
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 297
    .line 298
    .line 299
    iget-object p0, p0, Lxk0;->p:Ljava/lang/Object;

    .line 300
    .line 301
    check-cast p0, Ljava/util/List;

    .line 302
    .line 303
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 304
    .line 305
    .line 306
    move-result v6

    .line 307
    if-nez v6, :cond_7

    .line 308
    .line 309
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 310
    .line 311
    .line 312
    move-result-object p0

    .line 313
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 314
    .line 315
    .line 316
    move-result v6

    .line 317
    if-eqz v6, :cond_7

    .line 318
    .line 319
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 320
    .line 321
    .line 322
    move-result-object v6

    .line 323
    move-object v8, v6

    .line 324
    check-cast v8, Lsp2;

    .line 325
    .line 326
    invoke-virtual {v8}, Lsp2;->d()Ljava/lang/String;

    .line 327
    .line 328
    .line 329
    move-result-object v6

    .line 330
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 331
    .line 332
    .line 333
    move-result v7

    .line 334
    if-eqz v7, :cond_6

    .line 335
    .line 336
    const/4 v7, 0x3

    .line 337
    move v9, v7

    .line 338
    goto :goto_3

    .line 339
    :cond_6
    move v9, v0

    .line 340
    :goto_3
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 341
    .line 342
    .line 343
    move-result v11

    .line 344
    invoke-virtual {p1, v6}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 345
    .line 346
    .line 347
    move-result v10

    .line 348
    new-instance v7, Lmq2;

    .line 349
    .line 350
    const/4 v12, 0x1

    .line 351
    invoke-direct/range {v7 .. v12}, Lmq2;-><init>(Lsp2;IZZZ)V

    .line 352
    .line 353
    .line 354
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 355
    .line 356
    .line 357
    goto :goto_2

    .line 358
    :cond_7
    iput-object v4, v1, Lvo2;->o:Lsp2;

    .line 359
    .line 360
    invoke-virtual {v1, v4, v2}, Lnq2;->l(Lsp2;Ljava/util/ArrayList;)V

    .line 361
    .line 362
    .line 363
    return-void
.end method
