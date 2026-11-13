.class public Ldefpackage/zg5;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/fv2;
.implements Lcom/eddyizm/tempus/interfaces/MediaCallback;
.implements Ldefpackage/bd0;
.implements Ldefpackage/jh;
.implements Ldefpackage/yy;
.implements Ldefpackage/o73;
.implements Ldefpackage/fl0;
.implements Ldefpackage/q51;
.implements Ldefpackage/p5;
.implements Ldefpackage/zw;


# static fields
.field public static o:Ldefpackage/zg5;

.field public static final p:[I


# instance fields
.field public n:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0x23

    .line 2
    .line 3
    new-array v0, v0, [I

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, Ldefpackage/zg5;->p:[I

    .line 9
    .line 10
    return-void

    .line 11
    :array_0
    .array-data 4
        0x1
        0x2
        0x3
        0x4
        0x5
        0x6
        0x7
        0x8
        0x9
        0xa
        0xb
        0xc
        0xd
        0xe
        0xf
        0x10
        0x11
        0x12
        0x13
        0x1f
        0x14
        0x15
        0x16
        0x17
        0x18
        0x19
        0x21
        0x1a
        0x22
        0x23
        0x1b
        0x1c
        0x1d
        0x1e
        0x20
    .end array-data
.end method

.method public constructor <init>(I)V
    .locals 1

    .line 1
    sparse-switch p1, :sswitch_data_0

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    new-instance p1, Ldefpackage/xk0;

    .line 8
    .line 9
    const/4 v0, 0x2

    .line 10
    invoke-direct {p1, v0}, Ldefpackage/xk0;-><init>(I)V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Ldefpackage/zg5;->n:Ljava/lang/Object;

    .line 14
    .line 15
    return-void

    .line 16
    :sswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    new-instance p1, Ljava/util/HashMap;

    .line 20
    .line 21
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Ldefpackage/zg5;->n:Ljava/lang/Object;

    .line 25
    .line 26
    return-void

    .line 27
    :sswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    .line 29
    .line 30
    new-instance p1, Ljava/util/ArrayDeque;

    .line 31
    .line 32
    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    .line 33
    .line 34
    .line 35
    iput-object p1, p0, Ldefpackage/zg5;->n:Ljava/lang/Object;

    .line 36
    .line 37
    return-void

    .line 38
    :sswitch_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    .line 40
    .line 41
    new-instance p1, Ldefpackage/f13;

    .line 42
    .line 43
    const/16 v0, 0x10

    .line 44
    .line 45
    new-array v0, v0, [Ldefpackage/cd0;

    .line 46
    .line 47
    invoke-direct {p1, v0}, Ldefpackage/f13;-><init>([Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iput-object p1, p0, Ldefpackage/zg5;->n:Ljava/lang/Object;

    .line 51
    .line 52
    return-void

    .line 53
    :sswitch_3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 54
    .line 55
    .line 56
    new-instance p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 57
    .line 58
    invoke-direct {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 59
    .line 60
    .line 61
    iput-object p1, p0, Ldefpackage/zg5;->n:Ljava/lang/Object;

    .line 62
    .line 63
    return-void

    .line 64
    nop

    .line 65
    :sswitch_data_0
    .sparse-switch
        0x8 -> :sswitch_3
        0xb -> :sswitch_2
        0x15 -> :sswitch_1
        0x1d -> :sswitch_0
    .end sparse-switch
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 65
    iput-object p1, p0, Ldefpackage/zg5;->n:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static declared-synchronized E(Landroid/content/Context;)Ldefpackage/zg5;
    .locals 5

    .line 1
    const-class v0, Ldefpackage/zg5;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    const-class v1, Ldefpackage/zg5;

    .line 9
    .line 10
    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 11
    :try_start_1
    sget-object v2, Ldefpackage/zg5;->o:Ldefpackage/zg5;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 12
    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    :goto_0
    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 16
    goto :goto_2

    .line 17
    :cond_0
    :try_start_3
    new-instance v2, Ldefpackage/zg5;

    .line 18
    .line 19
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    invoke-static {p0}, Ldefpackage/bm4;->a(Landroid/content/Context;)Ldefpackage/bm4;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    iput-object p0, v2, Ldefpackage/zg5;->n:Ljava/lang/Object;

    .line 27
    .line 28
    invoke-virtual {p0}, Ldefpackage/bm4;->b()Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    .line 29
    .line 30
    .line 31
    const-string v3, "defaultGoogleSignInAccount"

    .line 32
    .line 33
    invoke-virtual {p0, v3}, Ldefpackage/bm4;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    if-eqz v4, :cond_1

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    const-string v4, "googleSignInOptions"

    .line 45
    .line 46
    invoke-static {v4, v3}, Ldefpackage/bm4;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    invoke-virtual {p0, v3}, Ldefpackage/bm4;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 54
    if-eqz p0, :cond_2

    .line 55
    .line 56
    :try_start_4
    invoke-static {p0}, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->b(Ljava/lang/String;)Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;
    :try_end_4
    .catch Lorg/json/JSONException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 57
    .line 58
    .line 59
    :catch_0
    :cond_2
    :goto_1
    :try_start_5
    sput-object v2, Ldefpackage/zg5;->o:Ldefpackage/zg5;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :goto_2
    monitor-exit v0

    .line 63
    return-object v2

    .line 64
    :catchall_0
    move-exception p0

    .line 65
    :try_start_6
    monitor-exit v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 66
    :try_start_7
    throw p0

    .line 67
    :catchall_1
    move-exception p0

    .line 68
    monitor-exit v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 69
    throw p0
.end method


# virtual methods
.method public A()Ljava/lang/Object;
    .locals 5

    .line 1
    const-string v0, "\' with no args"

    .line 2
    .line 3
    const-string v1, "Failed to invoke constructor \'"

    .line 4
    .line 5
    iget-object p0, p0, Ldefpackage/zg5;->n:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Ljava/lang/reflect/Constructor;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    :try_start_0
    invoke-virtual {p0, v2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 14
    return-object p0

    .line 15
    :catch_0
    move-exception p0

    .line 16
    sget-object v0, Ldefpackage/ox3;->a:Ldefpackage/hw;

    .line 17
    .line 18
    const-string v0, "Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers."

    .line 19
    .line 20
    invoke-static {v0, p0}, Ldefpackage/nz2;->s(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 21
    .line 22
    .line 23
    return-object v2

    .line 24
    :catch_1
    move-exception v3

    .line 25
    new-instance v4, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    invoke-direct {v4, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-static {p0}, Ldefpackage/ox3;->b(Ljava/lang/reflect/Constructor;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-virtual {v3}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-static {p0, v0}, Ldefpackage/nz2;->s(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 49
    .line 50
    .line 51
    return-object v2

    .line 52
    :catch_2
    move-exception v2

    .line 53
    new-instance v3, Ljava/lang/RuntimeException;

    .line 54
    .line 55
    invoke-static {p0}, Ldefpackage/ox3;->b(Ljava/lang/reflect/Constructor;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    new-instance v4, Ljava/lang/StringBuilder;

    .line 60
    .line 61
    invoke-direct {v4, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    invoke-direct {v3, p0, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 75
    .line 76
    .line 77
    throw v3
.end method

.method public B(FFJ)V
    .locals 4

    .line 1
    iget-object p0, p0, Ldefpackage/zg5;->n:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ldefpackage/i61;

    .line 4
    .line 5
    invoke-virtual {p0}, Ldefpackage/i61;->g()Ldefpackage/jz;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const/16 v0, 0x20

    .line 10
    .line 11
    shr-long v0, p3, v0

    .line 12
    .line 13
    long-to-int v0, v0

    .line 14
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    const-wide v2, 0xffffffffL

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    and-long/2addr p3, v2

    .line 24
    long-to-int p3, p3

    .line 25
    invoke-static {p3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 26
    .line 27
    .line 28
    move-result p4

    .line 29
    invoke-interface {p0, v1, p4}, Ldefpackage/jz;->j(FF)V

    .line 30
    .line 31
    .line 32
    invoke-interface {p0, p1, p2}, Ldefpackage/jz;->a(FF)V

    .line 33
    .line 34
    .line 35
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    neg-float p1, p1

    .line 40
    invoke-static {p3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 41
    .line 42
    .line 43
    move-result p2

    .line 44
    neg-float p2, p2

    .line 45
    invoke-interface {p0, p1, p2}, Ldefpackage/jz;->j(FF)V

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method public C(FF)V
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/zg5;->n:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ldefpackage/i61;

    .line 4
    .line 5
    invoke-virtual {p0}, Ldefpackage/i61;->g()Ldefpackage/jz;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-interface {p0, p1, p2}, Ldefpackage/jz;->j(FF)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public D()Ldefpackage/yf0;
    .locals 6

    .line 1
    iget-object p0, p0, Ldefpackage/zg5;->n:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ldefpackage/nc1;

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const/16 v2, 0x84

    .line 14
    .line 15
    invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    new-instance v1, Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 22
    .line 23
    .line 24
    iget-object v0, v0, Landroid/content/pm/PackageInfo;->services:[Landroid/content/pm/ServiceInfo;

    .line 25
    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    array-length v2, v0

    .line 29
    const/4 v3, 0x0

    .line 30
    :goto_0
    if-ge v3, v2, :cond_1

    .line 31
    .line 32
    aget-object v4, v0, v3

    .line 33
    .line 34
    iget-object v4, v4, Landroid/content/pm/ServiceInfo;->metaData:Landroid/os/Bundle;

    .line 35
    .line 36
    if-eqz v4, :cond_0

    .line 37
    .line 38
    const-string v5, "androidx.credentials.CREDENTIAL_PROVIDER_KEY"

    .line 39
    .line 40
    invoke-virtual {v4, v5}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    if-eqz v4, :cond_0

    .line 45
    .line 46
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    invoke-static {v1}, Ldefpackage/q40;->Q0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    const/4 v2, 0x0

    .line 61
    if-eqz v1, :cond_2

    .line 62
    .line 63
    return-object v2

    .line 64
    :cond_2
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    move-object v1, v2

    .line 69
    :catchall_0
    :cond_3
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    if-eqz v3, :cond_5

    .line 74
    .line 75
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    check-cast v3, Ljava/lang/String;

    .line 80
    .line 81
    :try_start_0
    invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    const-class v4, Landroid/content/Context;

    .line 86
    .line 87
    filled-new-array {v4}, [Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    move-result-object v4

    .line 91
    invoke-virtual {v3, v4}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v4

    .line 99
    invoke-virtual {v3, v4}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v3

    .line 103
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    check-cast v3, Ldefpackage/yf0;

    .line 107
    .line 108
    invoke-interface {v3}, Ldefpackage/yf0;->isAvailableOnDevice()Z

    .line 109
    .line 110
    .line 111
    move-result v4

    .line 112
    if-eqz v4, :cond_3

    .line 113
    .line 114
    if-eqz v1, :cond_4

    .line 115
    .line 116
    const-string v3, "CredProviderFactory"

    .line 117
    .line 118
    const-string v4, "Only one active OEM CredentialProvider allowed"

    .line 119
    .line 120
    invoke-static {v3, v4}, Landroid/util/Ldefpackage/og;->i(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 121
    .line 122
    .line 123
    goto :goto_2

    .line 124
    :cond_4
    move-object v1, v3

    .line 125
    goto :goto_1

    .line 126
    :cond_5
    move-object v2, v1

    .line 127
    :goto_2
    return-object v2
.end method

.method public declared-synchronized F()V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Ldefpackage/zg5;->n:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Ldefpackage/bm4;

    .line 5
    .line 6
    iget-object v1, v0, Ldefpackage/bm4;->a:Ljava/util/concurrent/locks/ReentrantLock;

    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 9
    .line 10
    .line 11
    :try_start_1
    iget-object v0, v0, Ldefpackage/bm4;->b:Landroid/content/SharedPreferences;

    .line 12
    .line 13
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 22
    .line 23
    .line 24
    :try_start_2
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 25
    .line 26
    .line 27
    monitor-exit p0

    .line 28
    return-void

    .line 29
    :catchall_0
    move-exception v0

    .line 30
    :try_start_3
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 31
    .line 32
    .line 33
    throw v0

    .line 34
    :goto_0
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 35
    throw v0

    .line 36
    :catchall_1
    move-exception v0

    .line 37
    goto :goto_0
.end method

.method public a(Ldefpackage/qu2;Z)V
    .locals 2

    .line 1
    instance-of v0, p1, Ldefpackage/en4;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Ldefpackage/en4;

    .line 7
    .line 8
    iget-object v0, v0, Ldefpackage/en4;->z:Ldefpackage/qu2;

    .line 9
    .line 10
    invoke-virtual {v0}, Ldefpackage/qu2;->k()Ldefpackage/qu2;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-virtual {v0, v1}, Ldefpackage/qu2;->c(Z)V

    .line 16
    .line 17
    .line 18
    :cond_0
    iget-object p0, p0, Ldefpackage/zg5;->n:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p0, Ldefpackage/y4;

    .line 21
    .line 22
    iget-object p0, p0, Ldefpackage/y4;->r:Ldefpackage/fv2;

    .line 23
    .line 24
    if-eqz p0, :cond_1

    .line 25
    .line 26
    invoke-interface {p0, p1, p2}, Ldefpackage/fv2;->a(Ldefpackage/qu2;Z)V

    .line 27
    .line 28
    .line 29
    :cond_1
    return-void
.end method

.method public b()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Ldefpackage/zg5;->d()S

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    shl-int/lit8 v0, v0, 0x8

    .line 6
    .line 7
    invoke-virtual {p0}, Ldefpackage/zg5;->d()S

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    or-int/2addr p0, v0

    .line 12
    return p0
.end method

.method public c(I)V
    .locals 0

    .line 1
    return-void
.end method

.method public d()S
    .locals 1

    .line 1
    iget-object p0, p0, Ldefpackage/zg5;->n:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ljava/io/InputStream;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/io/InputStream;->read()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    const/4 v0, -0x1

    .line 10
    if-eq p0, v0, :cond_0

    .line 11
    .line 12
    int-to-short p0, p0

    .line 13
    return p0

    .line 14
    :cond_0
    new-instance p0, Lcom/bumptech/glide/load/resource/bitmap/DefaultImageHeaderParser$Reader$EndOfFileException;

    .line 15
    .line 16
    invoke-direct {p0}, Lcom/bumptech/glide/load/resource/bitmap/DefaultImageHeaderParser$Reader$EndOfFileException;-><init>()V

    .line 17
    .line 18
    .line 19
    throw p0
.end method

.method public e(I[B)I
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    const/4 v2, -0x1

    .line 4
    if-ge v0, p1, :cond_0

    .line 5
    .line 6
    iget-object v1, p0, Ldefpackage/zg5;->n:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v1, Ljava/io/InputStream;

    .line 9
    .line 10
    sub-int v3, p1, v0

    .line 11
    .line 12
    invoke-virtual {v1, p2, v0, v3}, Ljava/io/InputStream;->read([BII)I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eq v1, v2, :cond_0

    .line 17
    .line 18
    add-int/2addr v0, v1

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    if-nez v0, :cond_2

    .line 21
    .line 22
    if-eq v1, v2, :cond_1

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_1
    new-instance p0, Lcom/bumptech/glide/load/resource/bitmap/DefaultImageHeaderParser$Reader$EndOfFileException;

    .line 26
    .line 27
    invoke-direct {p0}, Lcom/bumptech/glide/load/resource/bitmap/DefaultImageHeaderParser$Reader$EndOfFileException;-><init>()V

    .line 28
    .line 29
    .line 30
    throw p0

    .line 31
    :cond_2
    :goto_1
    return v0
.end method

.method public f(I)V
    .locals 0

    .line 1
    return-void
.end method

.method public g()Ljava/lang/Object;
    .locals 2

    .line 1
    new-instance v0, Ldefpackage/xi0;

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/zg5;->n:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Ldefpackage/ue1;

    .line 6
    .line 7
    iget-object v1, p0, Ldefpackage/ue1;->p:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, Ldefpackage/sd0;

    .line 10
    .line 11
    iget-object p0, p0, Ldefpackage/ue1;->q:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, Ldefpackage/i61;

    .line 14
    .line 15
    invoke-direct {v0, v1, p0}, Ldefpackage/xi0;-><init>(Ldefpackage/sd0;Ldefpackage/i61;)V

    .line 16
    .line 17
    .line 18
    return-object v0
.end method

.method public h(IF)V
    .locals 0

    .line 1
    return-void
.end method

.method public i(Ljava/lang/Object;)V
    .locals 3

    .line 1
    check-cast p1, Ldefpackage/o5;

    .line 2
    .line 3
    iget-object v0, p0, Ldefpackage/zg5;->n:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Ldefpackage/ld1;

    .line 6
    .line 7
    iget-object v1, v0, Ldefpackage/ld1;->E:Ljava/util/ArrayDeque;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->pollFirst()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    check-cast v1, Ldefpackage/gd1;

    .line 14
    .line 15
    const-string v2, "FragmentManager"

    .line 16
    .line 17
    if-nez v1, :cond_0

    .line 18
    .line 19
    new-instance p1, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    const-string v0, "No IntentSenders were started for "

    .line 22
    .line 23
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-static {v2, p0}, Landroid/util/Ldefpackage/og;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_0
    iget-object p0, v1, Ldefpackage/gd1;->n:Ljava/lang/String;

    .line 38
    .line 39
    iget v1, v1, Ldefpackage/gd1;->o:I

    .line 40
    .line 41
    iget-object v0, v0, Ldefpackage/ld1;->c:Ldefpackage/ss0;

    .line 42
    .line 43
    invoke-virtual {v0, p0}, Ldefpackage/ss0;->u(Ljava/lang/String;)Ldefpackage/kc1;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    if-nez v0, :cond_1

    .line 48
    .line 49
    new-instance p1, Ljava/lang/StringBuilder;

    .line 50
    .line 51
    const-string v0, "Intent Sender result delivered for unknown Fragment "

    .line 52
    .line 53
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    invoke-static {v2, p0}, Landroid/util/Ldefpackage/og;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 64
    .line 65
    .line 66
    return-void

    .line 67
    :cond_1
    iget p0, p1, Ldefpackage/o5;->n:I

    .line 68
    .line 69
    iget-object p1, p1, Ldefpackage/o5;->o:Landroid/content/Intent;

    .line 70
    .line 71
    invoke-virtual {v0, v1, p0, p1}, Ldefpackage/kc1;->D(IILandroid/content/Intent;)V

    .line 72
    .line 73
    .line 74
    return-void
.end method

.method public j(Landroid/graphics/Typeface;)V
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/zg5;->n:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ldefpackage/k40;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Ldefpackage/k40;->m(Landroid/graphics/Typeface;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    invoke-virtual {p0, p1}, Ldefpackage/k40;->i(Z)V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public k(IZ)V
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/zg5;->n:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ldefpackage/xk0;

    .line 4
    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Ldefpackage/xk0;->b(I)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public l(II)Z
    .locals 1

    .line 1
    iget-object p0, p0, Ldefpackage/zg5;->n:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ldefpackage/nk;

    .line 4
    .line 5
    iget-object v0, p0, Ldefpackage/nk;->n:Ljava/util/List;

    .line 6
    .line 7
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iget-object v0, p0, Ldefpackage/nk;->o:Ljava/util/List;

    .line 12
    .line 13
    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    if-eqz p2, :cond_0

    .line 20
    .line 21
    iget-object p0, p0, Ldefpackage/nk;->r:Ldefpackage/pk;

    .line 22
    .line 23
    iget-object p0, p0, Ldefpackage/pk;->b:Ldefpackage/rm3;

    .line 24
    .line 25
    iget-object p0, p0, Ldefpackage/rm3;->o:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 28
    .line 29
    check-cast p2, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 30
    .line 31
    invoke-virtual {p1, p2}, Lcom/eddyizm/tempus/subsonic/models/Child;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    return p0

    .line 36
    :cond_0
    if-nez p1, :cond_1

    .line 37
    .line 38
    if-nez p2, :cond_1

    .line 39
    .line 40
    const/4 p0, 0x1

    .line 41
    return p0

    .line 42
    :cond_1
    new-instance p0, Ljava/lang/AssertionError;

    .line 43
    .line 44
    invoke-direct {p0}, Ljava/lang/AssertionError;-><init>()V

    .line 45
    .line 46
    .line 47
    throw p0
.end method

.method public m(II)Z
    .locals 1

    .line 1
    iget-object p0, p0, Ldefpackage/zg5;->n:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ldefpackage/nk;

    .line 4
    .line 5
    iget-object v0, p0, Ldefpackage/nk;->n:Ljava/util/List;

    .line 6
    .line 7
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iget-object v0, p0, Ldefpackage/nk;->o:Ljava/util/List;

    .line 12
    .line 13
    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    if-eqz p2, :cond_0

    .line 20
    .line 21
    iget-object p0, p0, Ldefpackage/nk;->r:Ldefpackage/pk;

    .line 22
    .line 23
    iget-object p0, p0, Ldefpackage/pk;->b:Ldefpackage/rm3;

    .line 24
    .line 25
    iget-object p0, p0, Ldefpackage/rm3;->o:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 28
    .line 29
    check-cast p2, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 30
    .line 31
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-static {p0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    return p0

    .line 44
    :cond_0
    if-nez p1, :cond_1

    .line 45
    .line 46
    if-nez p2, :cond_1

    .line 47
    .line 48
    const/4 p0, 0x1

    .line 49
    return p0

    .line 50
    :cond_1
    const/4 p0, 0x0

    .line 51
    return p0
.end method

.method public n(Ldefpackage/tb1;)Ljava/lang/String;
    .locals 7

    .line 1
    iget-object v0, p1, Ldefpackage/tb1;->d:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p1, Ldefpackage/tb1;->b:Ljava/lang/String;

    .line 4
    .line 5
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    const-string v3, ""

    .line 10
    .line 11
    if-nez v2, :cond_1

    .line 12
    .line 13
    const-string v2, "und"

    .line 14
    .line 15
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-static {v0}, Ljava/util/Locale;->forLanguageTag(Ljava/lang/String;)Ljava/util/Locale;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    sget-object v2, Ldefpackage/f35;->a:Ljava/lang/String;

    .line 27
    .line 28
    sget-object v2, Ljava/util/Locale$Category;->DISPLAY:Ljava/util/Locale$Category;

    .line 29
    .line 30
    invoke-static {v2}, Ljava/util/Locale;->getDefault(Ljava/util/Locale$Category;)Ljava/util/Locale;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-virtual {v0, v2}, Ljava/util/Locale;->getDisplayName(Ljava/util/Locale;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    if-eqz v4, :cond_2

    .line 43
    .line 44
    :cond_1
    :goto_0
    move-object v0, v3

    .line 45
    goto :goto_1

    .line 46
    :cond_2
    const/4 v4, 0x1

    .line 47
    const/4 v5, 0x0

    .line 48
    :try_start_0
    invoke-virtual {v0, v5, v4}, Ljava/lang/String;->offsetByCodePoints(II)I

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    new-instance v6, Ljava/lang/StringBuilder;

    .line 53
    .line 54
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0, v5, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v5

    .line 61
    invoke-virtual {v5, v2}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 79
    :catch_0
    :goto_1
    invoke-virtual {p0, p1}, Ldefpackage/zg5;->o(Ldefpackage/tb1;)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    filled-new-array {v0, p1}, [Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    invoke-virtual {p0, p1}, Ldefpackage/zg5;->x([Ljava/lang/String;)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 92
    .line 93
    .line 94
    move-result p1

    .line 95
    if-eqz p1, :cond_4

    .line 96
    .line 97
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 98
    .line 99
    .line 100
    move-result p0

    .line 101
    if-eqz p0, :cond_3

    .line 102
    .line 103
    move-object v1, v3

    .line 104
    :cond_3
    move-object p0, v1

    .line 105
    :cond_4
    return-object p0
.end method

.method public o(Ldefpackage/tb1;)Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Ldefpackage/zg5;->n:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/content/res/Resources;

    .line 4
    .line 5
    iget p1, p1, Ldefpackage/tb1;->f:I

    .line 6
    .line 7
    and-int/lit8 v1, p1, 0x2

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    const v1, 0x7f13013d

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const-string v1, ""

    .line 20
    .line 21
    :goto_0
    and-int/lit8 v2, p1, 0x4

    .line 22
    .line 23
    if-eqz v2, :cond_1

    .line 24
    .line 25
    const v2, 0x7f130140

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {p0, v1}, Ldefpackage/zg5;->x([Ljava/lang/String;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    :cond_1
    and-int/lit8 v2, p1, 0x8

    .line 41
    .line 42
    if-eqz v2, :cond_2

    .line 43
    .line 44
    const v2, 0x7f13013f

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-virtual {p0, v1}, Ldefpackage/zg5;->x([Ljava/lang/String;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    :cond_2
    and-int/lit16 p1, p1, 0x440

    .line 60
    .line 61
    if-eqz p1, :cond_3

    .line 62
    .line 63
    const p1, 0x7f13013e

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    filled-new-array {v1, p1}, [Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    invoke-virtual {p0, p1}, Ldefpackage/zg5;->x([Ljava/lang/String;)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    return-object p0

    .line 79
    :cond_3
    return-object v1
.end method

.method public onError(Ljava/lang/Exception;)V
    .locals 0

    .line 1
    return-void
.end method

.method public onLoadMedia(Ljava/util/List;)V
    .locals 4

    .line 1
    iget-object p0, p0, Ldefpackage/zg5;->n:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ldefpackage/y7;

    .line 4
    .line 5
    iget-object v0, p0, Ldefpackage/y7;->c:Ldefpackage/k03;

    .line 6
    .line 7
    iget-object v1, p0, Ldefpackage/y7;->d:Ldefpackage/k03;

    .line 8
    .line 9
    iget v2, p0, Ldefpackage/y7;->f:I

    .line 10
    .line 11
    const/4 v3, 0x2

    .line 12
    if-ne v2, v3, :cond_0

    .line 13
    .line 14
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 15
    .line 16
    invoke-virtual {v1, p0}, Ldefpackage/ad2;->k(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    invoke-virtual {v0}, Ldefpackage/ad2;->d()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    check-cast v2, Ljava/util/List;

    .line 25
    .line 26
    invoke-interface {v2, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v2}, Ldefpackage/ad2;->k(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    const/16 v0, 0x1f4

    .line 37
    .line 38
    if-ne p1, v0, :cond_1

    .line 39
    .line 40
    invoke-virtual {p0}, Ldefpackage/y7;->c()V

    .line 41
    .line 42
    .line 43
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 44
    .line 45
    invoke-virtual {v1, p0}, Ldefpackage/ad2;->k(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :cond_1
    iput v3, p0, Ldefpackage/y7;->f:I

    .line 50
    .line 51
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 52
    .line 53
    invoke-virtual {v1, p0}, Ldefpackage/ad2;->k(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    return-void
.end method

.method public p()I
    .locals 3

    .line 1
    iget-object p0, p0, Ldefpackage/zg5;->n:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ldefpackage/re1;

    .line 4
    .line 5
    iget-object v0, p0, Ldefpackage/re1;->o:Ljava/io/PushbackInputStream;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/io/PushbackInputStream;->read()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, -0x1

    .line 12
    if-eq v0, v1, :cond_0

    .line 13
    .line 14
    const-wide/16 v1, 0x1

    .line 15
    .line 16
    invoke-virtual {p0, v1, v2}, Ldefpackage/i90;->b(J)V

    .line 17
    .line 18
    .line 19
    and-int/lit16 p0, v0, 0xff

    .line 20
    .line 21
    return p0

    .line 22
    :cond_0
    return v1
.end method

.method public q(Ljava/util/concurrent/CancellationException;)V
    .locals 5

    .line 1
    iget-object p0, p0, Ldefpackage/zg5;->n:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ldefpackage/f13;

    .line 4
    .line 5
    iget v0, p0, Ldefpackage/f13;->p:I

    .line 6
    .line 7
    new-array v1, v0, [Ldefpackage/az;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    move v3, v2

    .line 11
    :goto_0
    if-ge v3, v0, :cond_0

    .line 12
    .line 13
    iget-object v4, p0, Ldefpackage/f13;->n:[Ljava/lang/Object;

    .line 14
    .line 15
    aget-object v4, v4, v3

    .line 16
    .line 17
    check-cast v4, Ldefpackage/cd0;

    .line 18
    .line 19
    iget-object v4, v4, Ldefpackage/cd0;->b:Ldefpackage/cz;

    .line 20
    .line 21
    aput-object v4, v1, v3

    .line 22
    .line 23
    add-int/lit8 v3, v3, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    :goto_1
    if-ge v2, v0, :cond_1

    .line 27
    .line 28
    aget-object v3, v1, v2

    .line 29
    .line 30
    invoke-interface {v3, p1}, Ldefpackage/az;->r(Ljava/lang/Throwable;)Z

    .line 31
    .line 32
    .line 33
    add-int/lit8 v2, v2, 0x1

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_1
    iget p0, p0, Ldefpackage/f13;->p:I

    .line 37
    .line 38
    if-nez p0, :cond_2

    .line 39
    .line 40
    return-void

    .line 41
    :cond_2
    const-string p0, "uncancelled requests present"

    .line 42
    .line 43
    invoke-static {p0}, Ldefpackage/fz1;->c(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method public r()V
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/zg5;->n:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ldefpackage/u80;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public s(II)V
    .locals 1

    .line 1
    iget-object p0, p0, Ldefpackage/zg5;->n:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ldefpackage/nk;

    .line 4
    .line 5
    iget-object v0, p0, Ldefpackage/nk;->n:Ljava/util/List;

    .line 6
    .line 7
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iget-object v0, p0, Ldefpackage/nk;->o:Ljava/util/List;

    .line 12
    .line 13
    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    if-eqz p2, :cond_0

    .line 20
    .line 21
    iget-object p0, p0, Ldefpackage/nk;->r:Ldefpackage/pk;

    .line 22
    .line 23
    iget-object p0, p0, Ldefpackage/pk;->b:Ldefpackage/rm3;

    .line 24
    .line 25
    iget-object p0, p0, Ldefpackage/rm3;->o:Ljava/lang/Object;

    .line 26
    .line 27
    return-void

    .line 28
    :cond_0
    new-instance p0, Ljava/lang/AssertionError;

    .line 29
    .line 30
    invoke-direct {p0}, Ljava/lang/AssertionError;-><init>()V

    .line 31
    .line 32
    .line 33
    throw p0
.end method

.method public skip(J)J
    .locals 7

    .line 1
    iget-object p0, p0, Ldefpackage/zg5;->n:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ljava/io/InputStream;

    .line 4
    .line 5
    const-wide/16 v0, 0x0

    .line 6
    .line 7
    cmp-long v2, p1, v0

    .line 8
    .line 9
    if-gez v2, :cond_0

    .line 10
    .line 11
    return-wide v0

    .line 12
    :cond_0
    move-wide v2, p1

    .line 13
    :goto_0
    cmp-long v4, v2, v0

    .line 14
    .line 15
    if-lez v4, :cond_3

    .line 16
    .line 17
    invoke-virtual {p0, v2, v3}, Ljava/io/InputStream;->skip(J)J

    .line 18
    .line 19
    .line 20
    move-result-wide v4

    .line 21
    cmp-long v6, v4, v0

    .line 22
    .line 23
    if-lez v6, :cond_1

    .line 24
    .line 25
    :goto_1
    sub-long/2addr v2, v4

    .line 26
    goto :goto_0

    .line 27
    :cond_1
    invoke-virtual {p0}, Ljava/io/InputStream;->read()I

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    const/4 v5, -0x1

    .line 32
    if-ne v4, v5, :cond_2

    .line 33
    .line 34
    goto :goto_2

    .line 35
    :cond_2
    const-wide/16 v4, 0x1

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_3
    :goto_2
    sub-long/2addr p1, v2

    .line 39
    return-wide p1
.end method

.method public t()I
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/zg5;->n:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ldefpackage/nk;

    .line 4
    .line 5
    iget-object p0, p0, Ldefpackage/nk;->o:Ljava/util/List;

    .line 6
    .line 7
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public u()I
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/zg5;->n:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ldefpackage/nk;

    .line 4
    .line 5
    iget-object p0, p0, Ldefpackage/nk;->n:Ljava/util/List;

    .line 6
    .line 7
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public v(FFFF)V
    .locals 8

    .line 1
    iget-object p0, p0, Ldefpackage/zg5;->n:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ldefpackage/i61;

    .line 4
    .line 5
    invoke-virtual {p0}, Ldefpackage/i61;->g()Ldefpackage/jz;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p0}, Ldefpackage/i61;->j()J

    .line 10
    .line 11
    .line 12
    move-result-wide v1

    .line 13
    const/16 v3, 0x20

    .line 14
    .line 15
    shr-long/2addr v1, v3

    .line 16
    long-to-int v1, v1

    .line 17
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    add-float/2addr p3, p1

    .line 22
    sub-float/2addr v1, p3

    .line 23
    invoke-virtual {p0}, Ldefpackage/i61;->j()J

    .line 24
    .line 25
    .line 26
    move-result-wide v4

    .line 27
    const-wide v6, 0xffffffffL

    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    and-long/2addr v4, v6

    .line 33
    long-to-int p3, v4

    .line 34
    invoke-static {p3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 35
    .line 36
    .line 37
    move-result p3

    .line 38
    add-float/2addr p4, p2

    .line 39
    sub-float/2addr p3, p4

    .line 40
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 41
    .line 42
    .line 43
    move-result p4

    .line 44
    int-to-long v1, p4

    .line 45
    invoke-static {p3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 46
    .line 47
    .line 48
    move-result p3

    .line 49
    int-to-long p3, p3

    .line 50
    shl-long/2addr v1, v3

    .line 51
    and-long/2addr p3, v6

    .line 52
    or-long/2addr p3, v1

    .line 53
    shr-long v1, p3, v3

    .line 54
    .line 55
    long-to-int v1, v1

    .line 56
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    const/4 v2, 0x0

    .line 61
    cmpl-float v1, v1, v2

    .line 62
    .line 63
    if-ltz v1, :cond_0

    .line 64
    .line 65
    and-long v3, p3, v6

    .line 66
    .line 67
    long-to-int v1, v3

    .line 68
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    cmpl-float v1, v1, v2

    .line 73
    .line 74
    if-ltz v1, :cond_0

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_0
    const-string v1, "Width and height must be greater than or equal to zero"

    .line 78
    .line 79
    invoke-static {v1}, Ldefpackage/bz1;->a(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    :goto_0
    invoke-virtual {p0, p3, p4}, Ldefpackage/i61;->t(J)V

    .line 83
    .line 84
    .line 85
    invoke-interface {v0, p1, p2}, Ldefpackage/jz;->j(FF)V

    .line 86
    .line 87
    .line 88
    return-void
.end method

.method public w(Ldefpackage/qu2;)Z
    .locals 1

    .line 1
    iget-object p0, p0, Ldefpackage/zg5;->n:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ldefpackage/y4;

    .line 4
    .line 5
    iget-object v0, p0, Ldefpackage/y4;->p:Ldefpackage/qu2;

    .line 6
    .line 7
    if-ne p1, v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move-object v0, p1

    .line 11
    check-cast v0, Ldefpackage/en4;

    .line 12
    .line 13
    iget-object v0, v0, Ldefpackage/en4;->A:Ldefpackage/tu2;

    .line 14
    .line 15
    iget v0, v0, Ldefpackage/tu2;->a:I

    .line 16
    .line 17
    iput v0, p0, Ldefpackage/y4;->L:I

    .line 18
    .line 19
    iget-object p0, p0, Ldefpackage/y4;->r:Ldefpackage/fv2;

    .line 20
    .line 21
    if-eqz p0, :cond_1

    .line 22
    .line 23
    invoke-interface {p0, p1}, Ldefpackage/fv2;->w(Ldefpackage/qu2;)Z

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    return p0

    .line 28
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 29
    return p0
.end method

.method public varargs x([Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .line 1
    array-length v0, p1

    .line 2
    const-string v1, ""

    .line 3
    .line 4
    const/4 v2, 0x0

    .line 5
    :goto_0
    if-ge v2, v0, :cond_2

    .line 6
    .line 7
    aget-object v3, p1, v2

    .line 8
    .line 9
    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result v4

    .line 13
    if-nez v4, :cond_1

    .line 14
    .line 15
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    if-eqz v4, :cond_0

    .line 20
    .line 21
    move-object v1, v3

    .line 22
    goto :goto_1

    .line 23
    :cond_0
    iget-object v4, p0, Ldefpackage/zg5;->n:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v4, Landroid/content/res/Resources;

    .line 26
    .line 27
    const v5, 0x7f130139

    .line 28
    .line 29
    .line 30
    filled-new-array {v1, v3}, [Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-virtual {v4, v5, v1}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    :cond_1
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_2
    return-object v1
.end method

.method public y(Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/16 v0, 0x8

    .line 8
    .line 9
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 10
    .line 11
    .line 12
    :cond_0
    iget-object p0, p0, Ldefpackage/zg5;->n:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p0, Ldefpackage/fr;

    .line 15
    .line 16
    const/4 p1, 0x0

    .line 17
    invoke-virtual {p0, p1}, Ldefpackage/fr;->a(I)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public z()V
    .locals 4

    .line 1
    iget-object p0, p0, Ldefpackage/zg5;->n:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ldefpackage/f13;

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    iget v1, p0, Ldefpackage/f13;->p:I

    .line 7
    .line 8
    invoke-static {v0, v1}, Ldefpackage/gb;->g0(II)Ldefpackage/j02;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget v1, v0, Ldefpackage/h02;->n:I

    .line 13
    .line 14
    iget v0, v0, Ldefpackage/h02;->o:I

    .line 15
    .line 16
    if-gt v1, v0, :cond_0

    .line 17
    .line 18
    :goto_0
    iget-object v2, p0, Ldefpackage/f13;->n:[Ljava/lang/Object;

    .line 19
    .line 20
    aget-object v2, v2, v1

    .line 21
    .line 22
    check-cast v2, Ldefpackage/cd0;

    .line 23
    .line 24
    iget-object v2, v2, Ldefpackage/cd0;->b:Ldefpackage/cz;

    .line 25
    .line 26
    sget-object v3, Ldefpackage/j15;->a:Ldefpackage/j15;

    .line 27
    .line 28
    invoke-virtual {v2, v3}, Ldefpackage/cz;->resumeWith(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    if-eq v1, v0, :cond_0

    .line 32
    .line 33
    add-int/lit8 v1, v1, 0x1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    invoke-virtual {p0}, Ldefpackage/f13;->g()V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
