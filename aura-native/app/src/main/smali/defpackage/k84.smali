.class public final Ldefpackage/k84;
.super Ldefpackage/ap3;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Ldefpackage/k84;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public n:I

.field public o:I

.field public p:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ldefpackage/j84;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ldefpackage/j84;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Ldefpackage/k84;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    sget-object v0, Landroid/view/AbsSavedState;->EMPTY_STATE:Landroid/view/AbsSavedState;

    .line 23
    invoke-direct {p0, v0}, Landroid/view/AbsSavedState;-><init>(Landroid/os/Parcelable;)V

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Landroid/view/AbsSavedState;-><init>(Landroid/os/Parcel;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    iput v0, p0, Ldefpackage/k84;->n:I

    .line 9
    .line 10
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    iput v0, p0, Ldefpackage/k84;->o:I

    .line 15
    .line 16
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    iput p1, p0, Ldefpackage/k84;->p:I

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroid/view/AbsSavedState;->writeToParcel(Landroid/os/Parcel;I)V

    .line 2
    .line 3
    .line 4
    iget p2, p0, Ldefpackage/k84;->n:I

    .line 5
    .line 6
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 7
    .line 8
    .line 9
    iget p2, p0, Ldefpackage/k84;->o:I

    .line 10
    .line 11
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 12
    .line 13
    .line 14
    iget p0, p0, Ldefpackage/k84;->p:I

    .line 15
    .line 16
    invoke-virtual {p1, p0}, Landroid/os/Parcel;->writeInt(I)V

    .line 17
    .line 18
    .line 19
    return-void
.end method
