.class public abstract Lbk0;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final b:Lak0;


# instance fields
.field public final a:Ljava/lang/Class;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lak0;

    .line 2
    .line 3
    const-class v1, Ljava/util/Date;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lbk0;-><init>(Ljava/lang/Class;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lbk0;->b:Lak0;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(Ljava/lang/Class;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lbk0;->a:Ljava/lang/Class;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(II)Ldz4;
    .locals 1

    .line 1
    new-instance v0, Lsi;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2}, Lsi;-><init>(Lbk0;II)V

    .line 4
    .line 5
    .line 6
    sget-object p1, Lhz4;->a:Ldz4;

    .line 7
    .line 8
    new-instance p1, Ldz4;

    .line 9
    .line 10
    const/4 p2, 0x0

    .line 11
    iget-object p0, p0, Lbk0;->a:Ljava/lang/Class;

    .line 12
    .line 13
    invoke-direct {p1, p0, v0, p2}, Ldz4;-><init>(Ljava/lang/Object;Lbz4;I)V

    .line 14
    .line 15
    .line 16
    return-object p1
.end method

.method public abstract b(Ljava/util/Date;)Ljava/util/Date;
.end method
