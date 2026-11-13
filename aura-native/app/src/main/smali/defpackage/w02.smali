.class public final Ldefpackage/w02;
.super Ldefpackage/ef5;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final synthetic f:Ldefpackage/cr4;


# direct methods
.method public constructor <init>(Ldefpackage/cr4;)V
    .locals 1

    .line 1
    iput-object p1, p0, Ldefpackage/w02;->f:Ldefpackage/cr4;

    .line 2
    .line 3
    const-string p1, "com.google.android.gms.auth.blockstore.restorecredential.internal.IGetRestoreCredentialCallback"

    .line 4
    .line 5
    const/4 v0, 0x2

    .line 6
    invoke-direct {p0, v0, p1}, Ldefpackage/ef5;-><init>(ILjava/lang/String;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final K0(Landroid/os/Parcel;I)Z
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p2, v0, :cond_1

    .line 3
    .line 4
    sget-object p2, Lcom/google/android/gms/common/api/Status;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 5
    .line 6
    invoke-static {p1, p2}, Ldefpackage/yh5;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    check-cast p2, Lcom/google/android/gms/common/api/Status;

    .line 11
    .line 12
    sget-object v1, Ldefpackage/rh1;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 13
    .line 14
    invoke-static {p1, v1}, Ldefpackage/yh5;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Ldefpackage/rh1;

    .line 19
    .line 20
    sget v2, Ldefpackage/yh5;->a:I

    .line 21
    .line 22
    invoke-virtual {p1}, Landroid/os/Parcel;->dataAvail()I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    if-gtz p1, :cond_0

    .line 27
    .line 28
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    iget-object p0, p0, Ldefpackage/w02;->f:Ldefpackage/cr4;

    .line 35
    .line 36
    invoke-static {p2, v1, p0}, Ldefpackage/g12;->R(Lcom/google/android/gms/common/api/Status;Ljava/lang/Object;Ldefpackage/cr4;)V

    .line 37
    .line 38
    .line 39
    return v0

    .line 40
    :cond_0
    new-instance p0, Landroid/os/BadParcelableException;

    .line 41
    .line 42
    const-string p2, "Parcel data not fully consumed, unread size: "

    .line 43
    .line 44
    invoke-static {p1, p2}, Ldefpackage/f34;->f(ILjava/lang/String;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-direct {p0, p1}, Landroid/os/BadParcelableException;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    throw p0

    .line 52
    :cond_1
    const/4 p0, 0x0

    .line 53
    return p0
.end method
