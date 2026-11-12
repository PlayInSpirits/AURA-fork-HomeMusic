.class public Landroidx/profileinstaller/ProfileInstallReceiver;
.super Landroid/content/BroadcastReceiver;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 6

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    goto/16 :goto_1

    .line 4
    .line 5
    :cond_0
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "androidx.profileinstaller.action.INSTALL_PROFILE"

    .line 10
    .line 11
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    const/16 v2, 0x14

    .line 16
    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    new-instance p2, Ldi;

    .line 20
    .line 21
    const/4 v0, 0x3

    .line 22
    invoke-direct {p2, v0}, Ldi;-><init>(I)V

    .line 23
    .line 24
    .line 25
    new-instance v0, Lom1;

    .line 26
    .line 27
    invoke-direct {v0, v2, p0}, Lom1;-><init>(ILjava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    const/4 p0, 0x1

    .line 31
    invoke-static {p1, p2, v0, p0}, Ltq3;->b(Landroid/content/Context;Ljava/util/concurrent/Executor;Lsq3;Z)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :cond_1
    const-string v1, "androidx.profileinstaller.action.SKIP_FILE"

    .line 36
    .line 37
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    const-string v3, "ProfileInstaller"

    .line 42
    .line 43
    const/16 v4, 0xa

    .line 44
    .line 45
    const/4 v5, 0x0

    .line 46
    if-eqz v1, :cond_3

    .line 47
    .line 48
    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 49
    .line 50
    .line 51
    move-result-object p2

    .line 52
    if-eqz p2, :cond_8

    .line 53
    .line 54
    const-string v0, "EXTRA_SKIP_FILE_OPERATION"

    .line 55
    .line 56
    invoke-virtual {p2, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p2

    .line 60
    const-string v0, "WRITE_SKIP_FILE"

    .line 61
    .line 62
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-eqz v0, :cond_2

    .line 67
    .line 68
    new-instance p2, Lom1;

    .line 69
    .line 70
    invoke-direct {p2, v2, p0}, Lom1;-><init>(ILjava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    const/4 v1, 0x0

    .line 86
    :try_start_0
    invoke-virtual {v0, p0, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 87
    .line 88
    .line 89
    move-result-object p0
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 90
    invoke-virtual {p1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    invoke-static {p0, p1}, Ltq3;->a(Landroid/content/pm/PackageInfo;Ljava/io/File;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {p2, v4, v5}, Lom1;->e(ILjava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    goto/16 :goto_1

    .line 101
    .line 102
    :catch_0
    move-exception p0

    .line 103
    const/4 p1, 0x7

    .line 104
    invoke-virtual {p2, p1, p0}, Lom1;->e(ILjava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    goto/16 :goto_1

    .line 108
    .line 109
    :cond_2
    const-string v0, "DELETE_SKIP_FILE"

    .line 110
    .line 111
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result p2

    .line 115
    if-eqz p2, :cond_8

    .line 116
    .line 117
    invoke-virtual {p1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    new-instance p2, Ljava/io/File;

    .line 122
    .line 123
    const-string v0, "profileinstaller_profileWrittenFor_lastUpdateTime.dat"

    .line 124
    .line 125
    invoke-direct {p2, p1, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {p2}, Ljava/io/File;->delete()Z

    .line 129
    .line 130
    .line 131
    const-string p1, "RESULT_DELETE_SKIP_FILE_SUCCESS"

    .line 132
    .line 133
    invoke-static {v3, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 134
    .line 135
    .line 136
    const/16 p1, 0xb

    .line 137
    .line 138
    invoke-virtual {p0, p1}, Landroid/content/BroadcastReceiver;->setResultCode(I)V

    .line 139
    .line 140
    .line 141
    return-void

    .line 142
    :cond_3
    const-string v1, "androidx.profileinstaller.action.SAVE_PROFILE"

    .line 143
    .line 144
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    move-result v1

    .line 148
    if-eqz v1, :cond_4

    .line 149
    .line 150
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 151
    .line 152
    .line 153
    move-result p1

    .line 154
    invoke-static {p1, v4}, Landroid/os/Process;->sendSignal(II)V

    .line 155
    .line 156
    .line 157
    const-string p1, ""

    .line 158
    .line 159
    invoke-static {v3, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 160
    .line 161
    .line 162
    const/16 p1, 0xc

    .line 163
    .line 164
    invoke-virtual {p0, p1}, Landroid/content/BroadcastReceiver;->setResultCode(I)V

    .line 165
    .line 166
    .line 167
    return-void

    .line 168
    :cond_4
    const-string v1, "androidx.profileinstaller.action.BENCHMARK_OPERATION"

    .line 169
    .line 170
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    move-result v0

    .line 174
    if-eqz v0, :cond_8

    .line 175
    .line 176
    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 177
    .line 178
    .line 179
    move-result-object p2

    .line 180
    if-eqz p2, :cond_8

    .line 181
    .line 182
    const-string v0, "EXTRA_BENCHMARK_OPERATION"

    .line 183
    .line 184
    invoke-virtual {p2, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object p2

    .line 188
    new-instance v0, Lom1;

    .line 189
    .line 190
    invoke-direct {v0, v2, p0}, Lom1;-><init>(ILjava/lang/Object;)V

    .line 191
    .line 192
    .line 193
    const-string p0, "DROP_SHADER_CACHE"

    .line 194
    .line 195
    invoke-virtual {p0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 196
    .line 197
    .line 198
    move-result p0

    .line 199
    if-eqz p0, :cond_7

    .line 200
    .line 201
    sget p0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 202
    .line 203
    const/16 p2, 0x22

    .line 204
    .line 205
    if-lt p0, p2, :cond_5

    .line 206
    .line 207
    invoke-virtual {p1}, Landroid/content/Context;->createDeviceProtectedStorageContext()Landroid/content/Context;

    .line 208
    .line 209
    .line 210
    move-result-object p0

    .line 211
    invoke-virtual {p0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 212
    .line 213
    .line 214
    move-result-object p0

    .line 215
    goto :goto_0

    .line 216
    :cond_5
    invoke-virtual {p1}, Landroid/content/Context;->createDeviceProtectedStorageContext()Landroid/content/Context;

    .line 217
    .line 218
    .line 219
    move-result-object p0

    .line 220
    invoke-virtual {p0}, Landroid/content/Context;->getCodeCacheDir()Ljava/io/File;

    .line 221
    .line 222
    .line 223
    move-result-object p0

    .line 224
    :goto_0
    invoke-static {p0}, Lq05;->i(Ljava/io/File;)Z

    .line 225
    .line 226
    .line 227
    move-result p0

    .line 228
    if-eqz p0, :cond_6

    .line 229
    .line 230
    const/16 p0, 0xe

    .line 231
    .line 232
    invoke-virtual {v0, p0, v5}, Lom1;->e(ILjava/lang/Object;)V

    .line 233
    .line 234
    .line 235
    return-void

    .line 236
    :cond_6
    const/16 p0, 0xf

    .line 237
    .line 238
    invoke-virtual {v0, p0, v5}, Lom1;->e(ILjava/lang/Object;)V

    .line 239
    .line 240
    .line 241
    return-void

    .line 242
    :cond_7
    const/16 p0, 0x10

    .line 243
    .line 244
    invoke-virtual {v0, p0, v5}, Lom1;->e(ILjava/lang/Object;)V

    .line 245
    .line 246
    .line 247
    :cond_8
    :goto_1
    return-void
.end method
