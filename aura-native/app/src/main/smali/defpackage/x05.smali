.class public abstract enum Ldefpackage/x05;
.super Ljava/lang/Enum;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final enum n:Ldefpackage/t05;

.field public static final enum o:Ldefpackage/u05;

.field public static final p:Ldefpackage/x05;

.field public static final synthetic q:[Ldefpackage/x05;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Ldefpackage/s05;

    .line 2
    .line 3
    invoke-direct {v0}, Ldefpackage/s05;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Ldefpackage/t05;

    .line 7
    .line 8
    invoke-direct {v1}, Ldefpackage/t05;-><init>()V

    .line 9
    .line 10
    .line 11
    sput-object v1, Ldefpackage/x05;->n:Ldefpackage/t05;

    .line 12
    .line 13
    new-instance v2, Ldefpackage/u05;

    .line 14
    .line 15
    invoke-direct {v2}, Ldefpackage/u05;-><init>()V

    .line 16
    .line 17
    .line 18
    sput-object v2, Ldefpackage/x05;->o:Ldefpackage/u05;

    .line 19
    .line 20
    new-instance v3, Ldefpackage/v05;

    .line 21
    .line 22
    invoke-direct {v3}, Ldefpackage/v05;-><init>()V

    .line 23
    .line 24
    .line 25
    const/4 v4, 0x4

    .line 26
    new-array v4, v4, [Ldefpackage/x05;

    .line 27
    .line 28
    const/4 v5, 0x0

    .line 29
    aput-object v0, v4, v5

    .line 30
    .line 31
    const/4 v5, 0x1

    .line 32
    aput-object v1, v4, v5

    .line 33
    .line 34
    const/4 v5, 0x2

    .line 35
    aput-object v2, v4, v5

    .line 36
    .line 37
    const/4 v5, 0x3

    .line 38
    aput-object v3, v4, v5

    .line 39
    .line 40
    sput-object v4, Ldefpackage/x05;->q:[Ldefpackage/x05;

    .line 41
    .line 42
    const-class v4, Ljava/lang/reflect/AnnotatedElement;

    .line 43
    .line 44
    const-class v5, Ljava/lang/reflect/TypeVariable;

    .line 45
    .line 46
    invoke-virtual {v4, v5}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    if-eqz v4, :cond_1

    .line 51
    .line 52
    new-instance v0, Ldefpackage/w05;

    .line 53
    .line 54
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0}, Ldefpackage/iz4;->capture()Ljava/lang/reflect/Type;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    const-string v1, "java.util.Map.java.util.Map"

    .line 66
    .line 67
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    if-eqz v0, :cond_0

    .line 72
    .line 73
    sput-object v2, Ldefpackage/x05;->p:Ldefpackage/x05;

    .line 74
    .line 75
    return-void

    .line 76
    :cond_0
    sput-object v3, Ldefpackage/x05;->p:Ldefpackage/x05;

    .line 77
    .line 78
    return-void

    .line 79
    :cond_1
    new-instance v2, Ldefpackage/w05;

    .line 80
    .line 81
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v2}, Ldefpackage/iz4;->capture()Ljava/lang/reflect/Type;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    instance-of v2, v2, Ljava/lang/Class;

    .line 89
    .line 90
    if-eqz v2, :cond_2

    .line 91
    .line 92
    sput-object v1, Ldefpackage/x05;->p:Ldefpackage/x05;

    .line 93
    .line 94
    return-void

    .line 95
    :cond_2
    sput-object v0, Ldefpackage/x05;->p:Ldefpackage/x05;

    .line 96
    .line 97
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ldefpackage/x05;
    .locals 1

    .line 1
    const-class v0, Ldefpackage/x05;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ldefpackage/x05;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Ldefpackage/x05;
    .locals 1

    .line 1
    sget-object v0, Ldefpackage/x05;->q:[Ldefpackage/x05;

    .line 2
    .line 3
    invoke-virtual {v0}, [Ldefpackage/x05;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Ldefpackage/x05;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public abstract a(Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;
.end method

.method public b(Ljava/lang/reflect/Type;)Ljava/lang/String;
    .locals 0

    .line 1
    sget-object p0, Ldefpackage/b15;->a:Ldefpackage/c32;

    .line 2
    .line 3
    instance-of p0, p1, Ljava/lang/Class;

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    check-cast p1, Ljava/lang/Class;

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
.end method

.method public final c([Ljava/lang/reflect/Type;)Ldefpackage/gy3;
    .locals 4

    .line 1
    invoke-static {}, Ldefpackage/yw1;->j()Ldefpackage/uw1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    array-length v1, p1

    .line 6
    const/4 v2, 0x0

    .line 7
    :goto_0
    if-ge v2, v1, :cond_0

    .line 8
    .line 9
    aget-object v3, p1, v2

    .line 10
    .line 11
    invoke-virtual {p0, v3}, Ldefpackage/x05;->d(Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    invoke-virtual {v0, v3}, Ldefpackage/pw1;->c(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    add-int/lit8 v2, v2, 0x1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    invoke-virtual {v0}, Ldefpackage/uw1;->f()Ldefpackage/gy3;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0
.end method

.method public abstract d(Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;
.end method
