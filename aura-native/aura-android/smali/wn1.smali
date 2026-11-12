.class public abstract Lwn1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final a:Lk03;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lk03;

    .line 2
    .line 3
    const-wide/16 v1, 0x0

    .line 4
    .line 5
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-direct {v0, v1}, Lad2;-><init>(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    sput-object v0, Lwn1;->a:Lk03;

    .line 13
    .line 14
    return-void
.end method

.method public static final a(Ljava/util/function/Consumer;)V
    .locals 7

    .line 1
    invoke-static {}, Ln61;->d()J

    .line 2
    .line 3
    .line 4
    move-result-wide v1

    .line 5
    sget-object v0, Lb00;->a:Lb00;

    .line 6
    .line 7
    invoke-static {}, Lb00;->a()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    sget-object v6, Lio1;->a:Ljava/util/concurrent/ExecutorService;

    .line 12
    .line 13
    new-instance v0, Lsn1;

    .line 14
    .line 15
    const/4 v5, 0x0

    .line 16
    move-object v4, p0

    .line 17
    invoke-direct/range {v0 .. v5}, Lsn1;-><init>(JLjava/lang/Object;Ljava/lang/Object;I)V

    .line 18
    .line 19
    .line 20
    invoke-interface {v6, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method
