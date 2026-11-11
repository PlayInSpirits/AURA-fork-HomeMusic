.class public final Ljg0;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final c:Lkw;

.field public static final d:Ljg0;

.field public static final e:Ljava/lang/String;

.field public static final f:Ljava/lang/String;


# instance fields
.field public final a:Lgy3;

.field public final b:J


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    sget-object v0, Lx13;->o:Lx13;

    .line 2
    .line 3
    new-instance v1, Lkf2;

    .line 4
    .line 5
    const/16 v2, 0x1a

    .line 6
    .line 7
    invoke-direct {v1, v2}, Lkf2;-><init>(I)V

    .line 8
    .line 9
    .line 10
    new-instance v2, Lkw;

    .line 11
    .line 12
    invoke-direct {v2, v1, v0}, Lkw;-><init>(Leg1;Lgb3;)V

    .line 13
    .line 14
    .line 15
    sput-object v2, Ljg0;->c:Lkw;

    .line 16
    .line 17
    new-instance v0, Ljg0;

    .line 18
    .line 19
    sget-object v1, Lyw1;->o:Lvw1;

    .line 20
    .line 21
    sget-object v1, Lgy3;->r:Lgy3;

    .line 22
    .line 23
    const-wide/16 v2, 0x0

    .line 24
    .line 25
    invoke-direct {v0, v2, v3, v1}, Ljg0;-><init>(JLjava/util/List;)V

    .line 26
    .line 27
    .line 28
    sput-object v0, Ljg0;->d:Ljg0;

    .line 29
    .line 30
    sget-object v0, Lf35;->a:Ljava/lang/String;

    .line 31
    .line 32
    const/4 v0, 0x0

    .line 33
    const/16 v1, 0x24

    .line 34
    .line 35
    invoke-static {v0, v1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    sput-object v0, Ljg0;->e:Ljava/lang/String;

    .line 40
    .line 41
    const/4 v0, 0x1

    .line 42
    invoke-static {v0, v1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    sput-object v0, Ljg0;->f:Ljava/lang/String;

    .line 47
    .line 48
    return-void
.end method

.method public constructor <init>(JLjava/util/List;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Ljg0;->c:Lkw;

    .line 5
    .line 6
    invoke-static {v0, p3}, Lyw1;->q(Ljava/util/Comparator;Ljava/util/Collection;)Lgy3;

    .line 7
    .line 8
    .line 9
    move-result-object p3

    .line 10
    iput-object p3, p0, Ljg0;->a:Lgy3;

    .line 11
    .line 12
    iput-wide p1, p0, Ljg0;->b:J

    .line 13
    .line 14
    return-void
.end method
