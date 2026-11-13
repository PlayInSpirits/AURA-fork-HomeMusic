.class public final enum Ldefpackage/uo1;
.super Ljava/lang/Enum;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final p:Ldefpackage/y41;

.field public static final enum q:Ldefpackage/uo1;

.field public static final enum r:Ldefpackage/uo1;

.field public static final enum s:Ldefpackage/uo1;

.field public static final synthetic t:[Ldefpackage/uo1;


# instance fields
.field public final n:I

.field public final o:I


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, Ldefpackage/uo1;

    .line 2
    .line 3
    const v1, 0x7f1301fe

    .line 4
    .line 5
    .line 6
    const v2, 0x7f080129

    .line 7
    .line 8
    .line 9
    const-string v3, "LIKE"

    .line 10
    .line 11
    const/4 v4, 0x0

    .line 12
    invoke-direct {v0, v3, v4, v1, v2}, Ldefpackage/uo1;-><init>(Ljava/lang/String;III)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Ldefpackage/uo1;->q:Ldefpackage/uo1;

    .line 16
    .line 17
    new-instance v1, Ldefpackage/uo1;

    .line 18
    .line 19
    const v2, 0x7f130208

    .line 20
    .line 21
    .line 22
    const v3, 0x7f080128

    .line 23
    .line 24
    .line 25
    const-string v4, "UNLIKE"

    .line 26
    .line 27
    const/4 v5, 0x1

    .line 28
    invoke-direct {v1, v4, v5, v2, v3}, Ldefpackage/uo1;-><init>(Ljava/lang/String;III)V

    .line 29
    .line 30
    .line 31
    sput-object v1, Ldefpackage/uo1;->r:Ldefpackage/uo1;

    .line 32
    .line 33
    new-instance v2, Ldefpackage/uo1;

    .line 34
    .line 35
    const v3, 0x7f1301bb

    .line 36
    .line 37
    .line 38
    const v4, 0x7f08011d

    .line 39
    .line 40
    .line 41
    const-string v5, "DELETE"

    .line 42
    .line 43
    const/4 v6, 0x2

    .line 44
    invoke-direct {v2, v5, v6, v3, v4}, Ldefpackage/uo1;-><init>(Ljava/lang/String;III)V

    .line 45
    .line 46
    .line 47
    sput-object v2, Ldefpackage/uo1;->s:Ldefpackage/uo1;

    .line 48
    .line 49
    filled-new-array {v0, v1, v2}, [Ldefpackage/uo1;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    sput-object v0, Ldefpackage/uo1;->t:[Ldefpackage/uo1;

    .line 54
    .line 55
    new-instance v0, Ldefpackage/y41;

    .line 56
    .line 57
    const/16 v1, 0x1b

    .line 58
    .line 59
    invoke-direct {v0, v1}, Ldefpackage/y41;-><init>(I)V

    .line 60
    .line 61
    .line 62
    sput-object v0, Ldefpackage/uo1;->p:Ldefpackage/y41;

    .line 63
    .line 64
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;III)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, Ldefpackage/uo1;->n:I

    .line 5
    .line 6
    iput p4, p0, Ldefpackage/uo1;->o:I

    .line 7
    .line 8
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ldefpackage/uo1;
    .locals 1

    .line 1
    const-class v0, Ldefpackage/uo1;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ldefpackage/uo1;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Ldefpackage/uo1;
    .locals 1

    .line 1
    sget-object v0, Ldefpackage/uo1;->t:[Ldefpackage/uo1;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Ldefpackage/uo1;

    .line 8
    .line 9
    return-object v0
.end method
