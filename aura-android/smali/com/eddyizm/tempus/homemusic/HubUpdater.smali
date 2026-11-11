.class public final Lcom/eddyizm/tempus/homemusic/HubUpdater;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final $stable:I

.field public static final INSTANCE:Lcom/eddyizm/tempus/homemusic/HubUpdater;

.field private static final KEY_SKIPPED:Ljava/lang/String; = "skipped_version"

.field private static final PREFS:Ljava/lang/String; = "homemusic_updater"

.field private static final TAG:Ljava/lang/String; = "HubUpdater"

.field private static autoCheckFor:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/app/Activity;",
            ">;"
        }
    .end annotation
.end field

.field private static final downloading:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private static final updateHttp$delegate:Lr72;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/eddyizm/tempus/homemusic/HubUpdater;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/eddyizm/tempus/homemusic/HubUpdater;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/eddyizm/tempus/homemusic/HubUpdater;->INSTANCE:Lcom/eddyizm/tempus/homemusic/HubUpdater;

    .line 7
    .line 8
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lcom/eddyizm/tempus/homemusic/HubUpdater;->downloading:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 15
    .line 16
    new-instance v0, Le90;

    .line 17
    .line 18
    const/16 v1, 0x13

    .line 19
    .line 20
    invoke-direct {v0, v1}, Le90;-><init>(I)V

    .line 21
    .line 22
    .line 23
    new-instance v1, Lrp4;

    .line 24
    .line 25
    invoke-direct {v1, v0}, Lrp4;-><init>(Lgf1;)V

    .line 26
    .line 27
    .line 28
    sput-object v1, Lcom/eddyizm/tempus/homemusic/HubUpdater;->updateHttp$delegate:Lr72;

    .line 29
    .line 30
    const/16 v0, 0x8

    .line 31
    .line 32
    sput v0, Lcom/eddyizm/tempus/homemusic/HubUpdater;->$stable:I

    .line 33
    .line 34
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic a(JLcom/google/android/material/progressindicator/LinearProgressIndicator;Landroid/widget/TextView;JLcom/eddyizm/tempus/homemusic/HubUpdater;Landroid/app/Activity;)V
    .locals 0

    .line 1
    invoke-static/range {p0 .. p7}, Lcom/eddyizm/tempus/homemusic/HubUpdater;->download$lambda$0$0$0$0(JLcom/google/android/material/progressindicator/LinearProgressIndicator;Landroid/widget/TextView;JLcom/eddyizm/tempus/homemusic/HubUpdater;Landroid/app/Activity;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic b(JLcom/google/android/material/progressindicator/LinearProgressIndicator;Landroid/widget/TextView;JLcom/eddyizm/tempus/homemusic/HubUpdater;Landroid/app/Activity;)Lj15;
    .locals 2

    .line 1
    move-wide v0, p0

    .line 2
    move-object p0, p2

    .line 3
    move-object p1, p3

    .line 4
    move-object p2, p6

    .line 5
    move-object p3, p7

    .line 6
    move-wide p6, p4

    .line 7
    move-wide p4, v0

    .line 8
    invoke-static/range {p0 .. p7}, Lcom/eddyizm/tempus/homemusic/HubUpdater;->download$lambda$0$0$0(Lcom/google/android/material/progressindicator/LinearProgressIndicator;Landroid/widget/TextView;Lcom/eddyizm/tempus/homemusic/HubUpdater;Landroid/app/Activity;JJ)Lj15;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method

.method public static synthetic c(Landroid/app/Activity;Lcom/eddyizm/tempus/homemusic/HubAppRelease;Lcom/eddyizm/tempus/homemusic/HubUpdatePatch;Landroid/content/DialogInterface;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Lcom/eddyizm/tempus/homemusic/HubUpdater;->offer$lambda$2(Landroid/app/Activity;Lcom/eddyizm/tempus/homemusic/HubAppRelease;Lcom/eddyizm/tempus/homemusic/HubUpdatePatch;Landroid/content/DialogInterface;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final check(Landroid/app/Activity;Z)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    const v0, 0x7f13024a

    .line 7
    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-static {p0, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 15
    .line 16
    .line 17
    :cond_0
    sget-object v0, Lio1;->a:Ljava/util/concurrent/ExecutorService;

    .line 18
    .line 19
    new-instance v1, Lpm;

    .line 20
    .line 21
    const/4 v2, 0x2

    .line 22
    invoke-direct {v1, p0, p1, v2}, Lpm;-><init>(Ljava/lang/Object;ZI)V

    .line 23
    .line 24
    .line 25
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method private static final check$lambda$0(Landroid/app/Activity;Z)V
    .locals 9

    .line 1
    :try_start_0
    invoke-static {}, Lrr1;->n()Lcom/eddyizm/tempus/homemusic/HubAppRelease;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Ljava/io/File;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    iget-object v2, v2, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    .line 12
    .line 13
    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    if-eqz v0, :cond_4

    .line 18
    .line 19
    invoke-virtual {v0}, Lcom/eddyizm/tempus/homemusic/HubAppRelease;->getVersionCode()J

    .line 20
    .line 21
    .line 22
    move-result-wide v3

    .line 23
    const-wide/16 v5, 0x2b

    .line 24
    .line 25
    cmp-long v3, v3, v5

    .line 26
    .line 27
    if-lez v3, :cond_4

    .line 28
    .line 29
    invoke-virtual {v0}, Lcom/eddyizm/tempus/homemusic/HubAppRelease;->getPatches()Ljava/util/List;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    if-nez v3, :cond_0

    .line 34
    .line 35
    sget-object v3, Lu01;->n:Lu01;

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :catchall_0
    move-exception v0

    .line 39
    goto :goto_4

    .line 40
    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    if-eqz v4, :cond_1

    .line 45
    .line 46
    goto :goto_3

    .line 47
    :cond_1
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    :cond_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 52
    .line 53
    .line 54
    move-result v4

    .line 55
    if-eqz v4, :cond_4

    .line 56
    .line 57
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    check-cast v4, Lcom/eddyizm/tempus/homemusic/HubUpdatePatch;

    .line 62
    .line 63
    invoke-virtual {v4}, Lcom/eddyizm/tempus/homemusic/HubUpdatePatch;->getBaseVersionCode()J

    .line 64
    .line 65
    .line 66
    move-result-wide v7

    .line 67
    cmp-long v7, v7, v5

    .line 68
    .line 69
    if-nez v7, :cond_2

    .line 70
    .line 71
    invoke-virtual {v4}, Lcom/eddyizm/tempus/homemusic/HubUpdatePatch;->getFormat()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    const-string v7, "bsdiff40-v1"

    .line 76
    .line 77
    invoke-static {v4, v7}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v4

    .line 81
    if-eqz v4, :cond_2

    .line 82
    .line 83
    invoke-virtual {v1}, Ljava/io/File;->length()J

    .line 84
    .line 85
    .line 86
    move-result-wide v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 87
    const-wide/16 v5, 0x1

    .line 88
    .line 89
    cmp-long v5, v5, v3

    .line 90
    .line 91
    if-gtz v5, :cond_4

    .line 92
    .line 93
    const-wide/32 v5, 0x2000001

    .line 94
    .line 95
    .line 96
    cmp-long v3, v3, v5

    .line 97
    .line 98
    if-gez v3, :cond_4

    .line 99
    .line 100
    :try_start_1
    invoke-static {v1}, Ld25;->d(Ljava/io/File;)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    invoke-static {v0, v1}, Ld25;->c(Lcom/eddyizm/tempus/homemusic/HubAppRelease;Ljava/lang/String;)Lcom/eddyizm/tempus/homemusic/HubUpdatePatch;

    .line 105
    .line 106
    .line 107
    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 108
    goto :goto_1

    .line 109
    :catchall_1
    move-exception v1

    .line 110
    :try_start_2
    new-instance v3, Ls14;

    .line 111
    .line 112
    invoke-direct {v3, v1}, Ls14;-><init>(Ljava/lang/Throwable;)V

    .line 113
    .line 114
    .line 115
    move-object v1, v3

    .line 116
    :goto_1
    nop

    .line 117
    instance-of v3, v1, Ls14;

    .line 118
    .line 119
    if-eqz v3, :cond_3

    .line 120
    .line 121
    goto :goto_2

    .line 122
    :cond_3
    move-object v2, v1

    .line 123
    :goto_2
    check-cast v2, Lcom/eddyizm/tempus/homemusic/HubUpdatePatch;

    .line 124
    .line 125
    :cond_4
    :goto_3
    new-instance v1, Lkd3;

    .line 126
    .line 127
    invoke-direct {v1, v0, v2}, Lkd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 128
    .line 129
    .line 130
    goto :goto_5

    .line 131
    :goto_4
    new-instance v1, Ls14;

    .line 132
    .line 133
    invoke-direct {v1, v0}, Ls14;-><init>(Ljava/lang/Throwable;)V

    .line 134
    .line 135
    .line 136
    :goto_5
    sget-object v0, Lio1;->b:Landroid/os/Handler;

    .line 137
    .line 138
    new-instance v2, Lbs1;

    .line 139
    .line 140
    const/4 v3, 0x3

    .line 141
    invoke-direct {v2, p0, p1, v1, v3}, Lbs1;-><init>(Ljava/lang/Object;ZLjava/lang/Object;I)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 145
    .line 146
    .line 147
    return-void
.end method

.method private static final check$lambda$0$1(Landroid/app/Activity;ZLjava/lang/Object;)V
    .locals 8

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_7

    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/app/Activity;->isDestroyed()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    goto/16 :goto_1

    .line 15
    .line 16
    :cond_0
    invoke-static {p2}, Lbb3;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const/4 v2, 0x1

    .line 21
    if-eqz v0, :cond_2

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    new-instance v4, Ljava/lang/StringBuilder;

    .line 28
    .line 29
    const-string v5, "Update check failed: "

    .line 30
    .line 31
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    const-string v4, "HubUpdater"

    .line 42
    .line 43
    invoke-static {v4, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 44
    .line 45
    .line 46
    if-eqz p1, :cond_2

    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    if-nez v0, :cond_1

    .line 53
    .line 54
    const-string v0, ""

    .line 55
    .line 56
    :cond_1
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    const v3, 0x7f13024c

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0, v3, v0}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-static {p0, v0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 72
    .line 73
    .line 74
    :cond_2
    instance-of v0, p2, Ls14;

    .line 75
    .line 76
    const/4 v3, 0x0

    .line 77
    if-nez v0, :cond_6

    .line 78
    .line 79
    check-cast p2, Lkd3;

    .line 80
    .line 81
    iget-object v0, p2, Lkd3;->n:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v0, Lcom/eddyizm/tempus/homemusic/HubAppRelease;

    .line 84
    .line 85
    iget-object p2, p2, Lkd3;->o:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast p2, Lcom/eddyizm/tempus/homemusic/HubUpdatePatch;

    .line 88
    .line 89
    if-eqz v0, :cond_4

    .line 90
    .line 91
    invoke-virtual {v0}, Lcom/eddyizm/tempus/homemusic/HubAppRelease;->getVersionCode()J

    .line 92
    .line 93
    .line 94
    move-result-wide v4

    .line 95
    const-wide/16 v6, 0x2b

    .line 96
    .line 97
    cmp-long v4, v4, v6

    .line 98
    .line 99
    if-lez v4, :cond_4

    .line 100
    .line 101
    if-nez p1, :cond_3

    .line 102
    .line 103
    sget-object v4, Lcom/eddyizm/tempus/homemusic/HubUpdater;->INSTANCE:Lcom/eddyizm/tempus/homemusic/HubUpdater;

    .line 104
    .line 105
    invoke-direct {v4, p0}, Lcom/eddyizm/tempus/homemusic/HubUpdater;->prefs(Landroid/content/Context;)Landroid/content/SharedPreferences;

    .line 106
    .line 107
    .line 108
    move-result-object v4

    .line 109
    const-string v5, "skipped_version"

    .line 110
    .line 111
    const-wide/16 v6, -0x1

    .line 112
    .line 113
    invoke-interface {v4, v5, v6, v7}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 114
    .line 115
    .line 116
    move-result-wide v4

    .line 117
    invoke-virtual {v0}, Lcom/eddyizm/tempus/homemusic/HubAppRelease;->getVersionCode()J

    .line 118
    .line 119
    .line 120
    move-result-wide v6

    .line 121
    cmp-long v4, v4, v6

    .line 122
    .line 123
    if-eqz v4, :cond_5

    .line 124
    .line 125
    :cond_3
    sget-object v3, Lcom/eddyizm/tempus/homemusic/HubUpdater;->INSTANCE:Lcom/eddyizm/tempus/homemusic/HubUpdater;

    .line 126
    .line 127
    invoke-direct {v3, p0, v0, p2, p1}, Lcom/eddyizm/tempus/homemusic/HubUpdater;->offer(Landroid/app/Activity;Lcom/eddyizm/tempus/homemusic/HubAppRelease;Lcom/eddyizm/tempus/homemusic/HubUpdatePatch;Z)V

    .line 128
    .line 129
    .line 130
    goto :goto_0

    .line 131
    :cond_4
    if-eqz p1, :cond_5

    .line 132
    .line 133
    const-string p2, "1.14.7"

    .line 134
    .line 135
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object p2

    .line 139
    const v0, 0x7f130252

    .line 140
    .line 141
    .line 142
    invoke-virtual {p0, v0, p2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object p2

    .line 146
    invoke-static {p0, p2, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 147
    .line 148
    .line 149
    move-result-object p0

    .line 150
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 151
    .line 152
    .line 153
    :cond_5
    move v2, v3

    .line 154
    :goto_0
    move v3, v2

    .line 155
    :cond_6
    if-nez p1, :cond_8

    .line 156
    .line 157
    if-nez v3, :cond_8

    .line 158
    .line 159
    sput-object v1, Lcom/eddyizm/tempus/homemusic/HubUpdater;->autoCheckFor:Ljava/lang/ref/WeakReference;

    .line 160
    .line 161
    return-void

    .line 162
    :cond_7
    :goto_1
    if-nez p1, :cond_8

    .line 163
    .line 164
    sput-object v1, Lcom/eddyizm/tempus/homemusic/HubUpdater;->autoCheckFor:Ljava/lang/ref/WeakReference;

    .line 165
    .line 166
    :cond_8
    return-void
.end method

.method public static final checkOnStart(Landroid/app/Activity;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lcom/eddyizm/tempus/homemusic/HubUpdater;->autoCheckFor:Ljava/lang/ref/WeakReference;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Landroid/app/Activity;

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    :goto_0
    if-eqz v0, :cond_1

    .line 17
    .line 18
    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-nez v1, :cond_1

    .line 23
    .line 24
    invoke-virtual {v0}, Landroid/app/Activity;->isDestroyed()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-nez v0, :cond_1

    .line 29
    .line 30
    return-void

    .line 31
    :cond_1
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 32
    .line 33
    invoke-direct {v0, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    sput-object v0, Lcom/eddyizm/tempus/homemusic/HubUpdater;->autoCheckFor:Ljava/lang/ref/WeakReference;

    .line 37
    .line 38
    const/4 v0, 0x0

    .line 39
    invoke-static {p0, v0}, Lcom/eddyizm/tempus/homemusic/HubUpdater;->check(Landroid/app/Activity;Z)V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public static synthetic d(Landroid/app/Activity;Lcom/eddyizm/tempus/homemusic/HubAppRelease;Landroid/content/DialogInterface;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/eddyizm/tempus/homemusic/HubUpdater;->download$lambda$0$1$1$0(Landroid/app/Activity;Lcom/eddyizm/tempus/homemusic/HubAppRelease;Landroid/content/DialogInterface;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final download(Landroid/app/Activity;Lcom/eddyizm/tempus/homemusic/HubAppRelease;Lcom/eddyizm/tempus/homemusic/HubUpdatePatch;)V
    .locals 10

    .line 1
    const-string p0, "package:"

    .line 2
    .line 3
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 4
    .line 5
    const/16 v1, 0x1a

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-lt v0, v1, :cond_0

    .line 9
    .line 10
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-static {v0}, Lgm0;->w(Landroid/content/pm/PackageManager;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    const p2, 0x7f130249

    .line 21
    .line 22
    .line 23
    invoke-static {p1, p2, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    invoke-virtual {p2}, Landroid/widget/Toast;->show()V

    .line 28
    .line 29
    .line 30
    :try_start_0
    new-instance p2, Landroid/content/Intent;

    .line 31
    .line 32
    const-string p3, "android.settings.MANAGE_UNKNOWN_APP_SOURCES"

    .line 33
    .line 34
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    new-instance v1, Ljava/lang/StringBuilder;

    .line 39
    .line 40
    invoke-direct {v1, p0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    invoke-static {p0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-direct {p2, p3, p0}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1, p2}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :catch_0
    move-exception v0

    .line 62
    move-object p0, v0

    .line 63
    const-string p1, "HubUpdater"

    .line 64
    .line 65
    const-string p2, "No unknown-sources settings screen"

    .line 66
    .line 67
    invoke-static {p1, p2, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 68
    .line 69
    .line 70
    return-void

    .line 71
    :cond_0
    sget-object p0, Lcom/eddyizm/tempus/homemusic/HubUpdater;->downloading:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 72
    .line 73
    const/4 v0, 0x0

    .line 74
    invoke-virtual {p0, v0, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 75
    .line 76
    .line 77
    move-result p0

    .line 78
    if-nez p0, :cond_1

    .line 79
    .line 80
    return-void

    .line 81
    :cond_1
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    const v1, 0x7f0d0045

    .line 86
    .line 87
    .line 88
    const/4 v2, 0x0

    .line 89
    invoke-virtual {p0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    const v1, 0x7f0a02f9

    .line 94
    .line 95
    .line 96
    invoke-virtual {p0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    move-object v6, v1

    .line 101
    check-cast v6, Lcom/google/android/material/progressindicator/LinearProgressIndicator;

    .line 102
    .line 103
    const v1, 0x7f0a02fa

    .line 104
    .line 105
    .line 106
    invoke-virtual {p0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    move-object v7, v1

    .line 111
    check-cast v7, Landroid/widget/TextView;

    .line 112
    .line 113
    new-instance v1, Lvg2;

    .line 114
    .line 115
    invoke-direct {v1, p1, v0}, Lvg2;-><init>(Landroid/content/Context;I)V

    .line 116
    .line 117
    .line 118
    const v2, 0x7f13024b

    .line 119
    .line 120
    .line 121
    invoke-virtual {v1, v2}, Lvg2;->p(I)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v1, p0}, Lvg2;->q(Landroid/view/View;)Lvg2;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    iget-object v1, p0, Le9;->a:La9;

    .line 129
    .line 130
    iput-boolean v0, v1, La9;->m:Z

    .line 131
    .line 132
    invoke-virtual {p0}, Le9;->h()Lf9;

    .line 133
    .line 134
    .line 135
    move-result-object v8

    .line 136
    sget-object p0, Lio1;->a:Ljava/util/concurrent/ExecutorService;

    .line 137
    .line 138
    new-instance v2, Lup;

    .line 139
    .line 140
    const/4 v9, 0x5

    .line 141
    move-object v3, p1

    .line 142
    move-object v4, p2

    .line 143
    move-object v5, p3

    .line 144
    invoke-direct/range {v2 .. v9}, Lup;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 145
    .line 146
    .line 147
    invoke-interface {p0, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 148
    .line 149
    .line 150
    return-void
.end method

.method private static final download$lambda$0(Landroid/app/Activity;Lcom/eddyizm/tempus/homemusic/HubAppRelease;Lcom/eddyizm/tempus/homemusic/HubUpdatePatch;Lcom/google/android/material/progressindicator/LinearProgressIndicator;Landroid/widget/TextView;Lf9;)V
    .locals 10

    .line 1
    const-string v1, "Patch failed, downloading the full APK: "

    .line 2
    .line 3
    sget-object v2, Lcom/eddyizm/tempus/homemusic/HubUpdater;->INSTANCE:Lcom/eddyizm/tempus/homemusic/HubUpdater;

    .line 4
    .line 5
    const/4 v3, 0x0

    .line 6
    :try_start_0
    new-instance v6, Lrt1;

    .line 7
    .line 8
    invoke-direct {v6, p3, p4, v2, p0}, Lrt1;-><init>(Lcom/google/android/material/progressindicator/LinearProgressIndicator;Landroid/widget/TextView;Lcom/eddyizm/tempus/homemusic/HubUpdater;Landroid/app/Activity;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    .line 10
    .line 11
    :try_start_1
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-direct {v2, v0, p1, p2, v6}, Lcom/eddyizm/tempus/homemusic/HubUpdater;->fetchApk(Landroid/content/Context;Lcom/eddyizm/tempus/homemusic/HubAppRelease;Lcom/eddyizm/tempus/homemusic/HubUpdatePatch;Lwf1;)Ljava/io/File;

    .line 19
    .line 20
    .line 21
    move-result-object v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 22
    goto :goto_3

    .line 23
    :catchall_0
    move-exception v0

    .line 24
    goto :goto_2

    .line 25
    :catch_0
    move-exception v0

    .line 26
    :try_start_2
    sget-object v7, Ld25;->a:Lux3;

    .line 27
    .line 28
    if-eqz p2, :cond_0

    .line 29
    .line 30
    const/4 v7, 0x1

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    move v7, v3

    .line 33
    :goto_0
    invoke-static {}, Ljp1;->b()Z

    .line 34
    .line 35
    .line 36
    move-result v8
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 37
    sget-object v9, Lc25;->o:Lc25;

    .line 38
    .line 39
    if-nez v7, :cond_1

    .line 40
    .line 41
    :try_start_3
    sget-object v7, Lc25;->n:Lc25;

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    if-eqz v8, :cond_2

    .line 45
    .line 46
    sget-object v7, Lc25;->p:Lc25;

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_2
    move-object v7, v9

    .line 50
    :goto_1
    if-ne v7, v9, :cond_3

    .line 51
    .line 52
    const-string v7, "HubUpdater"

    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    new-instance v8, Ljava/lang/StringBuilder;

    .line 59
    .line 60
    invoke-direct {v8, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-static {v7, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    const/4 v1, 0x0

    .line 81
    invoke-direct {v2, v0, p1, v1, v6}, Lcom/eddyizm/tempus/homemusic/HubUpdater;->fetchApk(Landroid/content/Context;Lcom/eddyizm/tempus/homemusic/HubAppRelease;Lcom/eddyizm/tempus/homemusic/HubUpdatePatch;Lwf1;)Ljava/io/File;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    goto :goto_3

    .line 86
    :cond_3
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 87
    :goto_2
    new-instance v1, Ls14;

    .line 88
    .line 89
    invoke-direct {v1, v0}, Ls14;-><init>(Ljava/lang/Throwable;)V

    .line 90
    .line 91
    .line 92
    move-object v0, v1

    .line 93
    :goto_3
    sget-object v1, Lcom/eddyizm/tempus/homemusic/HubUpdater;->downloading:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 94
    .line 95
    invoke-virtual {v1, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 96
    .line 97
    .line 98
    sget-object v7, Lio1;->b:Landroid/os/Handler;

    .line 99
    .line 100
    move-object v3, v0

    .line 101
    new-instance v0, Lmr;

    .line 102
    .line 103
    const/4 v6, 0x4

    .line 104
    move-object v2, p0

    .line 105
    move-object v5, p1

    .line 106
    move-object v4, p2

    .line 107
    move-object v1, p5

    .line 108
    invoke-direct/range {v0 .. v6}, Lmr;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v7, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 112
    .line 113
    .line 114
    return-void
.end method

.method private static final download$lambda$0$0$0(Lcom/google/android/material/progressindicator/LinearProgressIndicator;Landroid/widget/TextView;Lcom/eddyizm/tempus/homemusic/HubUpdater;Landroid/app/Activity;JJ)Lj15;
    .locals 10

    .line 1
    sget-object v0, Lio1;->b:Landroid/os/Handler;

    .line 2
    .line 3
    new-instance v1, Lpt1;

    .line 4
    .line 5
    move-object v4, p0

    .line 6
    move-object v5, p1

    .line 7
    move-object v8, p2

    .line 8
    move-object v9, p3

    .line 9
    move-wide v2, p4

    .line 10
    move-wide/from16 v6, p6

    .line 11
    .line 12
    invoke-direct/range {v1 .. v9}, Lpt1;-><init>(JLcom/google/android/material/progressindicator/LinearProgressIndicator;Landroid/widget/TextView;JLcom/eddyizm/tempus/homemusic/HubUpdater;Landroid/app/Activity;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 16
    .line 17
    .line 18
    sget-object p0, Lj15;->a:Lj15;

    .line 19
    .line 20
    return-object p0
.end method

.method private static final download$lambda$0$0$0$0(JLcom/google/android/material/progressindicator/LinearProgressIndicator;Landroid/widget/TextView;JLcom/eddyizm/tempus/homemusic/HubUpdater;Landroid/app/Activity;)V
    .locals 4

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v2, p0, v0

    .line 4
    .line 5
    const/4 v3, 0x1

    .line 6
    if-gez v2, :cond_0

    .line 7
    .line 8
    invoke-virtual {p2, v3}, Liq;->setIndeterminate(Z)V

    .line 9
    .line 10
    .line 11
    const p0, 0x7f130255

    .line 12
    .line 13
    .line 14
    invoke-virtual {p3, p0}, Landroid/widget/TextView;->setText(I)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    cmp-long v0, p4, v0

    .line 19
    .line 20
    if-lez v0, :cond_1

    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    invoke-virtual {p2, v0}, Liq;->setIndeterminate(Z)V

    .line 24
    .line 25
    .line 26
    const-wide/16 v0, 0x64

    .line 27
    .line 28
    mul-long/2addr v0, p0

    .line 29
    div-long/2addr v0, p4

    .line 30
    long-to-int v0, v0

    .line 31
    invoke-virtual {p2, v0, v3}, Lcom/google/android/material/progressindicator/LinearProgressIndicator;->b(IZ)V

    .line 32
    .line 33
    .line 34
    invoke-direct {p6, p7, p0, p1}, Lcom/eddyizm/tempus/homemusic/HubUpdater;->updateSize(Landroid/content/Context;J)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-direct {p6, p7, p4, p5}, Lcom/eddyizm/tempus/homemusic/HubUpdater;->updateSize(Landroid/content/Context;J)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    new-instance p2, Ljava/lang/StringBuilder;

    .line 43
    .line 44
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    const-string p0, " \u0438\u0437 "

    .line 51
    .line 52
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    invoke-virtual {p3, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :cond_1
    invoke-direct {p6, p7, p0, p1}, Lcom/eddyizm/tempus/homemusic/HubUpdater;->updateSize(Landroid/content/Context;J)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    invoke-virtual {p3, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 71
    .line 72
    .line 73
    return-void
.end method

.method private static final download$lambda$0$1(Lf9;Landroid/app/Activity;Ljava/lang/Object;Lcom/eddyizm/tempus/homemusic/HubUpdatePatch;Lcom/eddyizm/tempus/homemusic/HubAppRelease;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/app/Dialog;->isShowing()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Ldg;->dismiss()V

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-virtual {p1}, Landroid/app/Activity;->isFinishing()Z

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    if-nez p0, :cond_9

    .line 15
    .line 16
    invoke-virtual {p1}, Landroid/app/Activity;->isDestroyed()Z

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    if-eqz p0, :cond_1

    .line 21
    .line 22
    goto/16 :goto_3

    .line 23
    .line 24
    :cond_1
    instance-of p0, p2, Ls14;

    .line 25
    .line 26
    if-nez p0, :cond_2

    .line 27
    .line 28
    move-object p0, p2

    .line 29
    check-cast p0, Ljava/io/File;

    .line 30
    .line 31
    sget-object v0, Lcom/eddyizm/tempus/homemusic/HubUpdater;->INSTANCE:Lcom/eddyizm/tempus/homemusic/HubUpdater;

    .line 32
    .line 33
    invoke-direct {v0, p1, p0}, Lcom/eddyizm/tempus/homemusic/HubUpdater;->install(Landroid/app/Activity;Ljava/io/File;)V

    .line 34
    .line 35
    .line 36
    :cond_2
    invoke-static {p2}, Lbb3;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    if-eqz p0, :cond_9

    .line 41
    .line 42
    sget-object p2, Ld25;->a:Lux3;

    .line 43
    .line 44
    const/4 p2, 0x0

    .line 45
    const/4 v0, 0x1

    .line 46
    if-eqz p3, :cond_3

    .line 47
    .line 48
    move p3, v0

    .line 49
    goto :goto_0

    .line 50
    :cond_3
    move p3, p2

    .line 51
    :goto_0
    invoke-static {}, Ljp1;->b()Z

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    sget-object v2, Lc25;->p:Lc25;

    .line 56
    .line 57
    if-nez p3, :cond_4

    .line 58
    .line 59
    sget-object p3, Lc25;->n:Lc25;

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_4
    if-eqz v1, :cond_5

    .line 63
    .line 64
    move-object p3, v2

    .line 65
    goto :goto_1

    .line 66
    :cond_5
    sget-object p3, Lc25;->o:Lc25;

    .line 67
    .line 68
    :goto_1
    if-ne p3, v2, :cond_7

    .line 69
    .line 70
    invoke-virtual {p4}, Lcom/eddyizm/tempus/homemusic/HubAppRelease;->getFull()Lcom/eddyizm/tempus/homemusic/HubUpdateFile;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    if-eqz p0, :cond_6

    .line 75
    .line 76
    invoke-virtual {p0}, Lcom/eddyizm/tempus/homemusic/HubUpdateFile;->getSize()J

    .line 77
    .line 78
    .line 79
    move-result-wide v0

    .line 80
    goto :goto_2

    .line 81
    :cond_6
    invoke-virtual {p4}, Lcom/eddyizm/tempus/homemusic/HubAppRelease;->getSize()J

    .line 82
    .line 83
    .line 84
    move-result-wide v0

    .line 85
    :goto_2
    new-instance p0, Lvg2;

    .line 86
    .line 87
    invoke-direct {p0, p1, p2}, Lvg2;-><init>(Landroid/content/Context;I)V

    .line 88
    .line 89
    .line 90
    sget-object p3, Lcom/eddyizm/tempus/homemusic/HubUpdater;->INSTANCE:Lcom/eddyizm/tempus/homemusic/HubUpdater;

    .line 91
    .line 92
    invoke-direct {p3, p1, v0, v1}, Lcom/eddyizm/tempus/homemusic/HubUpdater;->updateSize(Landroid/content/Context;J)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object p3

    .line 96
    filled-new-array {p3}, [Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object p3

    .line 100
    const v0, 0x7f13024e

    .line 101
    .line 102
    .line 103
    invoke-virtual {p1, v0, p3}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object p3

    .line 107
    iget-object v0, p0, Le9;->a:La9;

    .line 108
    .line 109
    iput-object p3, v0, La9;->f:Ljava/lang/CharSequence;

    .line 110
    .line 111
    new-instance p3, Lqt1;

    .line 112
    .line 113
    invoke-direct {p3, p1, p4, p2}, Lqt1;-><init>(Landroid/app/Activity;Lcom/eddyizm/tempus/homemusic/HubAppRelease;I)V

    .line 114
    .line 115
    .line 116
    const p1, 0x7f13024d

    .line 117
    .line 118
    .line 119
    invoke-virtual {p0, p1, p3}, Lvg2;->l(ILandroid/content/DialogInterface$OnClickListener;)Lvg2;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    const p1, 0x7f130251

    .line 124
    .line 125
    .line 126
    const/4 p2, 0x0

    .line 127
    invoke-virtual {p0, p1, p2}, Lvg2;->j(ILandroid/content/DialogInterface$OnClickListener;)Lvg2;

    .line 128
    .line 129
    .line 130
    move-result-object p0

    .line 131
    invoke-virtual {p0}, Le9;->h()Lf9;

    .line 132
    .line 133
    .line 134
    return-void

    .line 135
    :cond_7
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object p0

    .line 139
    if-nez p0, :cond_8

    .line 140
    .line 141
    const-string p0, ""

    .line 142
    .line 143
    :cond_8
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object p0

    .line 147
    const p2, 0x7f13024c

    .line 148
    .line 149
    .line 150
    invoke-virtual {p1, p2, p0}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object p0

    .line 154
    invoke-static {p1, p0, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 155
    .line 156
    .line 157
    move-result-object p0

    .line 158
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 159
    .line 160
    .line 161
    :cond_9
    :goto_3
    return-void
.end method

.method private static final download$lambda$0$1$1$0(Landroid/app/Activity;Lcom/eddyizm/tempus/homemusic/HubAppRelease;Landroid/content/DialogInterface;I)V
    .locals 0

    .line 1
    sget-object p2, Lcom/eddyizm/tempus/homemusic/HubUpdater;->INSTANCE:Lcom/eddyizm/tempus/homemusic/HubUpdater;

    .line 2
    .line 3
    const/4 p3, 0x0

    .line 4
    invoke-direct {p2, p0, p1, p3}, Lcom/eddyizm/tempus/homemusic/HubUpdater;->download(Landroid/app/Activity;Lcom/eddyizm/tempus/homemusic/HubAppRelease;Lcom/eddyizm/tempus/homemusic/HubUpdatePatch;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public static synthetic e(Landroid/app/Activity;ZLjava/io/Serializable;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/eddyizm/tempus/homemusic/HubUpdater;->check$lambda$0$1(Landroid/app/Activity;ZLjava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic f(Lf9;Landroid/app/Activity;Ljava/lang/Object;Lcom/eddyizm/tempus/homemusic/HubUpdatePatch;Lcom/eddyizm/tempus/homemusic/HubAppRelease;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Lcom/eddyizm/tempus/homemusic/HubUpdater;->download$lambda$0$1(Lf9;Landroid/app/Activity;Ljava/lang/Object;Lcom/eddyizm/tempus/homemusic/HubUpdatePatch;Lcom/eddyizm/tempus/homemusic/HubAppRelease;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final fetchApk(Landroid/content/Context;Lcom/eddyizm/tempus/homemusic/HubAppRelease;Lcom/eddyizm/tempus/homemusic/HubUpdatePatch;Lwf1;)Ljava/io/File;
    .locals 30
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/eddyizm/tempus/homemusic/HubAppRelease;",
            "Lcom/eddyizm/tempus/homemusic/HubUpdatePatch;",
            "Lwf1;",
            ")",
            "Ljava/io/File;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p3

    .line 2
    .line 3
    move-object/from16 v1, p4

    .line 4
    .line 5
    invoke-virtual/range {p2 .. p2}, Lcom/eddyizm/tempus/homemusic/HubAppRelease;->getFull()Lcom/eddyizm/tempus/homemusic/HubUpdateFile;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    const-string v4, "apk"

    .line 12
    .line 13
    invoke-static {v2, v4}, Ld25;->e(Lcom/eddyizm/tempus/homemusic/HubUpdateFile;Ljava/lang/String;)Z

    .line 14
    .line 15
    .line 16
    move-result v4

    .line 17
    if-eqz v4, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 v2, 0x0

    .line 21
    :goto_0
    if-eqz v0, :cond_1

    .line 22
    .line 23
    move-object v4, v0

    .line 24
    goto :goto_1

    .line 25
    :cond_1
    move-object v4, v2

    .line 26
    :goto_1
    const-string v5, "/app/latest.apk"

    .line 27
    .line 28
    if-eqz v4, :cond_2

    .line 29
    .line 30
    invoke-virtual {v4}, Lcom/eddyizm/tempus/homemusic/HubUpdateFile;->getUrl()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v6

    .line 34
    if-nez v6, :cond_3

    .line 35
    .line 36
    :cond_2
    move-object v6, v5

    .line 37
    :cond_3
    const-string v7, "\u041d\u0435\u0432\u0435\u0440\u043d\u0430\u044f \u0441\u0441\u044b\u043b\u043a\u0430"

    .line 38
    .line 39
    if-nez v4, :cond_5

    .line 40
    .line 41
    invoke-virtual/range {p2 .. p2}, Lcom/eddyizm/tempus/homemusic/HubAppRelease;->getUrl()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v8

    .line 45
    if-eqz v8, :cond_5

    .line 46
    .line 47
    invoke-virtual/range {p2 .. p2}, Lcom/eddyizm/tempus/homemusic/HubAppRelease;->getUrl()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v8

    .line 51
    invoke-static {v8, v5}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v5

    .line 55
    if-eqz v5, :cond_4

    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_4
    new-instance v0, Lcom/eddyizm/tempus/homemusic/HubException;

    .line 59
    .line 60
    invoke-direct {v0, v7}, Lcom/eddyizm/tempus/homemusic/HubException;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    throw v0

    .line 64
    :cond_5
    :goto_2
    if-eqz v0, :cond_6

    .line 65
    .line 66
    const-wide/32 v10, 0x1000000

    .line 67
    .line 68
    .line 69
    goto :goto_3

    .line 70
    :cond_6
    const-wide/32 v10, 0x8000000

    .line 71
    .line 72
    .line 73
    :goto_3
    if-eqz v4, :cond_7

    .line 74
    .line 75
    invoke-virtual {v4}, Lcom/eddyizm/tempus/homemusic/HubUpdateFile;->getSize()J

    .line 76
    .line 77
    .line 78
    move-result-wide v12

    .line 79
    goto :goto_4

    .line 80
    :cond_7
    invoke-virtual/range {p2 .. p2}, Lcom/eddyizm/tempus/homemusic/HubAppRelease;->getSize()J

    .line 81
    .line 82
    .line 83
    move-result-wide v12

    .line 84
    :goto_4
    if-eqz v4, :cond_8

    .line 85
    .line 86
    invoke-virtual {v4}, Lcom/eddyizm/tempus/homemusic/HubUpdateFile;->getSha256()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v4

    .line 90
    if-nez v4, :cond_9

    .line 91
    .line 92
    :cond_8
    invoke-virtual/range {p2 .. p2}, Lcom/eddyizm/tempus/homemusic/HubAppRelease;->getSha256()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v4

    .line 96
    :cond_9
    new-instance v5, Ljava/io/File;

    .line 97
    .line 98
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 99
    .line 100
    .line 101
    move-result-object v14

    .line 102
    const-string v15, "updates"

    .line 103
    .line 104
    invoke-direct {v5, v14, v15}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v5}, Ljava/io/File;->mkdirs()Z

    .line 108
    .line 109
    .line 110
    invoke-virtual {v5}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 111
    .line 112
    .line 113
    move-result-object v14

    .line 114
    const-wide/32 v16, 0x8000000

    .line 115
    .line 116
    .line 117
    if-eqz v14, :cond_c

    .line 118
    .line 119
    new-instance v8, Ljava/util/ArrayList;

    .line 120
    .line 121
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 122
    .line 123
    .line 124
    array-length v9, v14

    .line 125
    const/4 v15, 0x0

    .line 126
    :goto_5
    if-ge v15, v9, :cond_b

    .line 127
    .line 128
    aget-object v3, v14, v15

    .line 129
    .line 130
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 131
    .line 132
    .line 133
    move-result-wide v19

    .line 134
    invoke-virtual {v3}, Ljava/io/File;->lastModified()J

    .line 135
    .line 136
    .line 137
    move-result-wide v21

    .line 138
    sub-long v19, v19, v21

    .line 139
    .line 140
    const-wide/32 v21, 0x5265c00

    .line 141
    .line 142
    .line 143
    cmp-long v19, v19, v21

    .line 144
    .line 145
    if-lez v19, :cond_a

    .line 146
    .line 147
    invoke-virtual {v8, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    :cond_a
    add-int/lit8 v15, v15, 0x1

    .line 151
    .line 152
    goto :goto_5

    .line 153
    :cond_b
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 154
    .line 155
    .line 156
    move-result v3

    .line 157
    const/4 v9, 0x0

    .line 158
    :goto_6
    if-ge v9, v3, :cond_c

    .line 159
    .line 160
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v14

    .line 164
    add-int/lit8 v9, v9, 0x1

    .line 165
    .line 166
    check-cast v14, Ljava/io/File;

    .line 167
    .line 168
    invoke-virtual {v14}, Ljava/io/File;->delete()Z

    .line 169
    .line 170
    .line 171
    goto :goto_6

    .line 172
    :cond_c
    const-string v3, "download-"

    .line 173
    .line 174
    const-string v8, ".tmp"

    .line 175
    .line 176
    invoke-static {v3, v8, v5}, Ljava/io/File;->createTempFile(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;

    .line 177
    .line 178
    .line 179
    move-result-object v3

    .line 180
    const-string v8, "update-"

    .line 181
    .line 182
    const-string v9, ".apk"

    .line 183
    .line 184
    invoke-static {v8, v9, v5}, Ljava/io/File;->createTempFile(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;

    .line 185
    .line 186
    .line 187
    move-result-object v5

    .line 188
    :try_start_0
    invoke-static {}, Lrr1;->c()Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v8

    .line 192
    new-instance v9, Ljava/lang/StringBuilder;

    .line 193
    .line 194
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 195
    .line 196
    .line 197
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 198
    .line 199
    .line 200
    const-string v8, "/"

    .line 201
    .line 202
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 203
    .line 204
    .line 205
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object v8

    .line 209
    new-instance v9, Lfr1;

    .line 210
    .line 211
    invoke-direct {v9}, Lfr1;-><init>()V

    .line 212
    .line 213
    .line 214
    const/4 v14, 0x0

    .line 215
    invoke-virtual {v9, v14, v8}, Lfr1;->e(Lgr1;Ljava/lang/String;)V

    .line 216
    .line 217
    .line 218
    invoke-virtual {v9}, Lfr1;->b()Lgr1;

    .line 219
    .line 220
    .line 221
    move-result-object v8
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 222
    :try_start_1
    new-instance v9, Lfr1;

    .line 223
    .line 224
    invoke-direct {v9}, Lfr1;-><init>()V

    .line 225
    .line 226
    .line 227
    invoke-virtual {v9, v8, v6}, Lfr1;->e(Lgr1;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 228
    .line 229
    .line 230
    goto :goto_7

    .line 231
    :catch_0
    move-object v9, v14

    .line 232
    :goto_7
    if-eqz v9, :cond_d

    .line 233
    .line 234
    :try_start_2
    invoke-virtual {v9}, Lfr1;->b()Lgr1;

    .line 235
    .line 236
    .line 237
    move-result-object v6

    .line 238
    goto :goto_8

    .line 239
    :cond_d
    move-object v6, v14

    .line 240
    :goto_8
    if-eqz v6, :cond_2e

    .line 241
    .line 242
    invoke-direct/range {p0 .. p0}, Lcom/eddyizm/tempus/homemusic/HubUpdater;->getUpdateHttp()Lo83;

    .line 243
    .line 244
    .line 245
    move-result-object v7

    .line 246
    new-instance v8, Lnz3;

    .line 247
    .line 248
    invoke-direct {v8}, Lnz3;-><init>()V

    .line 249
    .line 250
    .line 251
    iput-object v6, v8, Lnz3;->a:Lgr1;

    .line 252
    .line 253
    new-instance v6, Loz3;

    .line 254
    .line 255
    invoke-direct {v6, v8}, Loz3;-><init>(Lnz3;)V

    .line 256
    .line 257
    .line 258
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 259
    .line 260
    .line 261
    new-instance v8, Lbv3;

    .line 262
    .line 263
    invoke-direct {v8, v7, v6}, Lbv3;-><init>(Lo83;Loz3;)V

    .line 264
    .line 265
    .line 266
    invoke-virtual {v8}, Lbv3;->c()Lk14;

    .line 267
    .line 268
    .line 269
    move-result-object v6
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 270
    :try_start_3
    iget-boolean v7, v6, Lk14;->C:Z

    .line 271
    .line 272
    if-eqz v7, :cond_2d

    .line 273
    .line 274
    iget-object v7, v6, Lk14;->t:Ln14;

    .line 275
    .line 276
    if-eqz v7, :cond_2c

    .line 277
    .line 278
    invoke-virtual {v7}, Ln14;->contentLength()J

    .line 279
    .line 280
    .line 281
    move-result-wide v8
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 282
    cmp-long v8, v8, v10

    .line 283
    .line 284
    const-string v9, "\u0421\u043b\u0438\u0448\u043a\u043e\u043c \u0431\u043e\u043b\u044c\u0448\u043e\u0439 \u0444\u0430\u0439\u043b"

    .line 285
    .line 286
    if-gtz v8, :cond_2b

    .line 287
    .line 288
    :try_start_4
    invoke-virtual {v7}, Ln14;->byteStream()Ljava/io/InputStream;

    .line 289
    .line 290
    .line 291
    move-result-object v7
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 292
    :try_start_5
    new-instance v8, Ljava/io/FileOutputStream;

    .line 293
    .line 294
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 295
    .line 296
    .line 297
    invoke-direct {v8, v3}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 298
    .line 299
    .line 300
    const/high16 v15, 0x10000

    .line 301
    .line 302
    :try_start_6
    new-array v15, v15, [B

    .line 303
    .line 304
    const-wide/16 v18, 0x0

    .line 305
    .line 306
    move-wide/from16 v20, v18

    .line 307
    .line 308
    move-wide/from16 v22, v20

    .line 309
    .line 310
    :goto_9
    invoke-virtual {v7, v15}, Ljava/io/InputStream;->read([B)I

    .line 311
    .line 312
    .line 313
    move-result v14

    .line 314
    if-ltz v14, :cond_11

    .line 315
    .line 316
    move-wide/from16 v24, v10

    .line 317
    .line 318
    int-to-long v10, v14

    .line 319
    add-long v20, v20, v10

    .line 320
    .line 321
    cmp-long v10, v20, v24

    .line 322
    .line 323
    if-gtz v10, :cond_10

    .line 324
    .line 325
    cmp-long v10, v12, v18

    .line 326
    .line 327
    if-lez v10, :cond_e

    .line 328
    .line 329
    cmp-long v10, v20, v12

    .line 330
    .line 331
    if-gtz v10, :cond_10

    .line 332
    .line 333
    :cond_e
    const/4 v10, 0x0

    .line 334
    invoke-virtual {v8, v15, v10, v14}, Ljava/io/FileOutputStream;->write([BII)V

    .line 335
    .line 336
    .line 337
    sub-long v26, v20, v22

    .line 338
    .line 339
    const-wide/32 v28, 0x40000

    .line 340
    .line 341
    .line 342
    cmp-long v11, v26, v28

    .line 343
    .line 344
    if-ltz v11, :cond_f

    .line 345
    .line 346
    invoke-static/range {v20 .. v21}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 347
    .line 348
    .line 349
    move-result-object v11

    .line 350
    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 351
    .line 352
    .line 353
    move-result-object v14

    .line 354
    invoke-interface {v1, v11, v14}, Lwf1;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 355
    .line 356
    .line 357
    move-wide/from16 v22, v20

    .line 358
    .line 359
    :cond_f
    move-wide/from16 v10, v24

    .line 360
    .line 361
    goto :goto_9

    .line 362
    :catchall_0
    move-exception v0

    .line 363
    move-object v1, v0

    .line 364
    goto/16 :goto_13

    .line 365
    .line 366
    :cond_10
    new-instance v0, Lcom/eddyizm/tempus/homemusic/HubException;

    .line 367
    .line 368
    invoke-direct {v0, v9}, Lcom/eddyizm/tempus/homemusic/HubException;-><init>(Ljava/lang/String;)V

    .line 369
    .line 370
    .line 371
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 372
    :cond_11
    :try_start_7
    invoke-virtual {v8}, Ljava/io/FileOutputStream;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 373
    .line 374
    .line 375
    :try_start_8
    invoke-interface {v7}, Ljava/io/Closeable;->close()V

    .line 376
    .line 377
    .line 378
    invoke-static/range {v20 .. v21}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 379
    .line 380
    .line 381
    move-result-object v7

    .line 382
    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 383
    .line 384
    .line 385
    move-result-object v8

    .line 386
    invoke-interface {v1, v7, v8}, Lwf1;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 387
    .line 388
    .line 389
    cmp-long v7, v12, v18

    .line 390
    .line 391
    if-lez v7, :cond_13

    .line 392
    .line 393
    cmp-long v7, v20, v12

    .line 394
    .line 395
    if-nez v7, :cond_12

    .line 396
    .line 397
    goto :goto_a

    .line 398
    :cond_12
    new-instance v0, Lcom/eddyizm/tempus/homemusic/HubException;

    .line 399
    .line 400
    const-string v1, "\u041d\u0435\u0432\u0435\u0440\u043d\u044b\u0439 \u0440\u0430\u0437\u043c\u0435\u0440 \u043e\u0431\u043d\u043e\u0432\u043b\u0435\u043d\u0438\u044f"

    .line 401
    .line 402
    invoke-direct {v0, v1}, Lcom/eddyizm/tempus/homemusic/HubException;-><init>(Ljava/lang/String;)V

    .line 403
    .line 404
    .line 405
    throw v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 406
    :catchall_1
    move-exception v0

    .line 407
    move-object v1, v0

    .line 408
    goto/16 :goto_15

    .line 409
    .line 410
    :cond_13
    :goto_a
    :try_start_9
    invoke-virtual {v6}, Lk14;->close()V

    .line 411
    .line 412
    .line 413
    if-eqz v4, :cond_16

    .line 414
    .line 415
    invoke-static {v4}, Lqm4;->u0(Ljava/lang/CharSequence;)Z

    .line 416
    .line 417
    .line 418
    move-result v6

    .line 419
    if-eqz v6, :cond_14

    .line 420
    .line 421
    goto :goto_b

    .line 422
    :cond_14
    invoke-static {v3}, Ld25;->d(Ljava/io/File;)Ljava/lang/String;

    .line 423
    .line 424
    .line 425
    move-result-object v6

    .line 426
    invoke-virtual {v6, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 427
    .line 428
    .line 429
    move-result v4

    .line 430
    if-eqz v4, :cond_15

    .line 431
    .line 432
    goto :goto_b

    .line 433
    :cond_15
    new-instance v0, Lcom/eddyizm/tempus/homemusic/HubException;

    .line 434
    .line 435
    const-string v1, "\u041a\u043e\u043d\u0442\u0440\u043e\u043b\u044c\u043d\u0430\u044f \u0441\u0443\u043c\u043c\u0430 \u043d\u0435 \u0441\u043e\u0432\u043f\u0430\u043b\u0430"

    .line 436
    .line 437
    invoke-direct {v0, v1}, Lcom/eddyizm/tempus/homemusic/HubException;-><init>(Ljava/lang/String;)V

    .line 438
    .line 439
    .line 440
    throw v0

    .line 441
    :catchall_2
    move-exception v0

    .line 442
    goto/16 :goto_17

    .line 443
    .line 444
    :catch_1
    move-exception v0

    .line 445
    goto/16 :goto_16

    .line 446
    .line 447
    :cond_16
    :goto_b
    if-eqz v0, :cond_18

    .line 448
    .line 449
    const-wide/16 v6, -0x1

    .line 450
    .line 451
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 452
    .line 453
    .line 454
    move-result-object v4

    .line 455
    invoke-static/range {v18 .. v19}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 456
    .line 457
    .line 458
    move-result-object v6

    .line 459
    invoke-interface {v1, v4, v6}, Lwf1;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 460
    .line 461
    .line 462
    sget-object v1, Ld25;->a:Lux3;

    .line 463
    .line 464
    new-instance v1, Ljava/io/File;

    .line 465
    .line 466
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 467
    .line 468
    .line 469
    move-result-object v4

    .line 470
    iget-object v4, v4, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    .line 471
    .line 472
    invoke-direct {v1, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 473
    .line 474
    .line 475
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 476
    .line 477
    .line 478
    if-eqz v2, :cond_17

    .line 479
    .line 480
    invoke-static {v1, v3, v5, v0, v2}, Ld25;->b(Ljava/io/File;Ljava/io/File;Ljava/io/File;Lcom/eddyizm/tempus/homemusic/HubUpdatePatch;Lcom/eddyizm/tempus/homemusic/HubUpdateFile;)V

    .line 481
    .line 482
    .line 483
    goto :goto_c

    .line 484
    :cond_17
    new-instance v0, Lcom/eddyizm/tempus/homemusic/HubException;

    .line 485
    .line 486
    const-string v1, "\u041d\u0435\u0442 \u043e\u043f\u0438\u0441\u0430\u043d\u0438\u044f \u043f\u043e\u043b\u043d\u043e\u0433\u043e APK"

    .line 487
    .line 488
    invoke-direct {v0, v1}, Lcom/eddyizm/tempus/homemusic/HubException;-><init>(Ljava/lang/String;)V

    .line 489
    .line 490
    .line 491
    throw v0

    .line 492
    :cond_18
    invoke-virtual {v5}, Ljava/io/File;->delete()Z

    .line 493
    .line 494
    .line 495
    move-result v0

    .line 496
    if-eqz v0, :cond_2a

    .line 497
    .line 498
    invoke-virtual {v3, v5}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    .line 499
    .line 500
    .line 501
    move-result v0

    .line 502
    if-eqz v0, :cond_2a

    .line 503
    .line 504
    :goto_c
    if-eqz v2, :cond_19

    .line 505
    .line 506
    invoke-virtual {v2}, Lcom/eddyizm/tempus/homemusic/HubUpdateFile;->getSize()J

    .line 507
    .line 508
    .line 509
    move-result-wide v0

    .line 510
    goto :goto_d

    .line 511
    :cond_19
    invoke-virtual/range {p2 .. p2}, Lcom/eddyizm/tempus/homemusic/HubAppRelease;->getSize()J

    .line 512
    .line 513
    .line 514
    move-result-wide v0

    .line 515
    :goto_d
    if-eqz v2, :cond_1a

    .line 516
    .line 517
    invoke-virtual {v2}, Lcom/eddyizm/tempus/homemusic/HubUpdateFile;->getSha256()Ljava/lang/String;

    .line 518
    .line 519
    .line 520
    move-result-object v2

    .line 521
    if-nez v2, :cond_1b

    .line 522
    .line 523
    :cond_1a
    invoke-virtual/range {p2 .. p2}, Lcom/eddyizm/tempus/homemusic/HubAppRelease;->getSha256()Ljava/lang/String;

    .line 524
    .line 525
    .line 526
    move-result-object v2

    .line 527
    :cond_1b
    invoke-virtual {v5}, Ljava/io/File;->length()J

    .line 528
    .line 529
    .line 530
    move-result-wide v6

    .line 531
    cmp-long v4, v6, v16

    .line 532
    .line 533
    if-gtz v4, :cond_29

    .line 534
    .line 535
    cmp-long v4, v0, v18

    .line 536
    .line 537
    if-lez v4, :cond_1c

    .line 538
    .line 539
    invoke-virtual {v5}, Ljava/io/File;->length()J

    .line 540
    .line 541
    .line 542
    move-result-wide v6

    .line 543
    cmp-long v0, v6, v0

    .line 544
    .line 545
    if-nez v0, :cond_29

    .line 546
    .line 547
    :cond_1c
    if-eqz v2, :cond_1e

    .line 548
    .line 549
    invoke-static {v2}, Lqm4;->u0(Ljava/lang/CharSequence;)Z

    .line 550
    .line 551
    .line 552
    move-result v0

    .line 553
    if-eqz v0, :cond_1d

    .line 554
    .line 555
    goto :goto_e

    .line 556
    :cond_1d
    invoke-static {v5}, Ld25;->d(Ljava/io/File;)Ljava/lang/String;

    .line 557
    .line 558
    .line 559
    move-result-object v0

    .line 560
    invoke-virtual {v0, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 561
    .line 562
    .line 563
    move-result v0

    .line 564
    if-eqz v0, :cond_29

    .line 565
    .line 566
    :cond_1e
    :goto_e
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 567
    .line 568
    const/16 v1, 0x1c

    .line 569
    .line 570
    if-lt v0, v1, :cond_1f

    .line 571
    .line 572
    const/high16 v2, 0x8000000

    .line 573
    .line 574
    goto :goto_f

    .line 575
    :cond_1f
    const/16 v2, 0x40

    .line 576
    .line 577
    :goto_f
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 578
    .line 579
    .line 580
    move-result-object v4

    .line 581
    invoke-virtual {v5}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 582
    .line 583
    .line 584
    move-result-object v6

    .line 585
    invoke-virtual {v4, v6, v2}, Landroid/content/pm/PackageManager;->getPackageArchiveInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 586
    .line 587
    .line 588
    move-result-object v4

    .line 589
    if-eqz v4, :cond_28

    .line 590
    .line 591
    if-lt v0, v1, :cond_20

    .line 592
    .line 593
    invoke-static {v4}, Lsr0;->e(Landroid/content/pm/PackageInfo;)J

    .line 594
    .line 595
    .line 596
    move-result-wide v6

    .line 597
    goto :goto_10

    .line 598
    :cond_20
    iget v6, v4, Landroid/content/pm/PackageInfo;->versionCode:I

    .line 599
    .line 600
    int-to-long v6, v6

    .line 601
    :goto_10
    iget-object v8, v4, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    .line 602
    .line 603
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 604
    .line 605
    .line 606
    move-result-object v9

    .line 607
    invoke-static {v8, v9}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 608
    .line 609
    .line 610
    move-result v8

    .line 611
    if-eqz v8, :cond_27

    .line 612
    .line 613
    invoke-virtual/range {p2 .. p2}, Lcom/eddyizm/tempus/homemusic/HubAppRelease;->getVersionCode()J

    .line 614
    .line 615
    .line 616
    move-result-wide v8

    .line 617
    cmp-long v6, v6, v8

    .line 618
    .line 619
    if-nez v6, :cond_27

    .line 620
    .line 621
    invoke-virtual/range {p2 .. p2}, Lcom/eddyizm/tempus/homemusic/HubAppRelease;->getVersionName()Ljava/lang/String;

    .line 622
    .line 623
    .line 624
    move-result-object v6

    .line 625
    if-eqz v6, :cond_21

    .line 626
    .line 627
    iget-object v6, v4, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    .line 628
    .line 629
    invoke-virtual/range {p2 .. p2}, Lcom/eddyizm/tempus/homemusic/HubAppRelease;->getVersionName()Ljava/lang/String;

    .line 630
    .line 631
    .line 632
    move-result-object v7

    .line 633
    invoke-static {v6, v7}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 634
    .line 635
    .line 636
    move-result v6

    .line 637
    if-eqz v6, :cond_27

    .line 638
    .line 639
    :cond_21
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 640
    .line 641
    .line 642
    move-result-object v6

    .line 643
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 644
    .line 645
    .line 646
    move-result-object v7

    .line 647
    invoke-virtual {v6, v7, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 648
    .line 649
    .line 650
    move-result-object v2

    .line 651
    if-lt v0, v1, :cond_23

    .line 652
    .line 653
    invoke-static {v4}, Lsr0;->f(Landroid/content/pm/PackageInfo;)Landroid/content/pm/SigningInfo;

    .line 654
    .line 655
    .line 656
    move-result-object v4

    .line 657
    if-eqz v4, :cond_22

    .line 658
    .line 659
    invoke-static {v4}, Lsr0;->t(Landroid/content/pm/SigningInfo;)[Landroid/content/pm/Signature;

    .line 660
    .line 661
    .line 662
    move-result-object v4

    .line 663
    goto :goto_11

    .line 664
    :cond_22
    const/4 v4, 0x0

    .line 665
    goto :goto_11

    .line 666
    :cond_23
    iget-object v4, v4, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    .line 667
    .line 668
    :goto_11
    if-lt v0, v1, :cond_25

    .line 669
    .line 670
    invoke-static {v2}, Lsr0;->x(Landroid/content/pm/PackageInfo;)Landroid/content/pm/SigningInfo;

    .line 671
    .line 672
    .line 673
    move-result-object v0

    .line 674
    if-eqz v0, :cond_24

    .line 675
    .line 676
    invoke-static {v0}, Lsr0;->t(Landroid/content/pm/SigningInfo;)[Landroid/content/pm/Signature;

    .line 677
    .line 678
    .line 679
    move-result-object v0

    .line 680
    goto :goto_12

    .line 681
    :cond_24
    const/4 v0, 0x0

    .line 682
    goto :goto_12

    .line 683
    :cond_25
    iget-object v0, v2, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    .line 684
    .line 685
    :goto_12
    if-eqz v4, :cond_26

    .line 686
    .line 687
    array-length v1, v4

    .line 688
    if-eqz v1, :cond_26

    .line 689
    .line 690
    if-eqz v0, :cond_26

    .line 691
    .line 692
    array-length v1, v0

    .line 693
    if-eqz v1, :cond_26

    .line 694
    .line 695
    invoke-static {v4}, Lti;->t0([Ljava/lang/Object;)Ljava/util/Set;

    .line 696
    .line 697
    .line 698
    move-result-object v1

    .line 699
    invoke-static {v0}, Lti;->t0([Ljava/lang/Object;)Ljava/util/Set;

    .line 700
    .line 701
    .line 702
    move-result-object v0

    .line 703
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 704
    .line 705
    .line 706
    move-result v0
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_1
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 707
    if-eqz v0, :cond_26

    .line 708
    .line 709
    invoke-virtual {v3}, Ljava/io/File;->delete()Z

    .line 710
    .line 711
    .line 712
    return-object v5

    .line 713
    :cond_26
    :try_start_a
    new-instance v0, Lcom/eddyizm/tempus/homemusic/HubException;

    .line 714
    .line 715
    const-string v1, "\u041f\u043e\u0434\u043f\u0438\u0441\u044c APK \u043d\u0435 \u0441\u043e\u0432\u043f\u0430\u0434\u0430\u0435\u0442"

    .line 716
    .line 717
    invoke-direct {v0, v1}, Lcom/eddyizm/tempus/homemusic/HubException;-><init>(Ljava/lang/String;)V

    .line 718
    .line 719
    .line 720
    throw v0

    .line 721
    :cond_27
    new-instance v0, Lcom/eddyizm/tempus/homemusic/HubException;

    .line 722
    .line 723
    const-string v1, "\u041d\u0435\u0432\u0435\u0440\u043d\u0430\u044f \u0432\u0435\u0440\u0441\u0438\u044f APK"

    .line 724
    .line 725
    invoke-direct {v0, v1}, Lcom/eddyizm/tempus/homemusic/HubException;-><init>(Ljava/lang/String;)V

    .line 726
    .line 727
    .line 728
    throw v0

    .line 729
    :cond_28
    new-instance v0, Lcom/eddyizm/tempus/homemusic/HubException;

    .line 730
    .line 731
    const-string v1, "\u0421\u043a\u0430\u0447\u0430\u043d\u043d\u044b\u0439 \u0444\u0430\u0439\u043b \u2014 \u043d\u0435 APK"

    .line 732
    .line 733
    invoke-direct {v0, v1}, Lcom/eddyizm/tempus/homemusic/HubException;-><init>(Ljava/lang/String;)V

    .line 734
    .line 735
    .line 736
    throw v0

    .line 737
    :cond_29
    new-instance v0, Lcom/eddyizm/tempus/homemusic/HubException;

    .line 738
    .line 739
    const-string v1, "\u041f\u043e\u0432\u0440\u0435\u0436\u0434\u0451\u043d\u043d\u044b\u0439 APK"

    .line 740
    .line 741
    invoke-direct {v0, v1}, Lcom/eddyizm/tempus/homemusic/HubException;-><init>(Ljava/lang/String;)V

    .line 742
    .line 743
    .line 744
    throw v0

    .line 745
    :cond_2a
    new-instance v0, Lcom/eddyizm/tempus/homemusic/HubException;

    .line 746
    .line 747
    const-string v1, "\u041d\u0435 \u0443\u0434\u0430\u043b\u043e\u0441\u044c \u0441\u043e\u0445\u0440\u0430\u043d\u0438\u0442\u044c APK"

    .line 748
    .line 749
    invoke-direct {v0, v1}, Lcom/eddyizm/tempus/homemusic/HubException;-><init>(Ljava/lang/String;)V

    .line 750
    .line 751
    .line 752
    throw v0
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_1
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    .line 753
    :catchall_3
    move-exception v0

    .line 754
    move-object v1, v0

    .line 755
    goto :goto_14

    .line 756
    :goto_13
    :try_start_b
    throw v1
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_4

    .line 757
    :catchall_4
    move-exception v0

    .line 758
    :try_start_c
    invoke-static {v8, v1}, Lq05;->h(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 759
    .line 760
    .line 761
    throw v0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_3

    .line 762
    :goto_14
    :try_start_d
    throw v1
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_5

    .line 763
    :catchall_5
    move-exception v0

    .line 764
    :try_start_e
    invoke-static {v7, v1}, Lq05;->h(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 765
    .line 766
    .line 767
    throw v0

    .line 768
    :cond_2b
    new-instance v0, Lcom/eddyizm/tempus/homemusic/HubException;

    .line 769
    .line 770
    invoke-direct {v0, v9}, Lcom/eddyizm/tempus/homemusic/HubException;-><init>(Ljava/lang/String;)V

    .line 771
    .line 772
    .line 773
    throw v0

    .line 774
    :cond_2c
    new-instance v0, Lcom/eddyizm/tempus/homemusic/HubException;

    .line 775
    .line 776
    const-string v1, "\u041f\u0443\u0441\u0442\u043e\u0439 \u043e\u0442\u0432\u0435\u0442 \u0425\u0430\u0431\u0430"

    .line 777
    .line 778
    invoke-direct {v0, v1}, Lcom/eddyizm/tempus/homemusic/HubException;-><init>(Ljava/lang/String;)V

    .line 779
    .line 780
    .line 781
    throw v0

    .line 782
    :cond_2d
    invoke-static {v6}, Lrr1;->i(Lk14;)Lcom/eddyizm/tempus/homemusic/HubException;

    .line 783
    .line 784
    .line 785
    move-result-object v0

    .line 786
    throw v0
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_1

    .line 787
    :goto_15
    :try_start_f
    throw v1
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_6

    .line 788
    :catchall_6
    move-exception v0

    .line 789
    :try_start_10
    invoke-static {v6, v1}, Lq05;->h(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 790
    .line 791
    .line 792
    throw v0

    .line 793
    :cond_2e
    new-instance v0, Lcom/eddyizm/tempus/homemusic/HubException;

    .line 794
    .line 795
    invoke-direct {v0, v7}, Lcom/eddyizm/tempus/homemusic/HubException;-><init>(Ljava/lang/String;)V

    .line 796
    .line 797
    .line 798
    throw v0
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_1
    .catchall {:try_start_10 .. :try_end_10} :catchall_2

    .line 799
    :goto_16
    :try_start_11
    invoke-virtual {v5}, Ljava/io/File;->delete()Z

    .line 800
    .line 801
    .line 802
    throw v0
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_2

    .line 803
    :goto_17
    invoke-virtual {v3}, Ljava/io/File;->delete()Z

    .line 804
    .line 805
    .line 806
    throw v0
.end method

.method public static synthetic g(Landroid/app/Activity;Lcom/eddyizm/tempus/homemusic/HubAppRelease;Lcom/eddyizm/tempus/homemusic/HubUpdatePatch;Lcom/google/android/material/progressindicator/LinearProgressIndicator;Landroid/widget/TextView;Lf9;)V
    .locals 0

    .line 1
    invoke-static/range {p0 .. p5}, Lcom/eddyizm/tempus/homemusic/HubUpdater;->download$lambda$0(Landroid/app/Activity;Lcom/eddyizm/tempus/homemusic/HubAppRelease;Lcom/eddyizm/tempus/homemusic/HubUpdatePatch;Lcom/google/android/material/progressindicator/LinearProgressIndicator;Landroid/widget/TextView;Lf9;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final getUpdateHttp()Lo83;
    .locals 0

    .line 1
    sget-object p0, Lcom/eddyizm/tempus/homemusic/HubUpdater;->updateHttp$delegate:Lr72;

    .line 2
    .line 3
    invoke-interface {p0}, Lr72;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lo83;

    .line 8
    .line 9
    return-object p0
.end method

.method public static synthetic h(Landroid/app/Activity;Lcom/eddyizm/tempus/homemusic/HubAppRelease;Landroid/content/DialogInterface;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/eddyizm/tempus/homemusic/HubUpdater;->offer$lambda$3(Landroid/app/Activity;Lcom/eddyizm/tempus/homemusic/HubAppRelease;Landroid/content/DialogInterface;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic i()Lo83;
    .locals 1

    .line 1
    invoke-static {}, Lcom/eddyizm/tempus/homemusic/HubUpdater;->updateHttp_delegate$lambda$0()Lo83;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method private final install(Landroid/app/Activity;Ljava/io/File;)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    new-instance v0, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string p0, ".homemusic.fileprovider"

    .line 14
    .line 15
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-static {p1, p0}, La71;->c(Landroid/content/Context;Ljava/lang/String;)Lz61;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    :try_start_0
    invoke-virtual {p2}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p2
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    .line 30
    iget-object v0, p0, Lz61;->b:Ljava/util/HashMap;

    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    const/4 v1, 0x0

    .line 41
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    const-string v3, "/"

    .line 46
    .line 47
    if-eqz v2, :cond_2

    .line 48
    .line 49
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    check-cast v2, Ljava/util/Map$Entry;

    .line 54
    .line 55
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    check-cast v4, Ljava/io/File;

    .line 60
    .line 61
    invoke-virtual {v4}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    invoke-static {p2}, La71;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v5

    .line 69
    invoke-static {v4}, La71;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v6

    .line 73
    invoke-virtual {v6, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    invoke-virtual {v5, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 78
    .line 79
    .line 80
    move-result v3

    .line 81
    if-eqz v3, :cond_0

    .line 82
    .line 83
    if-eqz v1, :cond_1

    .line 84
    .line 85
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 86
    .line 87
    .line 88
    move-result v3

    .line 89
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v4

    .line 93
    check-cast v4, Ljava/io/File;

    .line 94
    .line 95
    invoke-virtual {v4}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v4

    .line 99
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 100
    .line 101
    .line 102
    move-result v4

    .line 103
    if-le v3, v4, :cond_0

    .line 104
    .line 105
    :cond_1
    move-object v1, v2

    .line 106
    goto :goto_0

    .line 107
    :cond_2
    if-eqz v1, :cond_5

    .line 108
    .line 109
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    check-cast v0, Ljava/io/File;

    .line 114
    .line 115
    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    invoke-virtual {v0, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 120
    .line 121
    .line 122
    move-result v2

    .line 123
    const/4 v4, 0x1

    .line 124
    if-eqz v2, :cond_3

    .line 125
    .line 126
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 127
    .line 128
    .line 129
    move-result v0

    .line 130
    invoke-virtual {p2, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object p2

    .line 134
    goto :goto_1

    .line 135
    :cond_3
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 136
    .line 137
    .line 138
    move-result v0

    .line 139
    add-int/2addr v0, v4

    .line 140
    invoke-virtual {p2, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object p2

    .line 144
    :goto_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 145
    .line 146
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 147
    .line 148
    .line 149
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    check-cast v1, Ljava/lang/String;

    .line 154
    .line 155
    invoke-static {v1}, Landroid/net/Uri;->encode(Ljava/lang/String;)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v1

    .line 159
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    const/16 v1, 0x2f

    .line 163
    .line 164
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    invoke-static {p2, v3}, Landroid/net/Uri;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object p2

    .line 171
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object p2

    .line 178
    new-instance v0, Landroid/net/Uri$Builder;

    .line 179
    .line 180
    invoke-direct {v0}, Landroid/net/Uri$Builder;-><init>()V

    .line 181
    .line 182
    .line 183
    const-string v1, "content"

    .line 184
    .line 185
    invoke-virtual {v0, v1}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    iget-object p0, p0, Lz61;->a:Ljava/lang/String;

    .line 190
    .line 191
    invoke-virtual {v0, p0}, Landroid/net/Uri$Builder;->authority(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 192
    .line 193
    .line 194
    move-result-object p0

    .line 195
    invoke-virtual {p0, p2}, Landroid/net/Uri$Builder;->encodedPath(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 196
    .line 197
    .line 198
    move-result-object p0

    .line 199
    invoke-virtual {p0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    .line 200
    .line 201
    .line 202
    move-result-object p0

    .line 203
    new-instance p2, Landroid/content/Intent;

    .line 204
    .line 205
    const-string v0, "android.intent.action.VIEW"

    .line 206
    .line 207
    invoke-direct {p2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 208
    .line 209
    .line 210
    const-string v0, "application/vnd.android.package-archive"

    .line 211
    .line 212
    invoke-virtual {p2, p0, v0}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;

    .line 213
    .line 214
    .line 215
    move-result-object p0

    .line 216
    const p2, 0x10000001

    .line 217
    .line 218
    .line 219
    invoke-virtual {p0, p2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 220
    .line 221
    .line 222
    move-result-object p0

    .line 223
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 224
    .line 225
    .line 226
    :try_start_1
    invoke-virtual {p1, p0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
    :try_end_1
    .catch Landroid/content/ActivityNotFoundException; {:try_start_1 .. :try_end_1} :catch_0

    .line 227
    .line 228
    .line 229
    return-void

    .line 230
    :catch_0
    move-exception p0

    .line 231
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object p0

    .line 235
    if-nez p0, :cond_4

    .line 236
    .line 237
    const-string p0, ""

    .line 238
    .line 239
    :cond_4
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    move-result-object p0

    .line 243
    const p2, 0x7f13024c

    .line 244
    .line 245
    .line 246
    invoke-virtual {p1, p2, p0}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object p0

    .line 250
    invoke-static {p1, p0, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 251
    .line 252
    .line 253
    move-result-object p0

    .line 254
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 255
    .line 256
    .line 257
    return-void

    .line 258
    :cond_5
    const-string p0, "Failed to find configured root that contains "

    .line 259
    .line 260
    invoke-static {p0, p2}, Lxa3;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    move-result-object p0

    .line 264
    invoke-static {p0}, Lkf2;->n(Ljava/lang/String;)V

    .line 265
    .line 266
    .line 267
    return-void

    .line 268
    :catch_1
    const-string p0, "Failed to resolve canonical path for "

    .line 269
    .line 270
    invoke-static {p2, p0}, Lmj0;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 271
    .line 272
    .line 273
    return-void
.end method

.method public static synthetic j(Landroid/app/Activity;Z)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/eddyizm/tempus/homemusic/HubUpdater;->check$lambda$0(Landroid/app/Activity;Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic k(ZLandroid/content/DialogInterface;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/eddyizm/tempus/homemusic/HubUpdater;->offer$lambda$4(ZLandroid/content/DialogInterface;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final offer(Landroid/app/Activity;Lcom/eddyizm/tempus/homemusic/HubAppRelease;Lcom/eddyizm/tempus/homemusic/HubUpdatePatch;Z)V
    .locals 7

    .line 1
    invoke-virtual {p2}, Lcom/eddyizm/tempus/homemusic/HubAppRelease;->getNotes()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-static {v0}, Lqm4;->u0(Ljava/lang/CharSequence;)Z

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    if-nez v2, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move-object v0, v1

    .line 16
    :goto_0
    invoke-static {}, Ljp1;->b()Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz p3, :cond_1

    .line 21
    .line 22
    invoke-virtual {p3}, Lcom/eddyizm/tempus/homemusic/HubUpdateFile;->getSize()J

    .line 23
    .line 24
    .line 25
    move-result-wide v3

    .line 26
    goto :goto_1

    .line 27
    :cond_1
    invoke-virtual {p2}, Lcom/eddyizm/tempus/homemusic/HubAppRelease;->getFull()Lcom/eddyizm/tempus/homemusic/HubUpdateFile;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    if-eqz v3, :cond_2

    .line 32
    .line 33
    invoke-virtual {v3}, Lcom/eddyizm/tempus/homemusic/HubUpdateFile;->getSize()J

    .line 34
    .line 35
    .line 36
    move-result-wide v3

    .line 37
    goto :goto_1

    .line 38
    :cond_2
    invoke-virtual {p2}, Lcom/eddyizm/tempus/homemusic/HubAppRelease;->getSize()J

    .line 39
    .line 40
    .line 41
    move-result-wide v3

    .line 42
    :goto_1
    const-wide/16 v5, 0x0

    .line 43
    .line 44
    cmp-long v5, v3, v5

    .line 45
    .line 46
    if-lez v5, :cond_3

    .line 47
    .line 48
    invoke-direct {p0, p1, v3, v4}, Lcom/eddyizm/tempus/homemusic/HubUpdater;->updateSize(Landroid/content/Context;J)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    goto :goto_2

    .line 53
    :cond_3
    move-object p0, v1

    .line 54
    :goto_2
    invoke-virtual {p2}, Lcom/eddyizm/tempus/homemusic/HubAppRelease;->getVersionName()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    if-nez v3, :cond_4

    .line 59
    .line 60
    invoke-virtual {p2}, Lcom/eddyizm/tempus/homemusic/HubAppRelease;->getVersionCode()J

    .line 61
    .line 62
    .line 63
    move-result-wide v3

    .line 64
    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    :cond_4
    const-string v4, "1.14.7"

    .line 69
    .line 70
    filled-new-array {v4, v3}, [Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    const v4, 0x7f130253

    .line 75
    .line 76
    .line 77
    invoke-virtual {p1, v4, v3}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    const-string v4, ""

    .line 82
    .line 83
    const-string v5, "\n\n"

    .line 84
    .line 85
    if-eqz v0, :cond_5

    .line 86
    .line 87
    invoke-virtual {v5, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    goto :goto_3

    .line 92
    :cond_5
    move-object v0, v4

    .line 93
    :goto_3
    if-eqz v2, :cond_7

    .line 94
    .line 95
    if-nez p0, :cond_6

    .line 96
    .line 97
    const-string v4, "?"

    .line 98
    .line 99
    goto :goto_4

    .line 100
    :cond_6
    move-object v4, p0

    .line 101
    :goto_4
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v4

    .line 105
    const v6, 0x7f130254

    .line 106
    .line 107
    .line 108
    invoke-virtual {p1, v6, v4}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v4

    .line 112
    invoke-static {v5, v4}, Lxa3;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v4

    .line 116
    :cond_7
    invoke-static {v3, v0, v4}, Lb11;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    if-eqz v2, :cond_8

    .line 121
    .line 122
    if-eqz p0, :cond_8

    .line 123
    .line 124
    const v3, 0x7f130250

    .line 125
    .line 126
    .line 127
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object p0

    .line 131
    invoke-virtual {p1, v3, p0}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    goto :goto_5

    .line 136
    :cond_8
    const p0, 0x7f13024f

    .line 137
    .line 138
    .line 139
    invoke-virtual {p1, p0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object p0

    .line 143
    :goto_5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 144
    .line 145
    .line 146
    new-instance v3, Lvg2;

    .line 147
    .line 148
    const/4 v4, 0x0

    .line 149
    invoke-direct {v3, p1, v4}, Lvg2;-><init>(Landroid/content/Context;I)V

    .line 150
    .line 151
    .line 152
    const v4, 0x7f13025b

    .line 153
    .line 154
    .line 155
    invoke-virtual {v3, v4}, Lvg2;->p(I)V

    .line 156
    .line 157
    .line 158
    iget-object v4, v3, Le9;->a:La9;

    .line 159
    .line 160
    iput-object v0, v4, La9;->f:Ljava/lang/CharSequence;

    .line 161
    .line 162
    new-instance v0, Lrn1;

    .line 163
    .line 164
    const/4 v4, 0x2

    .line 165
    invoke-direct {v0, p1, p2, p3, v4}, Lrn1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {v3, p0, v0}, Lvg2;->m(Ljava/lang/String;Lrn1;)V

    .line 169
    .line 170
    .line 171
    if-eqz v2, :cond_9

    .line 172
    .line 173
    const p0, 0x7f13025c

    .line 174
    .line 175
    .line 176
    goto :goto_6

    .line 177
    :cond_9
    const p0, 0x7f130251

    .line 178
    .line 179
    .line 180
    :goto_6
    invoke-virtual {v3, p0, v1}, Lvg2;->j(ILandroid/content/DialogInterface$OnClickListener;)Lvg2;

    .line 181
    .line 182
    .line 183
    move-result-object p0

    .line 184
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 185
    .line 186
    .line 187
    if-nez p4, :cond_a

    .line 188
    .line 189
    new-instance p3, Lqt1;

    .line 190
    .line 191
    const/4 v0, 0x1

    .line 192
    invoke-direct {p3, p1, p2, v0}, Lqt1;-><init>(Landroid/app/Activity;Lcom/eddyizm/tempus/homemusic/HubAppRelease;I)V

    .line 193
    .line 194
    .line 195
    const p1, 0x7f13025a

    .line 196
    .line 197
    .line 198
    invoke-virtual {p0, p1, p3}, Lvg2;->k(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 199
    .line 200
    .line 201
    :cond_a
    new-instance p1, Lst1;

    .line 202
    .line 203
    invoke-direct {p1, p4}, Lst1;-><init>(Z)V

    .line 204
    .line 205
    .line 206
    iget-object p2, p0, Le9;->a:La9;

    .line 207
    .line 208
    iput-object p1, p2, La9;->n:Lst1;

    .line 209
    .line 210
    invoke-virtual {p0}, Le9;->h()Lf9;

    .line 211
    .line 212
    .line 213
    return-void
.end method

.method private static final offer$lambda$2(Landroid/app/Activity;Lcom/eddyizm/tempus/homemusic/HubAppRelease;Lcom/eddyizm/tempus/homemusic/HubUpdatePatch;Landroid/content/DialogInterface;I)V
    .locals 0

    .line 1
    sget-object p3, Lcom/eddyizm/tempus/homemusic/HubUpdater;->INSTANCE:Lcom/eddyizm/tempus/homemusic/HubUpdater;

    .line 2
    .line 3
    invoke-direct {p3, p0, p1, p2}, Lcom/eddyizm/tempus/homemusic/HubUpdater;->download(Landroid/app/Activity;Lcom/eddyizm/tempus/homemusic/HubAppRelease;Lcom/eddyizm/tempus/homemusic/HubUpdatePatch;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private static final offer$lambda$3(Landroid/app/Activity;Lcom/eddyizm/tempus/homemusic/HubAppRelease;Landroid/content/DialogInterface;I)V
    .locals 2

    .line 1
    sget-object p2, Lcom/eddyizm/tempus/homemusic/HubUpdater;->INSTANCE:Lcom/eddyizm/tempus/homemusic/HubUpdater;

    .line 2
    .line 3
    invoke-direct {p2, p0}, Lcom/eddyizm/tempus/homemusic/HubUpdater;->prefs(Landroid/content/Context;)Landroid/content/SharedPreferences;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-interface {p0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    const-string p2, "skipped_version"

    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/eddyizm/tempus/homemusic/HubAppRelease;->getVersionCode()J

    .line 14
    .line 15
    .line 16
    move-result-wide v0

    .line 17
    invoke-interface {p0, p2, v0, v1}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method private static final offer$lambda$4(ZLandroid/content/DialogInterface;)V
    .locals 0

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    sput-object p0, Lcom/eddyizm/tempus/homemusic/HubUpdater;->autoCheckFor:Ljava/lang/ref/WeakReference;

    .line 5
    .line 6
    :cond_0
    return-void
.end method

.method private final prefs(Landroid/content/Context;)Landroid/content/SharedPreferences;
    .locals 1

    .line 1
    const-string p0, "homemusic_updater"

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-virtual {p1, p0, v0}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    return-object p0
.end method

.method private static final updateHttp_delegate$lambda$0()Lo83;
    .locals 2

    .line 1
    invoke-static {}, Lrr1;->k()Lo83;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lo83;->a()Ln83;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sget-object v1, Lbe0;->g:Li80;

    .line 10
    .line 11
    iput-object v1, v0, Ln83;->k:Lbe0;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    iput-boolean v1, v0, Ln83;->i:Z

    .line 15
    .line 16
    iput-boolean v1, v0, Ln83;->j:Z

    .line 17
    .line 18
    new-instance v1, Lo83;

    .line 19
    .line 20
    invoke-direct {v1, v0}, Lo83;-><init>(Ln83;)V

    .line 21
    .line 22
    .line 23
    return-object v1
.end method

.method private final updateSize(Landroid/content/Context;J)Ljava/lang/String;
    .locals 2

    .line 1
    const-wide/32 v0, 0x100000

    .line 2
    .line 3
    .line 4
    cmp-long p0, p2, v0

    .line 5
    .line 6
    if-gez p0, :cond_0

    .line 7
    .line 8
    long-to-double p2, p2

    .line 9
    const-wide/high16 v0, 0x4090000000000000L    # 1024.0

    .line 10
    .line 11
    div-double/2addr p2, v0

    .line 12
    invoke-static {p2, p3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    const p2, 0x7f130258

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1, p2, p0}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    return-object p0

    .line 31
    :cond_0
    long-to-double p2, p2

    .line 32
    const-wide/high16 v0, 0x4130000000000000L    # 1048576.0

    .line 33
    .line 34
    div-double/2addr p2, v0

    .line 35
    invoke-static {p2, p3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    const p2, 0x7f130259

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1, p2, p0}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    return-object p0
.end method
