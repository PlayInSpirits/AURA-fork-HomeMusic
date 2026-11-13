.class public final Ldefpackage/ui5;
.super Ldefpackage/ef5;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public f:Lcom/google/android/gms/common/internal/a;

.field public final g:I


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/internal/a;I)V
    .locals 2

    .line 1
    const-string v0, "com.google.android.gms.common.internal.IGmsCallbacks"

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    invoke-direct {p0, v1, v0}, Ldefpackage/ef5;-><init>(ILjava/lang/String;)V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Ldefpackage/ui5;->f:Lcom/google/android/gms/common/internal/a;

    .line 8
    .line 9
    iput p2, p0, Ldefpackage/ui5;->g:I

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final O0(ILandroid/os/Parcel;Landroid/os/Parcel;)Z
    .locals 8

    .line 1
    const/4 v0, -0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, 0x1

    .line 4
    if-eq p1, v2, :cond_7

    .line 5
    .line 6
    const/4 v3, 0x2

    .line 7
    if-eq p1, v3, :cond_6

    .line 8
    .line 9
    const/4 v3, 0x3

    .line 10
    if-eq p1, v3, :cond_0

    .line 11
    .line 12
    const/4 p0, 0x0

    .line 13
    return p0

    .line 14
    :cond_0
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    sget-object v4, Ldefpackage/jk5;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 23
    .line 24
    invoke-static {p2, v4}, Ldefpackage/zh5;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    check-cast v4, Ldefpackage/jk5;

    .line 29
    .line 30
    invoke-static {p2}, Ldefpackage/zh5;->b(Landroid/os/Parcel;)V

    .line 31
    .line 32
    .line 33
    iget-object p2, p0, Ldefpackage/ui5;->f:Lcom/google/android/gms/common/internal/a;

    .line 34
    .line 35
    const-string v5, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService"

    .line 36
    .line 37
    invoke-static {p2, v5}, Ldefpackage/ji2;->n(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-static {v4}, Ldefpackage/ji2;->m(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    iput-object v4, p2, Lcom/google/android/gms/common/internal/a;->H:Ldefpackage/jk5;

    .line 44
    .line 45
    invoke-virtual {p2}, Lcom/google/android/gms/common/internal/a;->i()Z

    .line 46
    .line 47
    .line 48
    move-result p2

    .line 49
    if-eqz p2, :cond_5

    .line 50
    .line 51
    iget-object p2, v4, Ldefpackage/jk5;->q:Ldefpackage/pa0;

    .line 52
    .line 53
    invoke-static {}, Ldefpackage/d34;->E()Ldefpackage/d34;

    .line 54
    .line 55
    .line 56
    move-result-object v5

    .line 57
    if-nez p2, :cond_1

    .line 58
    .line 59
    move-object p2, v1

    .line 60
    goto :goto_0

    .line 61
    :cond_1
    iget-object p2, p2, Ldefpackage/pa0;->n:Ldefpackage/e34;

    .line 62
    .line 63
    :goto_0
    monitor-enter v5

    .line 64
    if-nez p2, :cond_4

    .line 65
    .line 66
    :try_start_0
    sget-object p2, Ldefpackage/d34;->q:Ldefpackage/e34;

    .line 67
    .line 68
    :cond_2
    :goto_1
    iput-object p2, v5, Ldefpackage/d34;->o:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 69
    .line 70
    :cond_3
    monitor-exit v5

    .line 71
    goto :goto_3

    .line 72
    :catchall_0
    move-exception p0

    .line 73
    goto :goto_2

    .line 74
    :cond_4
    :try_start_1
    iget-object v6, v5, Ldefpackage/d34;->o:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v6, Ldefpackage/e34;

    .line 77
    .line 78
    if-eqz v6, :cond_2

    .line 79
    .line 80
    iget v6, v6, Ldefpackage/e34;->n:I

    .line 81
    .line 82
    iget v7, p2, Ldefpackage/e34;->n:I

    .line 83
    .line 84
    if-ge v6, v7, :cond_3

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :goto_2
    monitor-exit v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 88
    throw p0

    .line 89
    :cond_5
    :goto_3
    iget-object p2, v4, Ldefpackage/jk5;->n:Landroid/os/Bundle;

    .line 90
    .line 91
    iget-object v4, p0, Ldefpackage/ui5;->f:Lcom/google/android/gms/common/internal/a;

    .line 92
    .line 93
    const-string v5, "onPostInitComplete can be called only once per call to getRemoteService"

    .line 94
    .line 95
    invoke-static {v4, v5}, Ldefpackage/ji2;->n(Ljava/lang/Object;Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    iget-object v4, p0, Ldefpackage/ui5;->f:Lcom/google/android/gms/common/internal/a;

    .line 99
    .line 100
    iget v5, p0, Ldefpackage/ui5;->g:I

    .line 101
    .line 102
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    new-instance v6, Ldefpackage/xi5;

    .line 106
    .line 107
    invoke-direct {v6, v4, p1, v3, p2}, Ldefpackage/xi5;-><init>(Lcom/google/android/gms/common/internal/a;ILandroid/os/IBinder;Landroid/os/Bundle;)V

    .line 108
    .line 109
    .line 110
    iget-object p1, v4, Lcom/google/android/gms/common/internal/a;->r:Ldefpackage/qh5;

    .line 111
    .line 112
    invoke-virtual {p1, v2, v5, v0, v6}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    .line 113
    .line 114
    .line 115
    move-result-object p2

    .line 116
    invoke-virtual {p1, p2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 117
    .line 118
    .line 119
    iput-object v1, p0, Ldefpackage/ui5;->f:Lcom/google/android/gms/common/internal/a;

    .line 120
    .line 121
    goto :goto_4

    .line 122
    :cond_6
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 123
    .line 124
    .line 125
    sget-object p0, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 126
    .line 127
    invoke-static {p2, p0}, Ldefpackage/zh5;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 128
    .line 129
    .line 130
    move-result-object p0

    .line 131
    check-cast p0, Landroid/os/Bundle;

    .line 132
    .line 133
    invoke-static {p2}, Ldefpackage/zh5;->b(Landroid/os/Parcel;)V

    .line 134
    .line 135
    .line 136
    new-instance p0, Ljava/lang/Exception;

    .line 137
    .line 138
    invoke-direct {p0}, Ljava/lang/Exception;-><init>()V

    .line 139
    .line 140
    .line 141
    const-string p1, "GmsClient"

    .line 142
    .line 143
    const-string p2, "received deprecated onAccountValidationComplete callback, ignoring"

    .line 144
    .line 145
    invoke-static {p1, p2, p0}, Landroid/util/Ldefpackage/og;->wtf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 146
    .line 147
    .line 148
    goto :goto_4

    .line 149
    :cond_7
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 150
    .line 151
    .line 152
    move-result p1

    .line 153
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 154
    .line 155
    .line 156
    move-result-object v3

    .line 157
    sget-object v4, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 158
    .line 159
    invoke-static {p2, v4}, Ldefpackage/zh5;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 160
    .line 161
    .line 162
    move-result-object v4

    .line 163
    check-cast v4, Landroid/os/Bundle;

    .line 164
    .line 165
    invoke-static {p2}, Ldefpackage/zh5;->b(Landroid/os/Parcel;)V

    .line 166
    .line 167
    .line 168
    iget-object p2, p0, Ldefpackage/ui5;->f:Lcom/google/android/gms/common/internal/a;

    .line 169
    .line 170
    const-string v5, "onPostInitComplete can be called only once per call to getRemoteService"

    .line 171
    .line 172
    invoke-static {p2, v5}, Ldefpackage/ji2;->n(Ljava/lang/Object;Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    iget-object p2, p0, Ldefpackage/ui5;->f:Lcom/google/android/gms/common/internal/a;

    .line 176
    .line 177
    iget v5, p0, Ldefpackage/ui5;->g:I

    .line 178
    .line 179
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 180
    .line 181
    .line 182
    new-instance v6, Ldefpackage/xi5;

    .line 183
    .line 184
    invoke-direct {v6, p2, p1, v3, v4}, Ldefpackage/xi5;-><init>(Lcom/google/android/gms/common/internal/a;ILandroid/os/IBinder;Landroid/os/Bundle;)V

    .line 185
    .line 186
    .line 187
    iget-object p1, p2, Lcom/google/android/gms/common/internal/a;->r:Ldefpackage/qh5;

    .line 188
    .line 189
    invoke-virtual {p1, v2, v5, v0, v6}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    .line 190
    .line 191
    .line 192
    move-result-object p2

    .line 193
    invoke-virtual {p1, p2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 194
    .line 195
    .line 196
    iput-object v1, p0, Ldefpackage/ui5;->f:Lcom/google/android/gms/common/internal/a;

    .line 197
    .line 198
    :goto_4
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 199
    .line 200
    .line 201
    return v2
.end method
