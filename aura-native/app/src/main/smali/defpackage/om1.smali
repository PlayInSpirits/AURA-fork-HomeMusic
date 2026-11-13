.class public final Ldefpackage/om1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/ca4;
.implements Ldefpackage/bi0;
.implements Ldefpackage/zy3;
.implements Ldefpackage/ka5;
.implements Ldefpackage/kg1;
.implements Ldefpackage/lm3;
.implements Lretrofit2/Callback;
.implements Ldefpackage/sq3;
.implements Ldefpackage/s21;
.implements Ldefpackage/ep3;
.implements Ldefpackage/u74;
.implements Ldefpackage/sn4;
.implements Ldefpackage/b5;


# instance fields
.field public final synthetic n:I

.field public o:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(CI)V
    .locals 0

    .line 56
    iput p2, p0, Ldefpackage/om1;->n:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    const/16 v0, 0xe

    iput v0, p0, Ldefpackage/om1;->n:I

    .line 73
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 74
    new-array p1, p1, [I

    invoke-static {p1}, Ldefpackage/ya4;->a(Ljava/lang/Object;)Ldefpackage/nl4;

    move-result-object p1

    iput-object p1, p0, Ldefpackage/om1;->o:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(IB)V
    .locals 0

    .line 1
    iput p1, p0, Ldefpackage/om1;->n:I

    .line 2
    .line 3
    sparse-switch p1, :sswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 10
    .line 11
    invoke-static {p1}, Ldefpackage/uc5;->B(Ljava/lang/Object;)Ldefpackage/zd3;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iput-object p1, p0, Ldefpackage/om1;->o:Ljava/lang/Object;

    .line 16
    .line 17
    return-void

    .line 18
    :sswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    .line 20
    .line 21
    new-instance p1, Ldefpackage/om0;

    .line 22
    .line 23
    const/4 p2, 0x1

    .line 24
    invoke-direct {p1, p2}, Ldefpackage/om0;-><init>(I)V

    .line 25
    .line 26
    .line 27
    iput-object p1, p0, Ldefpackage/om1;->o:Ljava/lang/Object;

    .line 28
    .line 29
    return-void

    .line 30
    :sswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    .line 32
    .line 33
    new-instance p1, Ljava/util/HashMap;

    .line 34
    .line 35
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 36
    .line 37
    .line 38
    iput-object p1, p0, Ldefpackage/om1;->o:Ljava/lang/Object;

    .line 39
    .line 40
    return-void

    .line 41
    :sswitch_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    .line 43
    .line 44
    invoke-static {}, Lcom/eddyizm/tempus/database/AppDatabase;->y()Lcom/eddyizm/tempus/database/AppDatabase;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-virtual {p1}, Lcom/eddyizm/tempus/database/AppDatabase;->A()Ldefpackage/rf2;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    iput-object p1, p0, Ldefpackage/om1;->o:Ljava/lang/Object;

    .line 53
    .line 54
    return-void

    :sswitch_data_0
    .sparse-switch
        0x5 -> :sswitch_2
        0xc -> :sswitch_1
        0x1b -> :sswitch_0
    .end sparse-switch
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 55
    iput p1, p0, Ldefpackage/om1;->n:I

    iput-object p2, p0, Ldefpackage/om1;->o:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/net/Uri;Landroid/content/ClipDescription;Landroid/net/Uri;)V
    .locals 2

    const/4 v0, 0x2

    iput v0, p0, Ldefpackage/om1;->n:I

    .line 69
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 70
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x19

    if-lt v0, v1, :cond_0

    .line 71
    new-instance v0, Ldefpackage/mz1;

    invoke-direct {v0, p1, p2, p3}, Ldefpackage/mz1;-><init>(Landroid/net/Uri;Landroid/content/ClipDescription;Landroid/net/Uri;)V

    iput-object v0, p0, Ldefpackage/om1;->o:Ljava/lang/Object;

    goto :goto_0

    .line 72
    :cond_0
    new-instance v0, Ldefpackage/c12;

    const/4 v1, 0x6

    invoke-direct {v0, p1, p2, p3, v1}, Ldefpackage/c12;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    iput-object v0, p0, Ldefpackage/om1;->o:Ljava/lang/Object;

    :goto_0
    return-void
.end method

.method public constructor <init>(Landroid/view/View;)V
    .locals 2

    const/16 v0, 0x1a

    iput v0, p0, Ldefpackage/om1;->n:I

    .line 57
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 58
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    .line 59
    new-instance v0, Ldefpackage/yh4;

    .line 60
    invoke-direct {v0, p1}, Ldefpackage/sg3;-><init>(Landroid/view/View;)V

    .line 61
    iput-object p1, v0, Ldefpackage/yh4;->b:Landroid/view/View;

    .line 62
    iput-object v0, p0, Ldefpackage/om1;->o:Ljava/lang/Object;

    goto :goto_0

    .line 63
    :cond_0
    new-instance v0, Ldefpackage/sg3;

    invoke-direct {v0, p1}, Ldefpackage/sg3;-><init>(Landroid/view/View;)V

    iput-object v0, p0, Ldefpackage/om1;->o:Ljava/lang/Object;

    :goto_0
    return-void
.end method

.method public constructor <init>(Landroid/view/WindowInsetsController;)V
    .locals 2

    const/16 v0, 0x1a

    iput v0, p0, Ldefpackage/om1;->n:I

    .line 64
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 65
    new-instance v0, Ldefpackage/yh4;

    const/4 v1, 0x0

    .line 66
    invoke-direct {v0, v1}, Ldefpackage/sg3;-><init>(Landroid/view/View;)V

    .line 67
    iput-object p1, v0, Ldefpackage/yh4;->c:Landroid/view/WindowInsetsController;

    .line 68
    iput-object v0, p0, Ldefpackage/om1;->o:Ljava/lang/Object;

    return-void
.end method

.method private final i(Lretrofit2/Call;Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public a()Ldefpackage/cv3;
    .locals 5

    .line 1
    iget-object p0, p0, Ldefpackage/om1;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ldefpackage/gv3;

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    move-object v1, v0

    .line 7
    :goto_0
    iget-object v2, p0, Ldefpackage/gv3;->x:Ldefpackage/hy;

    .line 8
    .line 9
    invoke-virtual {v2}, Ldefpackage/hy;->m()Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-nez v2, :cond_6

    .line 14
    .line 15
    :try_start_0
    invoke-virtual {p0}, Ldefpackage/gv3;->w()Ldefpackage/q34;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-interface {v2}, Ldefpackage/q34;->c()Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-nez v3, :cond_3

    .line 24
    .line 25
    invoke-interface {v2}, Ldefpackage/q34;->f()Ldefpackage/p34;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    iget-object v4, v3, Ldefpackage/p34;->b:Ldefpackage/q34;

    .line 30
    .line 31
    if-nez v4, :cond_0

    .line 32
    .line 33
    iget-object v4, v3, Ldefpackage/p34;->c:Ljava/lang/Throwable;

    .line 34
    .line 35
    if-nez v4, :cond_0

    .line 36
    .line 37
    const/4 v4, 0x1

    .line 38
    goto :goto_1

    .line 39
    :cond_0
    const/4 v4, 0x0

    .line 40
    :goto_1
    if-eqz v4, :cond_1

    .line 41
    .line 42
    invoke-interface {v2}, Ldefpackage/q34;->g()Ldefpackage/p34;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    goto :goto_2

    .line 47
    :catch_0
    move-exception v2

    .line 48
    goto :goto_3

    .line 49
    :cond_1
    :goto_2
    iget-object v4, v3, Ldefpackage/p34;->b:Ldefpackage/q34;

    .line 50
    .line 51
    iget-object v3, v3, Ldefpackage/p34;->c:Ljava/lang/Throwable;

    .line 52
    .line 53
    if-nez v3, :cond_2

    .line 54
    .line 55
    if-eqz v4, :cond_3

    .line 56
    .line 57
    iget-object v2, p0, Ldefpackage/gv3;->B:Ldefpackage/ii;

    .line 58
    .line 59
    invoke-virtual {v2, v4}, Ldefpackage/ii;->addFirst(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_2
    throw v3

    .line 64
    :cond_3
    invoke-interface {v2}, Ldefpackage/q34;->e()Ldefpackage/cv3;

    .line 65
    .line 66
    .line 67
    move-result-object p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 68
    return-object p0

    .line 69
    :goto_3
    if-nez v1, :cond_4

    .line 70
    .line 71
    move-object v1, v2

    .line 72
    goto :goto_4

    .line 73
    :cond_4
    invoke-static {v1, v2}, Ldefpackage/j51;->d(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 74
    .line 75
    .line 76
    :goto_4
    invoke-virtual {p0, v0}, Ldefpackage/gv3;->m(Ldefpackage/cv3;)Z

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    if-eqz v2, :cond_5

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_5
    throw v1

    .line 84
    :cond_6
    const-string p0, "Canceled"

    .line 85
    .line 86
    invoke-static {p0}, Ldefpackage/mj0;->i(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    return-object v0
.end method

.method public accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget-object p0, p0, Ldefpackage/om1;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ldefpackage/qh1;

    .line 4
    .line 5
    check-cast p1, Ldefpackage/p14;

    .line 6
    .line 7
    check-cast p2, Ldefpackage/cr4;

    .line 8
    .line 9
    new-instance v0, Ldefpackage/w02;

    .line 10
    .line 11
    invoke-direct {v0, p2}, Ldefpackage/w02;-><init>(Ldefpackage/cr4;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, Lcom/google/android/gms/common/internal/a;->e()Landroid/os/IInterface;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, Ldefpackage/cv1;

    .line 19
    .line 20
    check-cast p1, Ldefpackage/av1;

    .line 21
    .line 22
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    const-string v1, "com.google.android.gms.auth.blockstore.restorecredential.internal.IRestoreCredentialService"

    .line 27
    .line 28
    invoke-virtual {p2, v1}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    sget v1, Ldefpackage/yh5;->a:I

    .line 32
    .line 33
    const/4 v1, 0x1

    .line 34
    invoke-virtual {p2, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 35
    .line 36
    .line 37
    const/4 v1, 0x0

    .line 38
    invoke-virtual {p0, p2, v1}, Ldefpackage/qh1;->writeToParcel(Landroid/os/Parcel;I)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p2, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 42
    .line 43
    .line 44
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    :try_start_0
    iget-object p1, p1, Ldefpackage/av1;->e:Landroid/os/IBinder;

    .line 49
    .line 50
    const/4 v0, 0x2

    .line 51
    invoke-interface {p1, v0, p2, p0, v1}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0}, Landroid/os/Parcel;->readException()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 55
    .line 56
    .line 57
    invoke-virtual {p2}, Landroid/os/Parcel;->recycle()V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0}, Landroid/os/Parcel;->recycle()V

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    :catchall_0
    move-exception p1

    .line 65
    invoke-virtual {p2}, Landroid/os/Parcel;->recycle()V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0}, Landroid/os/Parcel;->recycle()V

    .line 69
    .line 70
    .line 71
    throw p1
.end method

.method public c()V
    .locals 1

    .line 1
    const-string p0, "DIAGNOSTIC_PROFILE_IS_COMPRESSED"

    .line 2
    .line 3
    const-string v0, "ProfileInstaller"

    .line 4
    .line 5
    invoke-static {v0, p0}, Landroid/util/Ldefpackage/og;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public d()Ldefpackage/r34;
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/om1;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ldefpackage/gv3;

    .line 4
    .line 5
    return-object p0
.end method

.method public e(ILjava/lang/Object;)V
    .locals 3

    .line 1
    packed-switch p1, :pswitch_data_0

    .line 2
    .line 3
    .line 4
    :pswitch_0
    const-string v0, ""

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :pswitch_1
    const-string v0, "RESULT_DELETE_SKIP_FILE_SUCCESS"

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :pswitch_2
    const-string v0, "RESULT_INSTALL_SKIP_FILE_SUCCESS"

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :pswitch_3
    const-string v0, "RESULT_PARSE_EXCEPTION"

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :pswitch_4
    const-string v0, "RESULT_IO_EXCEPTION"

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :pswitch_5
    const-string v0, "RESULT_BASELINE_PROFILE_NOT_FOUND"

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :pswitch_6
    const-string v0, "RESULT_DESIRED_FORMAT_UNSUPPORTED"

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :pswitch_7
    const-string v0, "RESULT_NOT_WRITABLE"

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :pswitch_8
    const-string v0, "RESULT_UNSUPPORTED_ART_VERSION"

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :pswitch_9
    const-string v0, "RESULT_ALREADY_INSTALLED"

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :pswitch_a
    const-string v0, "RESULT_INSTALL_SUCCESS"

    .line 35
    .line 36
    :goto_0
    const/4 v1, 0x6

    .line 37
    const-string v2, "ProfileInstaller"

    .line 38
    .line 39
    if-eq p1, v1, :cond_0

    .line 40
    .line 41
    const/4 v1, 0x7

    .line 42
    if-eq p1, v1, :cond_0

    .line 43
    .line 44
    const/16 v1, 0x8

    .line 45
    .line 46
    if-eq p1, v1, :cond_0

    .line 47
    .line 48
    invoke-static {v2, v0}, Landroid/util/Ldefpackage/og;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 49
    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_0
    check-cast p2, Ljava/lang/Throwable;

    .line 53
    .line 54
    invoke-static {v2, v0, p2}, Landroid/util/Ldefpackage/og;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 55
    .line 56
    .line 57
    :goto_1
    iget-object p0, p0, Ldefpackage/om1;->o:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast p0, Landroidx/profileinstaller/ProfileInstallReceiver;

    .line 60
    .line 61
    invoke-virtual {p0, p1}, Landroid/content/BroadcastReceiver;->setResultCode(I)V

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public f(Ldefpackage/e10;Ldefpackage/wd0;)V
    .locals 4

    .line 1
    instance-of v0, p2, Ldefpackage/z73;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Ldefpackage/z73;

    .line 7
    .line 8
    iget v1, v0, Ldefpackage/z73;->p:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Ldefpackage/z73;->p:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Ldefpackage/z73;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Ldefpackage/z73;-><init>(Ldefpackage/om1;Ldefpackage/wd0;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Ldefpackage/z73;->n:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Ldefpackage/z73;->p:I

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    if-eq v1, v2, :cond_1

    .line 33
    .line 34
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 35
    .line 36
    invoke-static {p0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_1
    invoke-static {p2}, Ldefpackage/kb4;->X(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    invoke-static {}, Ldefpackage/er1;->a()V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_2
    invoke-static {p2}, Ldefpackage/kb4;->X(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iget-object p0, p0, Ldefpackage/om1;->o:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast p0, Ldefpackage/nl4;

    .line 53
    .line 54
    iput v2, v0, Ldefpackage/z73;->p:I

    .line 55
    .line 56
    invoke-virtual {p0, p1, v0}, Ldefpackage/nl4;->a(Ldefpackage/q81;Ldefpackage/vd0;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    return-void
.end method

.method public g()V
    .locals 3

    .line 1
    iget-object v0, p0, Ldefpackage/om1;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ldefpackage/sl3;

    .line 4
    .line 5
    invoke-virtual {v0}, Ldefpackage/kc1;->y()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, Ldefpackage/kc1;->n()Landroid/content/Context;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-virtual {v0}, Ldefpackage/kc1;->X()Ldefpackage/nc1;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    new-instance v1, Ldefpackage/ql3;

    .line 22
    .line 23
    const/4 v2, 0x0

    .line 24
    invoke-direct {v1, p0, v2}, Ldefpackage/ql3;-><init>(Ldefpackage/om1;I)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 28
    .line 29
    .line 30
    :cond_0
    return-void
.end method

.method public h(Ljava/lang/Object;)V
    .locals 6

    .line 1
    check-cast p1, Ldefpackage/bj2;

    .line 2
    .line 3
    iget-object v0, p0, Ldefpackage/om1;->o:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Ldefpackage/li3;

    .line 6
    .line 7
    sget-object v1, Ldefpackage/bo2;->a:Ljava/lang/ref/WeakReference;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    check-cast v1, Ldefpackage/bj2;

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    const/4 v3, 0x1

    .line 17
    const/4 v4, 0x3

    .line 18
    const/4 v5, 0x0

    .line 19
    if-eq v1, p1, :cond_2

    .line 20
    .line 21
    new-instance v1, Ldefpackage/j52;

    .line 22
    .line 23
    invoke-direct {v1, v3, p0}, Ldefpackage/j52;-><init>(ILjava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1, v1}, Ldefpackage/sk2;->v(Ldefpackage/oi3;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1}, Ldefpackage/sk2;->a()Ldefpackage/gn2;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    if-eqz p0, :cond_0

    .line 34
    .line 35
    invoke-virtual {p1}, Ldefpackage/sk2;->a()Ldefpackage/gn2;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    iget-object v5, p0, Ldefpackage/gn2;->a:Ljava/lang/String;

    .line 40
    .line 41
    :cond_0
    invoke-virtual {p1}, Ldefpackage/sk2;->g()I

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    if-ne p0, v4, :cond_1

    .line 46
    .line 47
    invoke-virtual {p1}, Ldefpackage/sk2;->q()Z

    .line 48
    .line 49
    .line 50
    move-result p0

    .line 51
    if-eqz p0, :cond_1

    .line 52
    .line 53
    move v2, v3

    .line 54
    :cond_1
    invoke-virtual {v0, v5, v2}, Ldefpackage/li3;->c(Ljava/lang/String;Z)V

    .line 55
    .line 56
    .line 57
    new-instance p0, Ljava/lang/ref/WeakReference;

    .line 58
    .line 59
    invoke-direct {p0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    sput-object p0, Ldefpackage/bo2;->a:Ljava/lang/ref/WeakReference;

    .line 63
    .line 64
    return-void

    .line 65
    :cond_2
    invoke-virtual {p1}, Ldefpackage/sk2;->a()Ldefpackage/gn2;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    if-eqz p0, :cond_3

    .line 70
    .line 71
    invoke-virtual {p1}, Ldefpackage/sk2;->a()Ldefpackage/gn2;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    iget-object v5, p0, Ldefpackage/gn2;->a:Ljava/lang/String;

    .line 76
    .line 77
    :cond_3
    invoke-virtual {p1}, Ldefpackage/sk2;->g()I

    .line 78
    .line 79
    .line 80
    move-result p0

    .line 81
    if-ne p0, v4, :cond_4

    .line 82
    .line 83
    invoke-virtual {p1}, Ldefpackage/sk2;->q()Z

    .line 84
    .line 85
    .line 86
    move-result p0

    .line 87
    if-eqz p0, :cond_4

    .line 88
    .line 89
    move v2, v3

    .line 90
    :cond_4
    invoke-virtual {v0, v5, v2}, Ldefpackage/li3;->c(Ljava/lang/String;Z)V

    .line 91
    .line 92
    .line 93
    return-void
.end method

.method public j(Ldefpackage/da4;)V
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/om1;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ldefpackage/pm1;

    .line 4
    .line 5
    iget-object p1, p0, Ldefpackage/pm1;->D:Ldefpackage/mo2;

    .line 6
    .line 7
    invoke-interface {p1, p0}, Ldefpackage/ca4;->j(Ldefpackage/da4;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public k()V
    .locals 11

    .line 1
    iget-object p0, p0, Ldefpackage/om1;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ldefpackage/pm1;

    .line 4
    .line 5
    iget v0, p0, Ldefpackage/pm1;->E:I

    .line 6
    .line 7
    add-int/lit8 v0, v0, -0x1

    .line 8
    .line 9
    iput v0, p0, Ldefpackage/pm1;->E:I

    .line 10
    .line 11
    if-lez v0, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    iget-object v0, p0, Ldefpackage/pm1;->G:[Ldefpackage/ln1;

    .line 15
    .line 16
    array-length v1, v0

    .line 17
    const/4 v2, 0x0

    .line 18
    move v3, v2

    .line 19
    move v4, v3

    .line 20
    :goto_0
    if-ge v3, v1, :cond_1

    .line 21
    .line 22
    aget-object v5, v0, v3

    .line 23
    .line 24
    invoke-virtual {v5}, Ldefpackage/ln1;->v()V

    .line 25
    .line 26
    .line 27
    iget-object v5, v5, Ldefpackage/ln1;->V:Ldefpackage/tv4;

    .line 28
    .line 29
    iget v5, v5, Ldefpackage/tv4;->a:I

    .line 30
    .line 31
    add-int/2addr v4, v5

    .line 32
    add-int/lit8 v3, v3, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    new-array v0, v4, [Ldefpackage/sv4;

    .line 36
    .line 37
    iget-object v1, p0, Ldefpackage/pm1;->G:[Ldefpackage/ln1;

    .line 38
    .line 39
    array-length v3, v1

    .line 40
    move v4, v2

    .line 41
    move v5, v4

    .line 42
    :goto_1
    if-ge v4, v3, :cond_3

    .line 43
    .line 44
    aget-object v6, v1, v4

    .line 45
    .line 46
    invoke-virtual {v6}, Ldefpackage/ln1;->v()V

    .line 47
    .line 48
    .line 49
    iget-object v7, v6, Ldefpackage/ln1;->V:Ldefpackage/tv4;

    .line 50
    .line 51
    iget v7, v7, Ldefpackage/tv4;->a:I

    .line 52
    .line 53
    move v8, v2

    .line 54
    :goto_2
    if-ge v8, v7, :cond_2

    .line 55
    .line 56
    add-int/lit8 v9, v5, 0x1

    .line 57
    .line 58
    invoke-virtual {v6}, Ldefpackage/ln1;->v()V

    .line 59
    .line 60
    .line 61
    iget-object v10, v6, Ldefpackage/ln1;->V:Ldefpackage/tv4;

    .line 62
    .line 63
    invoke-virtual {v10, v8}, Ldefpackage/tv4;->a(I)Ldefpackage/sv4;

    .line 64
    .line 65
    .line 66
    move-result-object v10

    .line 67
    aput-object v10, v0, v5

    .line 68
    .line 69
    add-int/lit8 v8, v8, 0x1

    .line 70
    .line 71
    move v5, v9

    .line 72
    goto :goto_2

    .line 73
    :cond_2
    add-int/lit8 v4, v4, 0x1

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_3
    new-instance v1, Ldefpackage/tv4;

    .line 77
    .line 78
    invoke-direct {v1, v0}, Ldefpackage/tv4;-><init>([Ldefpackage/sv4;)V

    .line 79
    .line 80
    .line 81
    iput-object v1, p0, Ldefpackage/pm1;->F:Ldefpackage/tv4;

    .line 82
    .line 83
    iget-object v0, p0, Ldefpackage/pm1;->D:Ldefpackage/mo2;

    .line 84
    .line 85
    invoke-interface {v0, p0}, Ldefpackage/mo2;->b(Ldefpackage/no2;)V

    .line 86
    .line 87
    .line 88
    return-void
.end method

.method public l(Ljava/lang/Object;)V
    .locals 4

    .line 1
    iget-object p0, p0, Ldefpackage/om1;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/service/media/MediaBrowserService$Result;

    .line 4
    .line 5
    instance-of v0, p1, Ljava/util/List;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    check-cast p1, Ljava/util/List;

    .line 11
    .line 12
    new-instance v0, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 19
    .line 20
    .line 21
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-eqz v2, :cond_0

    .line 30
    .line 31
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    check-cast v2, Landroid/os/Parcel;

    .line 36
    .line 37
    invoke-virtual {v2, v1}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 38
    .line 39
    .line 40
    sget-object v3, Landroid/media/browse/MediaBrowser$MediaItem;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 41
    .line 42
    invoke-interface {v3, v2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    check-cast v3, Landroid/media/browse/MediaBrowser$MediaItem;

    .line 47
    .line 48
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_0
    invoke-virtual {p0, v0}, Landroid/service/media/MediaBrowserService$Result;->sendResult(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_1
    instance-of v0, p1, Landroid/os/Parcel;

    .line 60
    .line 61
    if-eqz v0, :cond_2

    .line 62
    .line 63
    check-cast p1, Landroid/os/Parcel;

    .line 64
    .line 65
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 66
    .line 67
    .line 68
    sget-object v0, Landroid/media/browse/MediaBrowser$MediaItem;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 69
    .line 70
    invoke-interface {v0, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-virtual {p0, v0}, Landroid/service/media/MediaBrowserService$Result;->sendResult(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p1}, Landroid/os/Parcel;->recycle()V

    .line 78
    .line 79
    .line 80
    return-void

    .line 81
    :cond_2
    const/4 p1, 0x0

    .line 82
    invoke-virtual {p0, p1}, Landroid/service/media/MediaBrowserService$Result;->sendResult(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    return-void
.end method

.method public m()Ldefpackage/ci0;
    .locals 1

    .line 1
    new-instance v0, Ldefpackage/j6;

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/om1;->o:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Ldefpackage/bl0;

    .line 6
    .line 7
    invoke-virtual {p0}, Ldefpackage/bl0;->m()Ldefpackage/ci0;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-direct {v0, p0}, Ldefpackage/j6;-><init>(Ldefpackage/ci0;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method public n(Ldefpackage/df;Lcom/google/android/material/appbar/MaterialToolbar;)V
    .locals 2

    .line 1
    iget-object p0, p0, Ldefpackage/om1;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ldefpackage/ss0;

    .line 4
    .line 5
    iget-object p0, p0, Ldefpackage/ss0;->p:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Landroidx/drawerlayout/widget/DrawerLayout;

    .line 8
    .line 9
    invoke-virtual {p1}, Ldefpackage/df;->getResources()Landroid/content/res/Resources;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget v0, v0, Landroid/content/res/Configuration;->orientation:I

    .line 18
    .line 19
    const/4 v1, 0x2

    .line 20
    if-ne v0, v1, :cond_0

    .line 21
    .line 22
    new-instance v0, Ldefpackage/k4;

    .line 23
    .line 24
    invoke-direct {v0, p1, p0, p2}, Ldefpackage/k4;-><init>(Ldefpackage/df;Landroidx/drawerlayout/widget/DrawerLayout;Landroidx/appcompat/widget/Toolbar;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, v0}, Landroidx/drawerlayout/widget/DrawerLayout;->a(Ldefpackage/gw0;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Ldefpackage/k4;->e()V

    .line 31
    .line 32
    .line 33
    :cond_0
    return-void
.end method

.method public o(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    const-string p0, "MediaManager"

    .line 2
    .line 3
    const-string v0, "Failed to get MediaBrowser instance"

    .line 4
    .line 5
    invoke-static {p0, v0, p1}, Landroid/util/Ldefpackage/og;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public onFailure(Lretrofit2/Call;Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    iget p1, p0, Ldefpackage/om1;->n:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    :pswitch_0
    iget-object p0, p0, Ldefpackage/om1;->o:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Ldefpackage/nb4;

    .line 9
    .line 10
    new-instance p1, Ljava/lang/Exception;

    .line 11
    .line 12
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    invoke-direct {p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, p1}, Ldefpackage/nb4;->onError(Ljava/lang/Exception;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :pswitch_1
    iget-object p0, p0, Ldefpackage/om1;->o:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast p0, Ldefpackage/eu3;

    .line 26
    .line 27
    invoke-virtual {p0}, Ldefpackage/kc1;->y()Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-eqz p1, :cond_1

    .line 32
    .line 33
    iget-object p1, p0, Ldefpackage/eu3;->J0:Ldefpackage/w12;

    .line 34
    .line 35
    if-nez p1, :cond_0

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    iget-object p1, p1, Ldefpackage/w12;->h:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p1, Landroid/widget/ProgressBar;

    .line 41
    .line 42
    const/16 v0, 0x8

    .line 43
    .line 44
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 45
    .line 46
    .line 47
    iget-object p1, p0, Ldefpackage/eu3;->J0:Ldefpackage/w12;

    .line 48
    .line 49
    iget-object p1, p1, Ldefpackage/w12;->d:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast p1, Landroid/widget/TextView;

    .line 52
    .line 53
    const/4 v0, 0x0

    .line 54
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0}, Ldefpackage/kc1;->Z()Landroid/content/Context;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p2

    .line 65
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p2

    .line 69
    const v1, 0x7f13043a

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0, v1, p2}, Ldefpackage/kc1;->t(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    invoke-static {p1, p0, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 81
    .line 82
    .line 83
    :cond_1
    :goto_0
    return-void

    .line 84
    :pswitch_2
    iget-object p0, p0, Ldefpackage/om1;->o:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast p0, Ldefpackage/xm3;

    .line 87
    .line 88
    new-instance p1, Ljava/lang/StringBuilder;

    .line 89
    .line 90
    const-string v0, "Network error: "

    .line 91
    .line 92
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    invoke-virtual {p0, p1}, Ldefpackage/xm3;->c(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    const-string p0, "PodcastChannelEditorViewModel"

    .line 110
    .line 111
    const-string p1, "Network error"

    .line 112
    .line 113
    invoke-static {p0, p1, p2}, Landroid/util/Ldefpackage/og;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 114
    .line 115
    .line 116
    :pswitch_3
    return-void

    .line 117
    :pswitch_data_0
    .packed-switch 0x12
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public onQueryTextChange(Ljava/lang/String;)Z
    .locals 1

    .line 1
    iget-object p0, p0, Ldefpackage/om1;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/SettingsFragment;

    .line 4
    .line 5
    invoke-virtual {p0}, Ldefpackage/kc1;->m()Ldefpackage/ld1;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const v0, 0x7f0a056e

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Ldefpackage/ld1;->C(I)Ldefpackage/kc1;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Ldefpackage/vb4;

    .line 17
    .line 18
    if-eqz p0, :cond_0

    .line 19
    .line 20
    invoke-static {p1}, Ldefpackage/g12;->I(Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    iput-object p1, p0, Ldefpackage/vb4;->D0:Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {p0}, Ldefpackage/vb4;->l0()V

    .line 31
    .line 32
    .line 33
    :cond_0
    const/4 p0, 0x1

    .line 34
    return p0
.end method

.method public onQueryTextSubmit(Ljava/lang/String;)Z
    .locals 1

    .line 1
    iget-object p0, p0, Ldefpackage/om1;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/SettingsFragment;

    .line 4
    .line 5
    invoke-virtual {p0}, Ldefpackage/kc1;->m()Ldefpackage/ld1;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const v0, 0x7f0a056e

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Ldefpackage/ld1;->C(I)Ldefpackage/kc1;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Ldefpackage/vb4;

    .line 17
    .line 18
    if-eqz p0, :cond_0

    .line 19
    .line 20
    invoke-static {p1}, Ldefpackage/g12;->I(Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    iput-object p1, p0, Ldefpackage/vb4;->D0:Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {p0}, Ldefpackage/vb4;->l0()V

    .line 31
    .line 32
    .line 33
    :cond_0
    const/4 p0, 0x1

    .line 34
    return p0
.end method

.method public onResponse(Lretrofit2/Call;Lretrofit2/Response;)V
    .locals 2

    .line 1
    iget p1, p0, Ldefpackage/om1;->n:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    :pswitch_0
    iget-object p0, p0, Ldefpackage/om1;->o:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Ldefpackage/nb4;

    .line 9
    .line 10
    invoke-virtual {p2}, Lretrofit2/Response;->isSuccessful()Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    if-eqz p1, :cond_1

    .line 15
    .line 16
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    if-eqz p1, :cond_1

    .line 21
    .line 22
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    check-cast p1, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;

    .line 27
    .line 28
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;->getSubsonicResponse()Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    if-eqz p1, :cond_1

    .line 33
    .line 34
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    check-cast p1, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;

    .line 39
    .line 40
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;->getSubsonicResponse()Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->getError()Lcom/eddyizm/tempus/subsonic/models/Error;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    if-eqz p1, :cond_0

    .line 49
    .line 50
    new-instance p1, Ljava/lang/Exception;

    .line 51
    .line 52
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p2

    .line 56
    check-cast p2, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;

    .line 57
    .line 58
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;->getSubsonicResponse()Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;

    .line 59
    .line 60
    .line 61
    move-result-object p2

    .line 62
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->getError()Lcom/eddyizm/tempus/subsonic/models/Error;

    .line 63
    .line 64
    .line 65
    move-result-object p2

    .line 66
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/Error;->getMessage()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p2

    .line 70
    invoke-direct {p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0, p1}, Ldefpackage/nb4;->onError(Ljava/lang/Exception;)V

    .line 74
    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_0
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    check-cast p1, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;

    .line 82
    .line 83
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;->getSubsonicResponse()Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->getScanStatus()Lcom/eddyizm/tempus/subsonic/models/ScanStatus;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    if-eqz p1, :cond_1

    .line 92
    .line 93
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    check-cast p1, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;

    .line 98
    .line 99
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;->getSubsonicResponse()Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->getScanStatus()Lcom/eddyizm/tempus/subsonic/models/ScanStatus;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/ScanStatus;->isScanning()Z

    .line 108
    .line 109
    .line 110
    move-result p1

    .line 111
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object p2

    .line 115
    check-cast p2, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;

    .line 116
    .line 117
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;->getSubsonicResponse()Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;

    .line 118
    .line 119
    .line 120
    move-result-object p2

    .line 121
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->getScanStatus()Lcom/eddyizm/tempus/subsonic/models/ScanStatus;

    .line 122
    .line 123
    .line 124
    move-result-object p2

    .line 125
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/ScanStatus;->getCount()Ljava/lang/Long;

    .line 126
    .line 127
    .line 128
    move-result-object p2

    .line 129
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    .line 130
    .line 131
    .line 132
    move-result-wide v0

    .line 133
    invoke-virtual {p0, p1, v0, v1}, Ldefpackage/nb4;->onSuccess(ZJ)V

    .line 134
    .line 135
    .line 136
    :cond_1
    :goto_0
    return-void

    .line 137
    :pswitch_1
    iget-object p0, p0, Ldefpackage/om1;->o:Ljava/lang/Object;

    .line 138
    .line 139
    check-cast p0, Ldefpackage/eu3;

    .line 140
    .line 141
    invoke-virtual {p0}, Ldefpackage/kc1;->y()Z

    .line 142
    .line 143
    .line 144
    move-result p1

    .line 145
    if-eqz p1, :cond_4

    .line 146
    .line 147
    iget-object p1, p0, Ldefpackage/eu3;->J0:Ldefpackage/w12;

    .line 148
    .line 149
    if-nez p1, :cond_2

    .line 150
    .line 151
    goto :goto_1

    .line 152
    :cond_2
    iget-object p1, p1, Ldefpackage/w12;->h:Ljava/lang/Object;

    .line 153
    .line 154
    check-cast p1, Landroid/widget/ProgressBar;

    .line 155
    .line 156
    const/16 v0, 0x8

    .line 157
    .line 158
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {p2}, Lretrofit2/Response;->isSuccessful()Z

    .line 162
    .line 163
    .line 164
    move-result p1

    .line 165
    const/4 v1, 0x0

    .line 166
    if-eqz p1, :cond_3

    .line 167
    .line 168
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object p1

    .line 172
    if-eqz p1, :cond_3

    .line 173
    .line 174
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object p1

    .line 178
    check-cast p1, Ljava/util/List;

    .line 179
    .line 180
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 181
    .line 182
    .line 183
    move-result p1

    .line 184
    if-nez p1, :cond_3

    .line 185
    .line 186
    iget-object p1, p0, Ldefpackage/eu3;->L0:Ldefpackage/zd0;

    .line 187
    .line 188
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object p2

    .line 192
    check-cast p2, Ljava/util/List;

    .line 193
    .line 194
    iput-object p2, p1, Ldefpackage/zd0;->r:Ljava/util/List;

    .line 195
    .line 196
    invoke-virtual {p1}, Ldefpackage/dw3;->d()V

    .line 197
    .line 198
    .line 199
    iget-object p1, p0, Ldefpackage/eu3;->J0:Ldefpackage/w12;

    .line 200
    .line 201
    iget-object p1, p1, Ldefpackage/w12;->i:Ljava/lang/Object;

    .line 202
    .line 203
    check-cast p1, Landroidx/recyclerview/widget/RecyclerView;

    .line 204
    .line 205
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 206
    .line 207
    .line 208
    iget-object p0, p0, Ldefpackage/eu3;->J0:Ldefpackage/w12;

    .line 209
    .line 210
    iget-object p0, p0, Ldefpackage/w12;->d:Ljava/lang/Object;

    .line 211
    .line 212
    check-cast p0, Landroid/widget/TextView;

    .line 213
    .line 214
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 215
    .line 216
    .line 217
    goto :goto_1

    .line 218
    :cond_3
    iget-object p1, p0, Ldefpackage/eu3;->L0:Ldefpackage/zd0;

    .line 219
    .line 220
    sget-object p2, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 221
    .line 222
    iput-object p2, p1, Ldefpackage/zd0;->r:Ljava/util/List;

    .line 223
    .line 224
    invoke-virtual {p1}, Ldefpackage/dw3;->d()V

    .line 225
    .line 226
    .line 227
    iget-object p1, p0, Ldefpackage/eu3;->J0:Ldefpackage/w12;

    .line 228
    .line 229
    iget-object p1, p1, Ldefpackage/w12;->i:Ljava/lang/Object;

    .line 230
    .line 231
    check-cast p1, Landroidx/recyclerview/widget/RecyclerView;

    .line 232
    .line 233
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 234
    .line 235
    .line 236
    iget-object p0, p0, Ldefpackage/eu3;->J0:Ldefpackage/w12;

    .line 237
    .line 238
    iget-object p0, p0, Ldefpackage/w12;->d:Ljava/lang/Object;

    .line 239
    .line 240
    check-cast p0, Landroid/widget/TextView;

    .line 241
    .line 242
    invoke-virtual {p0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 243
    .line 244
    .line 245
    :cond_4
    :goto_1
    return-void

    .line 246
    :pswitch_2
    iget-object p0, p0, Ldefpackage/om1;->o:Ljava/lang/Object;

    .line 247
    .line 248
    check-cast p0, Ldefpackage/xm3;

    .line 249
    .line 250
    invoke-virtual {p2}, Lretrofit2/Response;->code()I

    .line 251
    .line 252
    .line 253
    move-result p1

    .line 254
    const/16 v0, 0x1f5

    .line 255
    .line 256
    if-ne p1, v0, :cond_5

    .line 257
    .line 258
    iget-object p1, p0, Ldefpackage/hd;->b:Landroid/app/Application;

    .line 259
    .line 260
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 261
    .line 262
    .line 263
    const p2, 0x7f130417

    .line 264
    .line 265
    .line 266
    invoke-virtual {p1, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object p1

    .line 270
    invoke-virtual {p0, p1}, Ldefpackage/xm3;->c(Ljava/lang/String;)V

    .line 271
    .line 272
    .line 273
    goto :goto_3

    .line 274
    :cond_5
    invoke-virtual {p2}, Lretrofit2/Response;->isSuccessful()Z

    .line 275
    .line 276
    .line 277
    move-result p1

    .line 278
    if-eqz p1, :cond_6

    .line 279
    .line 280
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    move-result-object p1

    .line 284
    if-eqz p1, :cond_6

    .line 285
    .line 286
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 287
    .line 288
    .line 289
    move-result-object p1

    .line 290
    check-cast p1, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;

    .line 291
    .line 292
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;->getSubsonicResponse()Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;

    .line 293
    .line 294
    .line 295
    move-result-object p1

    .line 296
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->getStatus()Ljava/lang/String;

    .line 297
    .line 298
    .line 299
    move-result-object p1

    .line 300
    const-string p2, "ok"

    .line 301
    .line 302
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 303
    .line 304
    .line 305
    move-result p1

    .line 306
    if-eqz p1, :cond_8

    .line 307
    .line 308
    iget-object p0, p0, Ldefpackage/xm3;->d:Ldefpackage/k03;

    .line 309
    .line 310
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 311
    .line 312
    invoke-virtual {p0, p1}, Ldefpackage/ad2;->k(Ljava/lang/Object;)V

    .line 313
    .line 314
    .line 315
    goto :goto_3

    .line 316
    :cond_6
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 317
    .line 318
    .line 319
    new-instance p1, Ljava/lang/StringBuilder;

    .line 320
    .line 321
    const-string v0, "HTTP error: "

    .line 322
    .line 323
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 324
    .line 325
    .line 326
    invoke-virtual {p2}, Lretrofit2/Response;->code()I

    .line 327
    .line 328
    .line 329
    move-result v0

    .line 330
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 331
    .line 332
    .line 333
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 334
    .line 335
    .line 336
    move-result-object p1

    .line 337
    invoke-virtual {p2}, Lretrofit2/Response;->errorBody()Ldefpackage/n14;

    .line 338
    .line 339
    .line 340
    move-result-object v0

    .line 341
    if-eqz v0, :cond_7

    .line 342
    .line 343
    :try_start_0
    invoke-virtual {p2}, Lretrofit2/Response;->errorBody()Ldefpackage/n14;

    .line 344
    .line 345
    .line 346
    move-result-object p2

    .line 347
    invoke-virtual {p2}, Ldefpackage/n14;->string()Ljava/lang/String;

    .line 348
    .line 349
    .line 350
    move-result-object p2

    .line 351
    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    .line 352
    .line 353
    .line 354
    move-result v0

    .line 355
    if-nez v0, :cond_7

    .line 356
    .line 357
    new-instance v0, Ljava/lang/StringBuilder;

    .line 358
    .line 359
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 360
    .line 361
    .line 362
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 363
    .line 364
    .line 365
    const-string v1, " - "

    .line 366
    .line 367
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 368
    .line 369
    .line 370
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 371
    .line 372
    .line 373
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 374
    .line 375
    .line 376
    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 377
    goto :goto_2

    .line 378
    :catch_0
    move-exception p2

    .line 379
    const-string v0, "PodcastChannelEditorViewModel"

    .line 380
    .line 381
    const-string v1, "Error reading error body"

    .line 382
    .line 383
    invoke-static {v0, v1, p2}, Landroid/util/Ldefpackage/og;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 384
    .line 385
    .line 386
    :cond_7
    :goto_2
    invoke-virtual {p0, p1}, Ldefpackage/xm3;->c(Ljava/lang/String;)V

    .line 387
    .line 388
    .line 389
    :cond_8
    :goto_3
    return-void

    .line 390
    :pswitch_3
    invoke-virtual {p2}, Lretrofit2/Response;->isSuccessful()Z

    .line 391
    .line 392
    .line 393
    move-result p1

    .line 394
    if-eqz p1, :cond_a

    .line 395
    .line 396
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 397
    .line 398
    .line 399
    move-result-object p1

    .line 400
    if-eqz p1, :cond_a

    .line 401
    .line 402
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 403
    .line 404
    .line 405
    move-result-object p1

    .line 406
    check-cast p1, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;

    .line 407
    .line 408
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;->getSubsonicResponse()Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;

    .line 409
    .line 410
    .line 411
    move-result-object p1

    .line 412
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->getPlaylists()Lcom/eddyizm/tempus/subsonic/models/Playlists;

    .line 413
    .line 414
    .line 415
    move-result-object p1

    .line 416
    if-eqz p1, :cond_a

    .line 417
    .line 418
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 419
    .line 420
    .line 421
    move-result-object p1

    .line 422
    check-cast p1, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;

    .line 423
    .line 424
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;->getSubsonicResponse()Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;

    .line 425
    .line 426
    .line 427
    move-result-object p1

    .line 428
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->getPlaylists()Lcom/eddyizm/tempus/subsonic/models/Playlists;

    .line 429
    .line 430
    .line 431
    move-result-object p1

    .line 432
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Playlists;->getPlaylists()Ljava/util/List;

    .line 433
    .line 434
    .line 435
    move-result-object p1

    .line 436
    if-nez p1, :cond_9

    .line 437
    .line 438
    new-instance p1, Ljava/util/ArrayList;

    .line 439
    .line 440
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 441
    .line 442
    .line 443
    :cond_9
    sget-object p2, Ldefpackage/mm3;->h:Ldefpackage/k03;

    .line 444
    .line 445
    invoke-virtual {p2, p1}, Ldefpackage/ad2;->i(Ljava/lang/Object;)V

    .line 446
    .line 447
    .line 448
    iget-object p0, p0, Ldefpackage/om1;->o:Ljava/lang/Object;

    .line 449
    .line 450
    check-cast p0, Ldefpackage/mm3;

    .line 451
    .line 452
    new-instance p2, Ljava/lang/Thread;

    .line 453
    .line 454
    new-instance v0, Ldefpackage/ur2;

    .line 455
    .line 456
    const/16 v1, 0xb

    .line 457
    .line 458
    invoke-direct {v0, v1, p0, p1}, Ldefpackage/ur2;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 459
    .line 460
    .line 461
    invoke-direct {p2, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 462
    .line 463
    .line 464
    invoke-virtual {p2}, Ljava/lang/Thread;->start()V

    .line 465
    .line 466
    .line 467
    :cond_a
    return-void

    .line 468
    nop

    .line 469
    :pswitch_data_0
    .packed-switch 0x12
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public onSuccess()V
    .locals 3

    .line 1
    iget-object v0, p0, Ldefpackage/om1;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ldefpackage/sl3;

    .line 4
    .line 5
    invoke-virtual {v0}, Ldefpackage/kc1;->y()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, Ldefpackage/kc1;->n()Landroid/content/Context;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-virtual {v0}, Ldefpackage/kc1;->X()Ldefpackage/nc1;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    new-instance v1, Ldefpackage/ql3;

    .line 22
    .line 23
    const/4 v2, 0x1

    .line 24
    invoke-direct {v1, p0, v2}, Ldefpackage/ql3;-><init>(Ldefpackage/om1;I)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 28
    .line 29
    .line 30
    :cond_0
    return-void
.end method

.method public p(Z)V
    .locals 1

    .line 1
    iget-object p0, p0, Ldefpackage/om1;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ldefpackage/ss0;

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/16 p1, 0x8

    .line 10
    .line 11
    :goto_0
    iget-object v0, p0, Ldefpackage/ss0;->n:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Lcom/google/android/material/bottomnavigation/BottomNavigationView;

    .line 14
    .line 15
    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 16
    .line 17
    .line 18
    iget-object p0, p0, Ldefpackage/ss0;->o:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p0, Landroid/widget/FrameLayout;

    .line 21
    .line 22
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public q(Ldefpackage/df;Z)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    new-instance v0, Ldefpackage/om1;

    .line 10
    .line 11
    invoke-direct {v0, p1}, Ldefpackage/om1;-><init>(Landroid/view/View;)V

    .line 12
    .line 13
    .line 14
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 15
    .line 16
    const/16 v1, 0x23

    .line 17
    .line 18
    if-lt p1, v1, :cond_0

    .line 19
    .line 20
    new-instance p1, Ldefpackage/tb5;

    .line 21
    .line 22
    invoke-direct {p1, p0, v0}, Ldefpackage/sb5;-><init>(Landroid/view/Window;Ldefpackage/om1;)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/16 v1, 0x1e

    .line 27
    .line 28
    if-lt p1, v1, :cond_1

    .line 29
    .line 30
    new-instance p1, Ldefpackage/sb5;

    .line 31
    .line 32
    invoke-direct {p1, p0, v0}, Ldefpackage/sb5;-><init>(Landroid/view/Window;Ldefpackage/om1;)V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    const/16 v1, 0x1a

    .line 37
    .line 38
    if-lt p1, v1, :cond_2

    .line 39
    .line 40
    new-instance p1, Ldefpackage/rb5;

    .line 41
    .line 42
    invoke-direct {p1, p0, v0}, Ldefpackage/qb5;-><init>(Landroid/view/Window;Ldefpackage/om1;)V

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    new-instance p1, Ldefpackage/qb5;

    .line 47
    .line 48
    invoke-direct {p1, p0, v0}, Ldefpackage/qb5;-><init>(Landroid/view/Window;Ldefpackage/om1;)V

    .line 49
    .line 50
    .line 51
    :goto_0
    const/4 p0, 0x1

    .line 52
    const/4 v0, 0x2

    .line 53
    if-eqz p2, :cond_3

    .line 54
    .line 55
    invoke-virtual {p1, v0}, Ldefpackage/su3;->F(I)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1, p0}, Ldefpackage/su3;->F(I)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1, p0}, Ldefpackage/su3;->E(I)V

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :cond_3
    invoke-virtual {p1, v0}, Ldefpackage/su3;->x(I)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p1, p0}, Ldefpackage/su3;->x(I)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p1, v0}, Ldefpackage/su3;->E(I)V

    .line 72
    .line 73
    .line 74
    return-void
.end method

.method public r(Landroidx/preference/Preference;)Ljava/lang/CharSequence;
    .locals 4

    .line 1
    check-cast p1, Landroidx/preference/ListPreference;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroidx/preference/ListPreference;->F()Ljava/lang/CharSequence;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x0

    .line 10
    return-object p0

    .line 11
    :cond_0
    iget-object v0, p0, Ldefpackage/om1;->o:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Ldefpackage/vb4;

    .line 14
    .line 15
    invoke-virtual {v0}, Ldefpackage/kc1;->X()Ldefpackage/nc1;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const-class v1, Ldefpackage/au0;

    .line 20
    .line 21
    monitor-enter v1

    .line 22
    :try_start_0
    invoke-static {v0}, Ldefpackage/au0;->B(Landroid/content/Context;)Ldefpackage/se4;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 27
    :try_start_1
    iget-wide v2, v0, Ldefpackage/se4;->i:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 28
    .line 29
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 30
    monitor-exit v1

    .line 31
    const-wide/32 v0, 0x100000

    .line 32
    .line 33
    .line 34
    div-long/2addr v2, v0

    .line 35
    iget-object p0, p0, Ldefpackage/om1;->o:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast p0, Ldefpackage/vb4;

    .line 38
    .line 39
    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    filled-new-array {p1, v0}, [Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    const v0, 0x7f1304f3

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0, v0, p1}, Ldefpackage/kc1;->t(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    return-object p0

    .line 55
    :catchall_0
    move-exception p0

    .line 56
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 57
    :try_start_4
    throw p0

    .line 58
    :catchall_1
    move-exception p0

    .line 59
    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 60
    throw p0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    iget v0, p0, Ldefpackage/om1;->n:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    const-string v1, "ProviderMetadata{ componentName="

    .line 14
    .line 15
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iget-object p0, p0, Ldefpackage/om1;->o:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p0, Landroid/content/ComponentName;

    .line 21
    .line 22
    invoke-virtual {p0}, Landroid/content/ComponentName;->flattenToShortString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const-string p0, " }"

    .line 30
    .line 31
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    return-object p0

    .line 39
    :pswitch_data_0
    .packed-switch 0xa
        :pswitch_0
    .end packed-switch
.end method
