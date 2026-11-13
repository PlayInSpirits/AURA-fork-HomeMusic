.class public final Ldefpackage/lj2;
.super Ldefpackage/im2;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final s:Ljava/util/HashMap;

.field public final t:Ldefpackage/bj2;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ldefpackage/bj2;Ldefpackage/cb4;Landroid/os/Bundle;Landroid/os/Looper;Ldefpackage/xs;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p6}, Ldefpackage/im2;-><init>(Landroid/content/Context;Ldefpackage/sk2;Ldefpackage/cb4;Landroid/os/Bundle;Landroid/os/Looper;Ldefpackage/xs;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Ldefpackage/lj2;->s:Ljava/util/HashMap;

    .line 10
    .line 11
    new-instance p1, Ljava/util/HashMap;

    .line 12
    .line 13
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p2, p0, Ldefpackage/lj2;->t:Ldefpackage/bj2;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final P0()Ldefpackage/wa4;
    .locals 4

    .line 1
    iget-object v0, p0, Ldefpackage/im2;->j:Ldefpackage/jj2;

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/im2;->p:Ldefpackage/ml3;

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    iget-object p0, p0, Ldefpackage/ml3;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, Ldefpackage/wa4;

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    new-instance v0, Ljava/util/HashSet;

    .line 15
    .line 16
    iget-object p0, p0, Ldefpackage/wa4;->a:Ldefpackage/jx1;

    .line 17
    .line 18
    invoke-direct {v0, p0}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 19
    .line 20
    .line 21
    sget-object p0, Ldefpackage/va4;->e:Ldefpackage/gy3;

    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    :goto_0
    iget v2, p0, Ldefpackage/gy3;->q:I

    .line 25
    .line 26
    if-ge v1, v2, :cond_0

    .line 27
    .line 28
    new-instance v2, Ldefpackage/va4;

    .line 29
    .line 30
    invoke-virtual {p0, v1}, Ldefpackage/gy3;->get(I)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    check-cast v3, Ljava/lang/Integer;

    .line 35
    .line 36
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    invoke-direct {v2, v3}, Ldefpackage/va4;-><init>(I)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    add-int/lit8 v1, v1, 0x1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_0
    new-instance p0, Ldefpackage/wa4;

    .line 50
    .line 51
    invoke-direct {p0, v0}, Ldefpackage/wa4;-><init>(Ljava/util/HashSet;)V

    .line 52
    .line 53
    .line 54
    return-object p0

    .line 55
    :cond_1
    iget-object p0, p0, Ldefpackage/ml3;->b:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast p0, Ldefpackage/wa4;

    .line 58
    .line 59
    return-object p0
.end method

.method public final T0(Ldefpackage/va4;Landroid/os/Bundle;)Ldefpackage/ic2;
    .locals 8

    .line 1
    iget-object v0, p0, Ldefpackage/im2;->j:Ldefpackage/jj2;

    .line 2
    .line 3
    invoke-virtual {p0}, Ldefpackage/lj2;->P0()Ldefpackage/wa4;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-object v1, v1, Ldefpackage/wa4;->a:Ldefpackage/jx1;

    .line 8
    .line 9
    invoke-virtual {v1, p1}, Ldefpackage/rw1;->contains(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-super {p0, p1, p2}, Ldefpackage/im2;->T0(Ldefpackage/va4;Landroid/os/Bundle;)Ldefpackage/ic2;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0

    .line 20
    :cond_0
    if-eqz v0, :cond_4

    .line 21
    .line 22
    new-instance v1, Ldefpackage/lb4;

    .line 23
    .line 24
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 25
    .line 26
    .line 27
    iget-object v2, p1, Ldefpackage/va4;->b:Ljava/lang/String;

    .line 28
    .line 29
    new-instance v3, Ldefpackage/si1;

    .line 30
    .line 31
    invoke-direct {v3, p0, p1, p2, v1}, Ldefpackage/si1;-><init>(Ldefpackage/lj2;Ldefpackage/va4;Landroid/os/Bundle;Ldefpackage/lb4;)V

    .line 32
    .line 33
    .line 34
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    if-nez p0, :cond_3

    .line 39
    .line 40
    iget-object p0, v0, Ldefpackage/jj2;->a:Ldefpackage/gj2;

    .line 41
    .line 42
    iget-object p1, p0, Ldefpackage/gj2;->b:Landroid/media/browse/MediaBrowser;

    .line 43
    .line 44
    invoke-virtual {p1}, Landroid/media/browse/MediaBrowser;->isConnected()Z

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    if-eqz p1, :cond_2

    .line 49
    .line 50
    iget-object p1, p0, Ldefpackage/gj2;->f:Ldefpackage/xc5;

    .line 51
    .line 52
    if-nez p1, :cond_1

    .line 53
    .line 54
    const-string p1, "MediaBrowserCompat"

    .line 55
    .line 56
    const-string v0, "The connected service doesn\'t support sendCustomAction."

    .line 57
    .line 58
    invoke-static {p1, v0}, Ldefpackage/l93;->K(Ljava/lang/String;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    iget-object p0, p0, Ldefpackage/gj2;->d:Ldefpackage/cj2;

    .line 62
    .line 63
    new-instance p1, Ldefpackage/fj2;

    .line 64
    .line 65
    const/4 v0, 0x0

    .line 66
    invoke-direct {p1, v3, v2, p2, v0}, Ldefpackage/fj2;-><init>(Ldefpackage/si1;Ljava/lang/String;Landroid/os/Bundle;I)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 70
    .line 71
    .line 72
    return-object v1

    .line 73
    :cond_1
    new-instance v0, Ldefpackage/ej2;

    .line 74
    .line 75
    iget-object v4, p0, Ldefpackage/gj2;->d:Ldefpackage/cj2;

    .line 76
    .line 77
    invoke-direct {v0, v2, p2, v3, v4}, Ldefpackage/ej2;-><init>(Ljava/lang/String;Landroid/os/Bundle;Ldefpackage/si1;Landroid/os/Handler;)V

    .line 78
    .line 79
    .line 80
    :try_start_0
    iget-object v4, p0, Ldefpackage/gj2;->g:Landroid/os/Messenger;

    .line 81
    .line 82
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    new-instance v5, Landroid/os/Bundle;

    .line 86
    .line 87
    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 88
    .line 89
    .line 90
    const-string v6, "data_custom_action"

    .line 91
    .line 92
    invoke-virtual {v5, v6, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    const-string v6, "data_custom_action_extras"

    .line 96
    .line 97
    invoke-virtual {v5, v6, p2}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 98
    .line 99
    .line 100
    const-string v6, "data_result_receiver"

    .line 101
    .line 102
    sget-object v7, Ldefpackage/v14;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 103
    .line 104
    invoke-static {v0, v7}, Ldefpackage/uc5;->j(Landroid/os/Parcelable;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    invoke-virtual {v5, v6, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 109
    .line 110
    .line 111
    const/16 v0, 0x9

    .line 112
    .line 113
    invoke-virtual {p1, v0, v5, v4}, Ldefpackage/xc5;->w(ILandroid/os/Bundle;Landroid/os/Messenger;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 114
    .line 115
    .line 116
    return-object v1

    .line 117
    :catch_0
    move-exception p1

    .line 118
    const-string v0, "MediaBrowserCompat"

    .line 119
    .line 120
    new-instance v4, Ljava/lang/StringBuilder;

    .line 121
    .line 122
    const-string v5, "Remote error sending a custom action: action="

    .line 123
    .line 124
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    const-string v5, ", extras="

    .line 131
    .line 132
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v4

    .line 142
    sget-object v5, Ldefpackage/l93;->b:Ljava/lang/Object;

    .line 143
    .line 144
    monitor-enter v5

    .line 145
    :try_start_1
    invoke-static {v4, p1}, Ldefpackage/l93;->e(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    invoke-static {v0, p1}, Landroid/util/Ldefpackage/og;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 150
    .line 151
    .line 152
    monitor-exit v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 153
    iget-object p0, p0, Ldefpackage/gj2;->d:Ldefpackage/cj2;

    .line 154
    .line 155
    new-instance p1, Ldefpackage/fj2;

    .line 156
    .line 157
    const/4 v0, 0x1

    .line 158
    invoke-direct {p1, v3, v2, p2, v0}, Ldefpackage/fj2;-><init>(Ldefpackage/si1;Ljava/lang/String;Landroid/os/Bundle;I)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {p0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 162
    .line 163
    .line 164
    return-object v1

    .line 165
    :catchall_0
    move-exception p0

    .line 166
    :try_start_2
    monitor-exit v5
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 167
    throw p0

    .line 168
    :cond_2
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 169
    .line 170
    new-instance p1, Ljava/lang/StringBuilder;

    .line 171
    .line 172
    const-string v0, "Cannot send a custom action ("

    .line 173
    .line 174
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 178
    .line 179
    .line 180
    const-string v0, ") with extras "

    .line 181
    .line 182
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 183
    .line 184
    .line 185
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 186
    .line 187
    .line 188
    const-string p2, " because the browser is not connected to the service."

    .line 189
    .line 190
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 191
    .line 192
    .line 193
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object p1

    .line 197
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 198
    .line 199
    .line 200
    throw p0

    .line 201
    :cond_3
    const-string p0, "action cannot be empty"

    .line 202
    .line 203
    invoke-static {p0}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 204
    .line 205
    .line 206
    const/4 p0, 0x0

    .line 207
    return-object p0

    .line 208
    :cond_4
    new-instance p0, Ldefpackage/ab4;

    .line 209
    .line 210
    const/4 p1, -0x4

    .line 211
    invoke-direct {p0, p1}, Ldefpackage/ab4;-><init>(I)V

    .line 212
    .line 213
    .line 214
    new-instance p1, Ldefpackage/mw1;

    .line 215
    .line 216
    invoke-direct {p1, p0}, Ldefpackage/mw1;-><init>(Ljava/lang/Object;)V

    .line 217
    .line 218
    .line 219
    return-object p1
.end method

.method public final a()V
    .locals 3

    .line 1
    iget-object v0, p0, Ldefpackage/lj2;->s:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    check-cast v2, Ldefpackage/jj2;

    .line 22
    .line 23
    invoke-virtual {v2}, Ldefpackage/jj2;->a()V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 28
    .line 29
    .line 30
    invoke-super {p0}, Ldefpackage/im2;->a()V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public final a1()Ldefpackage/sk2;
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/lj2;->t:Ldefpackage/bj2;

    .line 2
    .line 3
    return-object p0
.end method
