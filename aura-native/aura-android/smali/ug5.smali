.class public final Lug5;
.super Lef5;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/os/IInterface;


# instance fields
.field public final synthetic f:I

.field public final synthetic g:Lwg5;


# direct methods
.method public constructor <init>(Lwg5;I)V
    .locals 0

    .line 1
    iput p2, p0, Lug5;->f:I

    .line 2
    .line 3
    iput-object p1, p0, Lug5;->g:Lwg5;

    .line 4
    .line 5
    const-string p1, "com.google.android.gms.auth.api.signin.internal.ISignInCallbacks"

    .line 6
    .line 7
    const/4 p2, 0x1

    .line 8
    invoke-direct {p0, p2, p1}, Lef5;-><init>(ILjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final N0(ILandroid/os/Parcel;Landroid/os/Parcel;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lug5;->g:Lwg5;

    .line 2
    .line 3
    iget p0, p0, Lug5;->f:I

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    const/4 p0, 0x0

    .line 9
    return p0

    .line 10
    :pswitch_0
    sget-object p1, Lcom/google/android/gms/common/api/Status;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 11
    .line 12
    invoke-static {p2, p1}, Lpg5;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    check-cast p1, Lcom/google/android/gms/common/api/Status;

    .line 17
    .line 18
    invoke-static {p2}, Lpg5;->b(Landroid/os/Parcel;)V

    .line 19
    .line 20
    .line 21
    packed-switch p0, :pswitch_data_1

    .line 22
    .line 23
    .line 24
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 25
    .line 26
    invoke-direct {p0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 27
    .line 28
    .line 29
    throw p0

    .line 30
    :pswitch_1
    invoke-virtual {v0, p1}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->e(Lt14;)V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :pswitch_2
    sget-object p1, Lcom/google/android/gms/common/api/Status;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 35
    .line 36
    invoke-static {p2, p1}, Lpg5;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    check-cast p1, Lcom/google/android/gms/common/api/Status;

    .line 41
    .line 42
    invoke-static {p2}, Lpg5;->b(Landroid/os/Parcel;)V

    .line 43
    .line 44
    .line 45
    packed-switch p0, :pswitch_data_2

    .line 46
    .line 47
    .line 48
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 49
    .line 50
    invoke-direct {p0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 51
    .line 52
    .line 53
    throw p0

    .line 54
    :pswitch_3
    invoke-virtual {v0, p1}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->e(Lt14;)V

    .line 55
    .line 56
    .line 57
    :goto_0
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 58
    .line 59
    .line 60
    const/4 p0, 0x1

    .line 61
    return p0

    .line 62
    :pswitch_4
    sget-object p0, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 63
    .line 64
    invoke-static {p2, p0}, Lpg5;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    check-cast p0, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    .line 69
    .line 70
    sget-object p0, Lcom/google/android/gms/common/api/Status;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 71
    .line 72
    invoke-static {p2, p0}, Lpg5;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    check-cast p0, Lcom/google/android/gms/common/api/Status;

    .line 77
    .line 78
    invoke-static {p2}, Lpg5;->b(Landroid/os/Parcel;)V

    .line 79
    .line 80
    .line 81
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 82
    .line 83
    invoke-direct {p0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 84
    .line 85
    .line 86
    throw p0

    .line 87
    :pswitch_data_0
    .packed-switch 0x65
        :pswitch_4
        :pswitch_2
        :pswitch_0
    .end packed-switch

    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_1
    .end packed-switch

    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_3
    .end packed-switch
.end method
