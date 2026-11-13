.class public final enum Ldefpackage/ru4;
.super Ljava/lang/Enum;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Ldefpackage/ru4;",
            ">;"
        }
    .end annotation
.end field

.field public static final synthetic o:[Ldefpackage/ru4;


# instance fields
.field public final n:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Ldefpackage/ru4;

    .line 2
    .line 3
    const-string v1, "PRESENT"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const-string v3, "present"

    .line 7
    .line 8
    invoke-direct {v0, v2, v1, v3}, Ldefpackage/ru4;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v1, Ldefpackage/ru4;

    .line 12
    .line 13
    const-string v2, "SUPPORTED"

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    const-string v4, "supported"

    .line 17
    .line 18
    invoke-direct {v1, v3, v2, v4}, Ldefpackage/ru4;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    new-instance v2, Ldefpackage/ru4;

    .line 22
    .line 23
    const-string v3, "NOT_SUPPORTED"

    .line 24
    .line 25
    const/4 v4, 0x2

    .line 26
    const-string v5, "not-supported"

    .line 27
    .line 28
    invoke-direct {v2, v4, v3, v5}, Ldefpackage/ru4;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    filled-new-array {v0, v1, v2}, [Ldefpackage/ru4;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    sput-object v0, Ldefpackage/ru4;->o:[Ldefpackage/ru4;

    .line 36
    .line 37
    new-instance v0, Ldefpackage/ch5;

    .line 38
    .line 39
    const/16 v1, 0x16

    .line 40
    .line 41
    invoke-direct {v0, v1}, Ldefpackage/ch5;-><init>(I)V

    .line 42
    .line 43
    .line 44
    sput-object v0, Ldefpackage/ru4;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 45
    .line 46
    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p2, p1}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Ldefpackage/ru4;->n:Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method

.method public static a(Ljava/lang/String;)Ldefpackage/ru4;
    .locals 5

    .line 1
    invoke-static {}, Ldefpackage/ru4;->values()[Ldefpackage/ru4;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    array-length v1, v0

    .line 6
    const/4 v2, 0x0

    .line 7
    :goto_0
    if-ge v2, v1, :cond_1

    .line 8
    .line 9
    aget-object v3, v0, v2

    .line 10
    .line 11
    iget-object v4, v3, Ldefpackage/ru4;->n:Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {p0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v4

    .line 17
    if-eqz v4, :cond_0

    .line 18
    .line 19
    return-object v3

    .line 20
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    new-instance v0, Lcom/google/android/gms/fido/fido2/api/common/TokenBinding$UnsupportedTokenBindingStatusException;

    .line 24
    .line 25
    const-string v1, "TokenBindingStatus "

    .line 26
    .line 27
    const-string v2, " not supported"

    .line 28
    .line 29
    invoke-static {v1, p0, v2}, Ldefpackage/xa3;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-direct {v0, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    throw v0
.end method

.method public static valueOf(Ljava/lang/String;)Ldefpackage/ru4;
    .locals 1

    .line 1
    const-class v0, Ldefpackage/ru4;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ldefpackage/ru4;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Ldefpackage/ru4;
    .locals 1

    .line 1
    sget-object v0, Ldefpackage/ru4;->o:[Ldefpackage/ru4;

    .line 2
    .line 3
    invoke-virtual {v0}, [Ldefpackage/ru4;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Ldefpackage/ru4;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final describeContents()I
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/ru4;->n:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/ru4;->n:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p1, p0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
