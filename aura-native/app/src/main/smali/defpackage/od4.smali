.class public final enum Ldefpackage/od4;
.super Ljava/lang/Enum;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final n:Ldefpackage/hh3;

.field public static final enum o:Ldefpackage/od4;

.field public static final enum p:Ldefpackage/od4;

.field public static final enum q:Ldefpackage/od4;

.field public static final synthetic r:[Ldefpackage/od4;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Ldefpackage/od4;

    .line 2
    .line 3
    const-string v1, "OFF"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Ldefpackage/od4;->o:Ldefpackage/od4;

    .line 10
    .line 11
    new-instance v1, Ldefpackage/od4;

    .line 12
    .line 13
    const-string v2, "SHUFFLE"

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v1, Ldefpackage/od4;->p:Ldefpackage/od4;

    .line 20
    .line 21
    new-instance v2, Ldefpackage/od4;

    .line 22
    .line 23
    const-string v3, "SMART"

    .line 24
    .line 25
    const/4 v4, 0x2

    .line 26
    invoke-direct {v2, v3, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v2, Ldefpackage/od4;->q:Ldefpackage/od4;

    .line 30
    .line 31
    filled-new-array {v0, v1, v2}, [Ldefpackage/od4;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    sput-object v0, Ldefpackage/od4;->r:[Ldefpackage/od4;

    .line 36
    .line 37
    new-instance v0, Ldefpackage/hh3;

    .line 38
    .line 39
    const/16 v1, 0x1c

    .line 40
    .line 41
    invoke-direct {v0, v1}, Ldefpackage/hh3;-><init>(I)V

    .line 42
    .line 43
    .line 44
    sput-object v0, Ldefpackage/od4;->n:Ldefpackage/hh3;

    .line 45
    .line 46
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ldefpackage/od4;
    .locals 1

    .line 1
    const-class v0, Ldefpackage/od4;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ldefpackage/od4;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Ldefpackage/od4;
    .locals 1

    .line 1
    sget-object v0, Ldefpackage/od4;->r:[Ldefpackage/od4;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Ldefpackage/od4;

    .line 8
    .line 9
    return-object v0
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .registers 3

    invoke-direct/range {p0 .. p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method
