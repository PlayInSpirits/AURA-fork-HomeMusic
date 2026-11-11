.class public final Lcs;
.super Lh2;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcs;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final n:Lbs;

.field public final o:Lyr;

.field public final p:Ljava/lang/String;

.field public final q:Z

.field public final r:I

.field public final s:Las;

.field public final t:Lzr;

.field public final u:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lj84;

    .line 2
    .line 3
    const/16 v1, 0x15

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lj84;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lcs;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(Lbs;Lyr;Ljava/lang/String;ZILas;Lzr;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lji2;->m(Ljava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lcs;->n:Lbs;

    .line 8
    .line 9
    invoke-static {p2}, Lji2;->m(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    iput-object p2, p0, Lcs;->o:Lyr;

    .line 13
    .line 14
    iput-object p3, p0, Lcs;->p:Ljava/lang/String;

    .line 15
    .line 16
    iput-boolean p4, p0, Lcs;->q:Z

    .line 17
    .line 18
    iput p5, p0, Lcs;->r:I

    .line 19
    .line 20
    const/4 p1, 0x0

    .line 21
    const/4 p2, 0x0

    .line 22
    if-nez p6, :cond_0

    .line 23
    .line 24
    new-instance p6, Las;

    .line 25
    .line 26
    invoke-direct {p6, p2, p1, p1}, Las;-><init>(Z[BLjava/lang/String;)V

    .line 27
    .line 28
    .line 29
    :cond_0
    iput-object p6, p0, Lcs;->s:Las;

    .line 30
    .line 31
    if-nez p7, :cond_1

    .line 32
    .line 33
    new-instance p7, Lzr;

    .line 34
    .line 35
    invoke-direct {p7, p2, p1}, Lzr;-><init>(ZLjava/lang/String;)V

    .line 36
    .line 37
    .line 38
    :cond_1
    iput-object p7, p0, Lcs;->t:Lzr;

    .line 39
    .line 40
    iput-boolean p8, p0, Lcs;->u:Z

    .line 41
    .line 42
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    instance-of v0, p1, Lcs;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    check-cast p1, Lcs;

    .line 8
    .line 9
    iget-object v0, p0, Lcs;->n:Lbs;

    .line 10
    .line 11
    iget-object v2, p1, Lcs;->n:Lbs;

    .line 12
    .line 13
    invoke-static {v0, v2}, Lau0;->n(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    iget-object v0, p0, Lcs;->o:Lyr;

    .line 20
    .line 21
    iget-object v2, p1, Lcs;->o:Lyr;

    .line 22
    .line 23
    invoke-static {v0, v2}, Lau0;->n(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    iget-object v0, p0, Lcs;->s:Las;

    .line 30
    .line 31
    iget-object v2, p1, Lcs;->s:Las;

    .line 32
    .line 33
    invoke-static {v0, v2}, Lau0;->n(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-eqz v0, :cond_1

    .line 38
    .line 39
    iget-object v0, p0, Lcs;->t:Lzr;

    .line 40
    .line 41
    iget-object v2, p1, Lcs;->t:Lzr;

    .line 42
    .line 43
    invoke-static {v0, v2}, Lau0;->n(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_1

    .line 48
    .line 49
    iget-object v0, p0, Lcs;->p:Ljava/lang/String;

    .line 50
    .line 51
    iget-object v2, p1, Lcs;->p:Ljava/lang/String;

    .line 52
    .line 53
    invoke-static {v0, v2}, Lau0;->n(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-eqz v0, :cond_1

    .line 58
    .line 59
    iget-boolean v0, p0, Lcs;->q:Z

    .line 60
    .line 61
    iget-boolean v2, p1, Lcs;->q:Z

    .line 62
    .line 63
    if-ne v0, v2, :cond_1

    .line 64
    .line 65
    iget v0, p0, Lcs;->r:I

    .line 66
    .line 67
    iget v2, p1, Lcs;->r:I

    .line 68
    .line 69
    if-ne v0, v2, :cond_1

    .line 70
    .line 71
    iget-boolean p0, p0, Lcs;->u:Z

    .line 72
    .line 73
    iget-boolean p1, p1, Lcs;->u:Z

    .line 74
    .line 75
    if-ne p0, p1, :cond_1

    .line 76
    .line 77
    const/4 p0, 0x1

    .line 78
    return p0

    .line 79
    :cond_1
    return v1
.end method

.method public final hashCode()I
    .locals 9

    .line 1
    iget-boolean v0, p0, Lcs;->q:Z

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 4
    .line 5
    .line 6
    move-result-object v6

    .line 7
    iget v0, p0, Lcs;->r:I

    .line 8
    .line 9
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object v7

    .line 13
    iget-boolean v0, p0, Lcs;->u:Z

    .line 14
    .line 15
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 16
    .line 17
    .line 18
    move-result-object v8

    .line 19
    iget-object v1, p0, Lcs;->n:Lbs;

    .line 20
    .line 21
    iget-object v2, p0, Lcs;->o:Lyr;

    .line 22
    .line 23
    iget-object v3, p0, Lcs;->s:Las;

    .line 24
    .line 25
    iget-object v4, p0, Lcs;->t:Lzr;

    .line 26
    .line 27
    iget-object v5, p0, Lcs;->p:Ljava/lang/String;

    .line 28
    .line 29
    filled-new-array/range {v1 .. v8}, [Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-static {p0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    return p0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    .line 1
    const/16 v0, 0x4f45

    .line 2
    .line 3
    invoke-static {p1, v0}, Lud3;->R0(Landroid/os/Parcel;I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    iget-object v2, p0, Lcs;->n:Lbs;

    .line 9
    .line 10
    invoke-static {p1, v1, v2, p2}, Lud3;->M0(Landroid/os/Parcel;ILandroid/os/Parcelable;I)V

    .line 11
    .line 12
    .line 13
    const/4 v1, 0x2

    .line 14
    iget-object v2, p0, Lcs;->o:Lyr;

    .line 15
    .line 16
    invoke-static {p1, v1, v2, p2}, Lud3;->M0(Landroid/os/Parcel;ILandroid/os/Parcelable;I)V

    .line 17
    .line 18
    .line 19
    const/4 v1, 0x3

    .line 20
    iget-object v2, p0, Lcs;->p:Ljava/lang/String;

    .line 21
    .line 22
    invoke-static {p1, v1, v2}, Lud3;->O0(Landroid/os/Parcel;ILjava/lang/String;)V

    .line 23
    .line 24
    .line 25
    const/4 v1, 0x4

    .line 26
    invoke-static {p1, v1, v1}, Lud3;->T0(Landroid/os/Parcel;II)V

    .line 27
    .line 28
    .line 29
    iget-boolean v2, p0, Lcs;->q:Z

    .line 30
    .line 31
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 32
    .line 33
    .line 34
    const/4 v2, 0x5

    .line 35
    invoke-static {p1, v2, v1}, Lud3;->T0(Landroid/os/Parcel;II)V

    .line 36
    .line 37
    .line 38
    iget v2, p0, Lcs;->r:I

    .line 39
    .line 40
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 41
    .line 42
    .line 43
    const/4 v2, 0x6

    .line 44
    iget-object v3, p0, Lcs;->s:Las;

    .line 45
    .line 46
    invoke-static {p1, v2, v3, p2}, Lud3;->M0(Landroid/os/Parcel;ILandroid/os/Parcelable;I)V

    .line 47
    .line 48
    .line 49
    const/4 v2, 0x7

    .line 50
    iget-object v3, p0, Lcs;->t:Lzr;

    .line 51
    .line 52
    invoke-static {p1, v2, v3, p2}, Lud3;->M0(Landroid/os/Parcel;ILandroid/os/Parcelable;I)V

    .line 53
    .line 54
    .line 55
    const/16 p2, 0x8

    .line 56
    .line 57
    invoke-static {p1, p2, v1}, Lud3;->T0(Landroid/os/Parcel;II)V

    .line 58
    .line 59
    .line 60
    iget-boolean p0, p0, Lcs;->u:Z

    .line 61
    .line 62
    invoke-virtual {p1, p0}, Landroid/os/Parcel;->writeInt(I)V

    .line 63
    .line 64
    .line 65
    invoke-static {p1, v0}, Lud3;->S0(Landroid/os/Parcel;I)V

    .line 66
    .line 67
    .line 68
    return-void
.end method
