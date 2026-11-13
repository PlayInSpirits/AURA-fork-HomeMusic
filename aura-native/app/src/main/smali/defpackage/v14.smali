.class public Ldefpackage/v14;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Ldefpackage/v14;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final n:Z

.field public final o:Landroid/os/Handler;

.field public p:Ldefpackage/ev1;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ldefpackage/b23;

    .line 2
    .line 3
    const/16 v1, 0x1d

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ldefpackage/b23;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Ldefpackage/v14;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(Landroid/os/Handler;)V
    .locals 1

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 45
    iput-boolean v0, p0, Ldefpackage/v14;->n:Z

    .line 46
    iput-object p1, p0, Ldefpackage/v14;->o:Landroid/os/Handler;

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Ldefpackage/v14;->n:Z

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput-object v0, p0, Ldefpackage/v14;->o:Landroid/os/Handler;

    .line 9
    .line 10
    invoke-virtual {p1}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    sget v1, Ldefpackage/u14;->f:I

    .line 15
    .line 16
    if-nez p1, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    sget-object v0, Ldefpackage/ev1;->d:Ljava/lang/String;

    .line 20
    .line 21
    invoke-interface {p1, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    instance-of v1, v0, Ldefpackage/ev1;

    .line 28
    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    check-cast v0, Ldefpackage/ev1;

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    new-instance v0, Ldefpackage/dv1;

    .line 35
    .line 36
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 37
    .line 38
    .line 39
    iput-object p1, v0, Ldefpackage/dv1;->e:Landroid/os/IBinder;

    .line 40
    .line 41
    :goto_0
    iput-object v0, p0, Ldefpackage/v14;->p:Ldefpackage/ev1;

    .line 42
    .line 43
    return-void
.end method


# virtual methods
.method public a(ILandroid/os/Bundle;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final b(ILandroid/os/Bundle;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Ldefpackage/v14;->n:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Ldefpackage/v14;->o:Landroid/os/Handler;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    new-instance v1, Ldefpackage/eh;

    .line 10
    .line 11
    invoke-direct {v1, p0, p1, p2}, Ldefpackage/eh;-><init>(Ldefpackage/v14;ILandroid/os/Bundle;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    invoke-virtual {p0, p1, p2}, Ldefpackage/v14;->a(ILandroid/os/Bundle;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_1
    iget-object p0, p0, Ldefpackage/v14;->p:Ldefpackage/ev1;

    .line 23
    .line 24
    if-eqz p0, :cond_2

    .line 25
    .line 26
    :try_start_0
    invoke-interface {p0, p1, p2}, Ldefpackage/ev1;->J0(ILandroid/os/Bundle;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 27
    .line 28
    .line 29
    :catch_0
    :cond_2
    return-void
.end method

.method public final describeContents()I
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object p2, p0, Ldefpackage/v14;->p:Ldefpackage/ev1;

    .line 3
    .line 4
    if-nez p2, :cond_0

    .line 5
    .line 6
    new-instance p2, Ldefpackage/u14;

    .line 7
    .line 8
    invoke-direct {p2, p0}, Ldefpackage/u14;-><init>(Ldefpackage/v14;)V

    .line 9
    .line 10
    .line 11
    iput-object p2, p0, Ldefpackage/v14;->p:Ldefpackage/ev1;

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :catchall_0
    move-exception p1

    .line 15
    goto :goto_1

    .line 16
    :cond_0
    :goto_0
    iget-object p2, p0, Ldefpackage/v14;->p:Ldefpackage/ev1;

    .line 17
    .line 18
    invoke-interface {p2}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 23
    .line 24
    .line 25
    monitor-exit p0

    .line 26
    return-void

    .line 27
    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    throw p1
.end method
