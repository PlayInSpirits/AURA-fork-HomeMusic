.class public final Ldefpackage/tk2;
.super Landroid/os/Binder;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/lu1;


# static fields
.field public static final synthetic f:I


# instance fields
.field public final e:Ljava/lang/ref/WeakReference;


# direct methods
.method public constructor <init>(Ldefpackage/gm2;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "android.support.v4.media.session.IMediaControllerCallback"

    .line 5
    .line 6
    invoke-virtual {p0, p0, v0}, Landroid/os/Binder;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 10
    .line 11
    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Ldefpackage/tk2;->e:Ljava/lang/ref/WeakReference;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final asBinder()Landroid/os/IBinder;
    .locals 0

    .line 1
    return-object p0
.end method

.method public final c0(I)V
    .locals 1

    .line 1
    iget-object p0, p0, Ldefpackage/tk2;->e:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ldefpackage/gm2;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    const/16 v0, 0xc

    .line 12
    .line 13
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p0, v0, p1}, Ldefpackage/gm2;->c(ILjava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public final f(I)V
    .locals 1

    .line 1
    iget-object p0, p0, Ldefpackage/tk2;->e:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ldefpackage/gm2;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    const/16 v0, 0x9

    .line 12
    .line 13
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p0, v0, p1}, Ldefpackage/gm2;->c(ILjava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public final j(Ldefpackage/ei3;)V
    .locals 1

    .line 1
    iget-object p0, p0, Ldefpackage/tk2;->e:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ldefpackage/gm2;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x2

    .line 12
    invoke-virtual {p0, v0, p1}, Ldefpackage/gm2;->c(ILjava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public final onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 4

    .line 1
    const/4 v0, 0x3

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, 0x1

    .line 4
    const-string v3, "android.support.v4.media.session.IMediaControllerCallback"

    .line 5
    .line 6
    if-eq p1, v0, :cond_4

    .line 7
    .line 8
    const/16 v0, 0x9

    .line 9
    .line 10
    if-eq p1, v0, :cond_3

    .line 11
    .line 12
    const v0, 0x5f4e5446

    .line 13
    .line 14
    .line 15
    if-eq p1, v0, :cond_2

    .line 16
    .line 17
    iget-object v0, p0, Ldefpackage/tk2;->e:Ljava/lang/ref/WeakReference;

    .line 18
    .line 19
    packed-switch p1, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    return p0

    .line 27
    :pswitch_0
    invoke-virtual {p2, v3}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, Ldefpackage/gm2;

    .line 35
    .line 36
    if-eqz p0, :cond_1

    .line 37
    .line 38
    const/16 p1, 0xd

    .line 39
    .line 40
    invoke-virtual {p0, p1, v1}, Ldefpackage/gm2;->c(ILjava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    return v2

    .line 44
    :pswitch_1
    invoke-virtual {p2, v3}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    invoke-virtual {p0, p1}, Ldefpackage/tk2;->c0(I)V

    .line 52
    .line 53
    .line 54
    return v2

    .line 55
    :pswitch_2
    invoke-virtual {p2, v3}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 59
    .line 60
    .line 61
    move-result p0

    .line 62
    if-eqz p0, :cond_0

    .line 63
    .line 64
    move p0, v2

    .line 65
    goto :goto_0

    .line 66
    :cond_0
    const/4 p0, 0x0

    .line 67
    :goto_0
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    check-cast p1, Ldefpackage/gm2;

    .line 72
    .line 73
    if-eqz p1, :cond_1

    .line 74
    .line 75
    const/16 p2, 0xb

    .line 76
    .line 77
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    invoke-virtual {p1, p2, p0}, Ldefpackage/gm2;->c(ILjava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    :cond_1
    return v2

    .line 85
    :cond_2
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    invoke-virtual {p3, v3}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    return v2

    .line 92
    :cond_3
    invoke-virtual {p2, v3}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 96
    .line 97
    .line 98
    move-result p1

    .line 99
    invoke-virtual {p0, p1}, Ldefpackage/tk2;->f(I)V

    .line 100
    .line 101
    .line 102
    return v2

    .line 103
    :cond_4
    invoke-virtual {p2, v3}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 107
    .line 108
    .line 109
    move-result p1

    .line 110
    if-eqz p1, :cond_5

    .line 111
    .line 112
    sget-object p1, Ldefpackage/ei3;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 113
    .line 114
    invoke-interface {p1, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    move-object v1, p1

    .line 119
    check-cast v1, Ldefpackage/ei3;

    .line 120
    .line 121
    :cond_5
    invoke-virtual {p0, v1}, Ldefpackage/tk2;->j(Ldefpackage/ei3;)V

    .line 122
    .line 123
    .line 124
    return v2

    .line 125
    :pswitch_data_0
    .packed-switch 0xb
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
