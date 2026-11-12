.class public final Lw01;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lui2;


# static fields
.field public static final b:Lw01;

.field public static final c:Lor1;

.field public static final d:Lw01;

.field public static final e:Lw01;


# instance fields
.field public final synthetic a:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lw01;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lw01;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lw01;->b:Lw01;

    .line 8
    .line 9
    new-instance v0, Lor1;

    .line 10
    .line 11
    const/16 v1, 0x18

    .line 12
    .line 13
    invoke-direct {v0, v1}, Lor1;-><init>(I)V

    .line 14
    .line 15
    .line 16
    sput-object v0, Lw01;->c:Lor1;

    .line 17
    .line 18
    new-instance v0, Lw01;

    .line 19
    .line 20
    const/4 v1, 0x1

    .line 21
    invoke-direct {v0, v1}, Lw01;-><init>(I)V

    .line 22
    .line 23
    .line 24
    sput-object v0, Lw01;->d:Lw01;

    .line 25
    .line 26
    new-instance v0, Lw01;

    .line 27
    .line 28
    const/4 v1, 0x2

    .line 29
    invoke-direct {v0, v1}, Lw01;-><init>(I)V

    .line 30
    .line 31
    .line 32
    sput-object v0, Lw01;->e:Lw01;

    .line 33
    .line 34
    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lw01;->a:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Lcf2;Ljava/util/List;J)Lvi2;
    .locals 3

    .line 1
    iget p0, p0, Lw01;->a:I

    .line 2
    .line 3
    const/16 p2, 0x18

    .line 4
    .line 5
    sget-object v0, Lv01;->n:Lv01;

    .line 6
    .line 7
    packed-switch p0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-static {p3, p4}, Lnc0;->f(J)Z

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    const/4 v1, 0x0

    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    invoke-static {p3, p4}, Lnc0;->h(J)I

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move p0, v1

    .line 23
    :goto_0
    invoke-static {p3, p4}, Lnc0;->e(J)Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_1

    .line 28
    .line 29
    invoke-static {p3, p4}, Lnc0;->g(J)I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    :cond_1
    new-instance p3, Lor1;

    .line 34
    .line 35
    invoke-direct {p3, p2}, Lor1;-><init>(I)V

    .line 36
    .line 37
    .line 38
    invoke-interface {p1, p0, v1, v0, p3}, Lwi2;->v(IILjava/util/Map;Lif1;)Lvi2;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0

    .line 43
    :pswitch_0
    invoke-static {p3, p4}, Lnc0;->j(J)I

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    invoke-static {p3, p4}, Lnc0;->i(J)I

    .line 48
    .line 49
    .line 50
    move-result p3

    .line 51
    new-instance p4, Lor1;

    .line 52
    .line 53
    invoke-direct {p4, p2}, Lor1;-><init>(I)V

    .line 54
    .line 55
    .line 56
    invoke-interface {p1, p0, p3, v0, p4}, Lwi2;->v(IILjava/util/Map;Lif1;)Lvi2;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    return-object p0

    .line 61
    :pswitch_1
    invoke-static {p3, p4}, Lnc0;->h(J)I

    .line 62
    .line 63
    .line 64
    move-result p0

    .line 65
    invoke-static {p3, p4}, Lnc0;->g(J)I

    .line 66
    .line 67
    .line 68
    move-result p2

    .line 69
    sget-object p3, Lw01;->c:Lor1;

    .line 70
    .line 71
    invoke-interface {p1, p0, p2, v0, p3}, Lwi2;->v(IILjava/util/Map;Lif1;)Lvi2;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    return-object p0

    .line 76
    nop

    .line 77
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
