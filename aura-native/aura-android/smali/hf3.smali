.class public final Lhf3;
.super Lh2;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lhf3;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final n:Landroid/app/PendingIntent;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lb23;

    .line 2
    .line 3
    const/16 v1, 0x9

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lb23;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lhf3;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(Landroid/app/PendingIntent;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lhf3;->n:Landroid/app/PendingIntent;

    .line 8
    .line 9
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
    const/16 v0, 0x4f45

    .line 5
    .line 6
    invoke-static {p1, v0}, Lud3;->R0(Landroid/os/Parcel;I)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x1

    .line 11
    iget-object p0, p0, Lhf3;->n:Landroid/app/PendingIntent;

    .line 12
    .line 13
    invoke-static {p1, v1, p0, p2}, Lud3;->M0(Landroid/os/Parcel;ILandroid/os/Parcelable;I)V

    .line 14
    .line 15
    .line 16
    invoke-static {p1, v0}, Lud3;->S0(Landroid/os/Parcel;I)V

    .line 17
    .line 18
    .line 19
    return-void
.end method
