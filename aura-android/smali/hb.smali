.class public abstract Lhb;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final a:Ll90;

.field public static final b:Lwl4;

.field public static final c:Ll90;

.field public static final d:Lwl4;

.field public static final e:Lwl4;

.field public static final f:Lwl4;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lt5;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Lt5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v1, Ll90;

    .line 8
    .line 9
    invoke-direct {v1, v0}, Ll90;-><init>(Lgf1;)V

    .line 10
    .line 11
    .line 12
    sput-object v1, Lhb;->a:Ll90;

    .line 13
    .line 14
    new-instance v0, Lt5;

    .line 15
    .line 16
    const/4 v1, 0x2

    .line 17
    invoke-direct {v0, v1}, Lt5;-><init>(I)V

    .line 18
    .line 19
    .line 20
    new-instance v1, Lwl4;

    .line 21
    .line 22
    invoke-direct {v1, v0}, Lqr3;-><init>(Lgf1;)V

    .line 23
    .line 24
    .line 25
    sput-object v1, Lhb;->b:Lwl4;

    .line 26
    .line 27
    new-instance v0, Lk2;

    .line 28
    .line 29
    const/4 v1, 0x4

    .line 30
    const/4 v2, 0x0

    .line 31
    invoke-direct {v0, v1, v2}, Lk2;-><init>(IB)V

    .line 32
    .line 33
    .line 34
    new-instance v1, Ll90;

    .line 35
    .line 36
    invoke-direct {v1, v0}, Ll90;-><init>(Lif1;)V

    .line 37
    .line 38
    .line 39
    sput-object v1, Lhb;->c:Ll90;

    .line 40
    .line 41
    new-instance v0, Lt5;

    .line 42
    .line 43
    const/4 v1, 0x3

    .line 44
    invoke-direct {v0, v1}, Lt5;-><init>(I)V

    .line 45
    .line 46
    .line 47
    new-instance v1, Lwl4;

    .line 48
    .line 49
    invoke-direct {v1, v0}, Lqr3;-><init>(Lgf1;)V

    .line 50
    .line 51
    .line 52
    sput-object v1, Lhb;->d:Lwl4;

    .line 53
    .line 54
    new-instance v0, Lt5;

    .line 55
    .line 56
    const/4 v1, 0x4

    .line 57
    invoke-direct {v0, v1}, Lt5;-><init>(I)V

    .line 58
    .line 59
    .line 60
    new-instance v1, Lwl4;

    .line 61
    .line 62
    invoke-direct {v1, v0}, Lqr3;-><init>(Lgf1;)V

    .line 63
    .line 64
    .line 65
    sput-object v1, Lhb;->e:Lwl4;

    .line 66
    .line 67
    new-instance v0, Lt5;

    .line 68
    .line 69
    const/4 v1, 0x5

    .line 70
    invoke-direct {v0, v1}, Lt5;-><init>(I)V

    .line 71
    .line 72
    .line 73
    new-instance v1, Lwl4;

    .line 74
    .line 75
    invoke-direct {v1, v0}, Lqr3;-><init>(Lgf1;)V

    .line 76
    .line 77
    .line 78
    sput-object v1, Lhb;->f:Lwl4;

    .line 79
    .line 80
    return-void
.end method

.method public static final a(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v2, "CompositionLocal "

    .line 6
    .line 7
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string p0, " not present"

    .line 14
    .line 15
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    throw v0
.end method
