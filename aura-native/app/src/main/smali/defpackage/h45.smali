.class public final Ldefpackage/h45;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/de;
.implements Ldefpackage/za3;
.implements Ldefpackage/f4;
.implements Ldefpackage/o95;
.implements Ldefpackage/zy3;


# instance fields
.field public final synthetic n:I

.field public final o:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Ldefpackage/h45;->n:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    const/16 v0, 0x8

    .line 8
    .line 9
    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Ldefpackage/h45;->o:Ljava/lang/Object;

    .line 14
    .line 15
    return-void
.end method

.method public constructor <init>(F)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Ldefpackage/h45;->n:I

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    new-instance v0, Ldefpackage/d81;

    invoke-direct {v0, p1}, Ldefpackage/d81;-><init>(F)V

    iput-object v0, p0, Ldefpackage/h45;->o:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 17
    iput p1, p0, Ldefpackage/h45;->n:I

    iput-object p2, p0, Ldefpackage/h45;->o:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ldefpackage/dj1;Ldefpackage/h2;I)V
    .locals 0

    .line 16
    iput p3, p0, Ldefpackage/h45;->n:I

    iput-object p2, p0, Ldefpackage/h45;->o:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 3

    .line 1
    iget v0, p0, Ldefpackage/h45;->n:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, Ldefpackage/h45;->o:Ljava/lang/Object;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast p1, Ldefpackage/ok5;

    .line 10
    .line 11
    check-cast p2, Ldefpackage/cr4;

    .line 12
    .line 13
    new-instance v0, Ldefpackage/yi5;

    .line 14
    .line 15
    invoke-direct {v0, p2}, Ldefpackage/yi5;-><init>(Ldefpackage/cr4;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1}, Lcom/google/android/gms/common/internal/a;->e()Landroid/os/IInterface;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    check-cast p1, Ldefpackage/sk5;

    .line 23
    .line 24
    check-cast p0, Ldefpackage/xr3;

    .line 25
    .line 26
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    iget-object v2, p1, Ldefpackage/sk5;->f:Ljava/lang/String;

    .line 31
    .line 32
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    sget v2, Ldefpackage/ai5;->a:I

    .line 36
    .line 37
    invoke-virtual {p2, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 38
    .line 39
    .line 40
    const/4 v0, 0x1

    .line 41
    invoke-virtual {p2, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0, p2, v1}, Ldefpackage/xr3;->writeToParcel(Landroid/os/Parcel;I)V

    .line 45
    .line 46
    .line 47
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    :try_start_0
    iget-object p1, p1, Ldefpackage/sk5;->e:Landroid/os/IBinder;

    .line 52
    .line 53
    invoke-interface {p1, v0, p2, p0, v1}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0}, Landroid/os/Parcel;->readException()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 57
    .line 58
    .line 59
    invoke-virtual {p2}, Landroid/os/Parcel;->recycle()V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0}, Landroid/os/Parcel;->recycle()V

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :catchall_0
    move-exception p1

    .line 67
    invoke-virtual {p2}, Landroid/os/Parcel;->recycle()V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0}, Landroid/os/Parcel;->recycle()V

    .line 71
    .line 72
    .line 73
    throw p1

    .line 74
    :pswitch_0
    check-cast p1, Ldefpackage/vg5;

    .line 75
    .line 76
    check-cast p2, Ldefpackage/cr4;

    .line 77
    .line 78
    new-instance v0, Ldefpackage/jg5;

    .line 79
    .line 80
    invoke-direct {v0, p2, v1}, Ldefpackage/jg5;-><init>(Ldefpackage/cr4;I)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p1}, Lcom/google/android/gms/common/internal/a;->e()Landroid/os/IInterface;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    check-cast p1, Ldefpackage/ah5;

    .line 88
    .line 89
    check-cast p0, Ldefpackage/r44;

    .line 90
    .line 91
    invoke-virtual {p1}, Ldefpackage/af5;->m()Landroid/os/Parcel;

    .line 92
    .line 93
    .line 94
    move-result-object p2

    .line 95
    sget v1, Ldefpackage/pg5;->a:I

    .line 96
    .line 97
    invoke-virtual {p2, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 98
    .line 99
    .line 100
    invoke-static {p2, p0}, Ldefpackage/pg5;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    .line 101
    .line 102
    .line 103
    const/4 p0, 0x2

    .line 104
    invoke-virtual {p1, p2, p0}, Ldefpackage/af5;->U(Landroid/os/Parcel;I)V

    .line 105
    .line 106
    .line 107
    return-void

    .line 108
    nop

    .line 109
    :pswitch_data_0
    .packed-switch 0x5
        :pswitch_0
    .end packed-switch
.end method

.method public b()[Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/h45;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lorg/chromium/support_lib_boundary/WebViewProviderFactoryBoundaryInterface;

    .line 4
    .line 5
    invoke-interface {p0}, Lorg/chromium/support_lib_boundary/WebViewProviderFactoryBoundaryInterface;->getSupportedFeatures()[Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public createWebView(Landroid/webkit/WebView;)Lorg/chromium/support_lib_boundary/WebViewProviderBoundaryInterface;
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/h45;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lorg/chromium/support_lib_boundary/WebViewProviderFactoryBoundaryInterface;

    .line 4
    .line 5
    invoke-interface {p0, p1}, Lorg/chromium/support_lib_boundary/WebViewProviderFactoryBoundaryInterface;->createWebView(Landroid/webkit/WebView;)Ljava/lang/reflect/InvocationHandler;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const-class p1, Lorg/chromium/support_lib_boundary/WebViewProviderBoundaryInterface;

    .line 10
    .line 11
    invoke-static {p1, p0}, Ldefpackage/fu;->j(Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, Lorg/chromium/support_lib_boundary/WebViewProviderBoundaryInterface;

    .line 16
    .line 17
    return-object p0
.end method

.method public e([BLjava/lang/Object;Ljava/security/MessageDigest;)V
    .locals 2

    .line 1
    check-cast p2, Ljava/lang/Long;

    .line 2
    .line 3
    invoke-virtual {p3, p1}, Ljava/security/MessageDigest;->update([B)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Ldefpackage/h45;->o:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, Ljava/nio/ByteBuffer;

    .line 9
    .line 10
    monitor-enter p1

    .line 11
    :try_start_0
    iget-object v0, p0, Ldefpackage/h45;->o:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Ljava/nio/ByteBuffer;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 17
    .line 18
    .line 19
    iget-object p0, p0, Ldefpackage/h45;->o:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast p0, Ljava/nio/ByteBuffer;

    .line 22
    .line 23
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    .line 24
    .line 25
    .line 26
    move-result-wide v0

    .line 27
    invoke-virtual {p0, v0, v1}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->array()[B

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-virtual {p3, p0}, Ljava/security/MessageDigest;->update([B)V

    .line 36
    .line 37
    .line 38
    monitor-exit p1

    .line 39
    return-void

    .line 40
    :catchall_0
    move-exception p0

    .line 41
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    throw p0
.end method

.method public get(I)Ldefpackage/c81;
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/h45;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ldefpackage/d81;

    .line 4
    .line 5
    return-object p0
.end method

.method public getStatics()Lorg/chromium/support_lib_boundary/StaticsBoundaryInterface;
    .locals 1

    .line 1
    iget-object p0, p0, Ldefpackage/h45;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lorg/chromium/support_lib_boundary/WebViewProviderFactoryBoundaryInterface;

    .line 4
    .line 5
    invoke-interface {p0}, Lorg/chromium/support_lib_boundary/WebViewProviderFactoryBoundaryInterface;->getStatics()Ljava/lang/reflect/InvocationHandler;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const-class v0, Lorg/chromium/support_lib_boundary/StaticsBoundaryInterface;

    .line 10
    .line 11
    invoke-static {v0, p0}, Ldefpackage/fu;->j(Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, Lorg/chromium/support_lib_boundary/StaticsBoundaryInterface;

    .line 16
    .line 17
    return-object p0
.end method

.method public h(Landroid/view/View;)Z
    .locals 2

    .line 1
    check-cast p1, Landroidx/viewpager2/widget/ViewPager2;

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/h45;->o:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Ldefpackage/ss0;

    .line 6
    .line 7
    invoke-virtual {p1}, Landroidx/viewpager2/widget/ViewPager2;->getCurrentItem()I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    const/4 v0, 0x1

    .line 12
    sub-int/2addr p1, v0

    .line 13
    iget-object p0, p0, Ldefpackage/ss0;->q:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p0, Landroidx/viewpager2/widget/ViewPager2;

    .line 16
    .line 17
    iget-boolean v1, p0, Landroidx/viewpager2/widget/ViewPager2;->E:Z

    .line 18
    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    invoke-virtual {p0, p1, v0}, Landroidx/viewpager2/widget/ViewPager2;->d(IZ)V

    .line 22
    .line 23
    .line 24
    :cond_0
    return v0
.end method
