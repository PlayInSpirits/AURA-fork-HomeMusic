.class public final Lwf0;
.super Lh2;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lwf0;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final n:Ljava/lang/String;

.field public final o:Landroid/os/Bundle;

.field public final p:Landroid/os/Bundle;

.field public final q:Ljava/lang/String;

.field public final r:Ljava/lang/String;

.field public final s:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lw4;

    .line 2
    .line 3
    const/16 v1, 0x13

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lw4;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lwf0;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, Lwf0;->n:Ljava/lang/String;

    .line 23
    .line 24
    iput-object p2, p0, Lwf0;->o:Landroid/os/Bundle;

    .line 25
    .line 26
    iput-object p3, p0, Lwf0;->p:Landroid/os/Bundle;

    .line 27
    .line 28
    iput-object p4, p0, Lwf0;->q:Ljava/lang/String;

    .line 29
    .line 30
    iput-object p5, p0, Lwf0;->r:Ljava/lang/String;

    .line 31
    .line 32
    iput-object p6, p0, Lwf0;->s:Ljava/lang/String;

    .line 33
    .line 34
    invoke-static {p5}, Lqm4;->u0(Ljava/lang/CharSequence;)Z

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    const/4 p2, 0x1

    .line 39
    const/4 p3, 0x0

    .line 40
    if-nez p0, :cond_0

    .line 41
    .line 42
    invoke-static {p6}, Lqm4;->u0(Ljava/lang/CharSequence;)Z

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    if-nez p0, :cond_0

    .line 47
    .line 48
    move p0, p2

    .line 49
    goto :goto_0

    .line 50
    :cond_0
    move p0, p3

    .line 51
    :goto_0
    invoke-static {p1}, Lqm4;->u0(Ljava/lang/CharSequence;)Z

    .line 52
    .line 53
    .line 54
    move-result p4

    .line 55
    if-nez p4, :cond_1

    .line 56
    .line 57
    invoke-interface {p5}, Ljava/lang/CharSequence;->length()I

    .line 58
    .line 59
    .line 60
    move-result p4

    .line 61
    if-nez p4, :cond_1

    .line 62
    .line 63
    invoke-interface {p6}, Ljava/lang/CharSequence;->length()I

    .line 64
    .line 65
    .line 66
    move-result p4

    .line 67
    if-nez p4, :cond_1

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_1
    move p2, p3

    .line 71
    :goto_1
    if-nez p0, :cond_3

    .line 72
    .line 73
    if-eqz p2, :cond_2

    .line 74
    .line 75
    goto :goto_2

    .line 76
    :cond_2
    const-string p0, ", or requestType: "

    .line 77
    .line 78
    const-string p2, " and protocolType: "

    .line 79
    .line 80
    const-string p3, "Either type: "

    .line 81
    .line 82
    invoke-static {p3, p1, p0, p5, p2}, Lb11;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    const-string p1, " must be specified, but at least one contains an invalid blank value."

    .line 87
    .line 88
    invoke-static {p0, p6, p1}, Lb11;->q(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    invoke-static {p0}, Lkf2;->n(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    const/4 p0, 0x0

    .line 96
    throw p0

    .line 97
    :cond_3
    :goto_2
    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/16 p2, 0x4f45

    .line 5
    .line 6
    invoke-static {p1, p2}, Lud3;->R0(Landroid/os/Parcel;I)I

    .line 7
    .line 8
    .line 9
    move-result p2

    .line 10
    const/4 v0, 0x1

    .line 11
    iget-object v1, p0, Lwf0;->n:Ljava/lang/String;

    .line 12
    .line 13
    invoke-static {p1, v0, v1}, Lud3;->O0(Landroid/os/Parcel;ILjava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const/4 v0, 0x2

    .line 17
    iget-object v1, p0, Lwf0;->o:Landroid/os/Bundle;

    .line 18
    .line 19
    invoke-static {p1, v0, v1}, Lud3;->K0(Landroid/os/Parcel;ILandroid/os/Bundle;)V

    .line 20
    .line 21
    .line 22
    const/4 v0, 0x3

    .line 23
    iget-object v1, p0, Lwf0;->p:Landroid/os/Bundle;

    .line 24
    .line 25
    invoke-static {p1, v0, v1}, Lud3;->K0(Landroid/os/Parcel;ILandroid/os/Bundle;)V

    .line 26
    .line 27
    .line 28
    const/4 v0, 0x4

    .line 29
    iget-object v1, p0, Lwf0;->q:Ljava/lang/String;

    .line 30
    .line 31
    invoke-static {p1, v0, v1}, Lud3;->O0(Landroid/os/Parcel;ILjava/lang/String;)V

    .line 32
    .line 33
    .line 34
    const/4 v0, 0x5

    .line 35
    iget-object v1, p0, Lwf0;->r:Ljava/lang/String;

    .line 36
    .line 37
    invoke-static {p1, v0, v1}, Lud3;->O0(Landroid/os/Parcel;ILjava/lang/String;)V

    .line 38
    .line 39
    .line 40
    const/4 v0, 0x6

    .line 41
    iget-object p0, p0, Lwf0;->s:Ljava/lang/String;

    .line 42
    .line 43
    invoke-static {p1, v0, p0}, Lud3;->O0(Landroid/os/Parcel;ILjava/lang/String;)V

    .line 44
    .line 45
    .line 46
    invoke-static {p1, p2}, Lud3;->S0(Landroid/os/Parcel;I)V

    .line 47
    .line 48
    .line 49
    return-void
.end method
