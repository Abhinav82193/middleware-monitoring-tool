package com.example.middleware_tool;

import java.lang.management.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MonitorController {

    @GetMapping("/monitor")
    public String fullReport() {
        ThreadMXBean threadBean = ManagementFactory.getThreadMXBean();
        MemoryMXBean memoryBean = ManagementFactory.getMemoryMXBean();
        
        long heapUsed = memoryBean.getHeapMemoryUsage().getUsed() / (1024 * 1024);
        long heapMax = memoryBean.getHeapMemoryUsage().getMax() / (1024 * 1024);
        
        long[] deadlocked = threadBean.findDeadlockedThreads();

        StringBuilder sb = new StringBuilder();
        sb.append("🚨 PRODUCTION MONITORING TOOL BY BHAI 🚨\n\n");
        
        if (deadlocked != null) {
            sb.append("⚠️ DEADLOCK DETECTED!!! Thread IDs: ");
            for (long id : deadlocked) sb.append(id).append(" ");
            sb.append("\nJaldi thread dump dekh bhai!\n\n");
        } else {
            sb.append("✅ NO DEADLOCK – SAB SAFE HAI!\n\n");
        }

        sb.append("📊 JVM MEMORY\n");
        sb.append("   Heap Used : ").append(heapUsed).append(" MB\n");
        sb.append("   Heap Max  : ").append(heapMax).append(" MB\n\n");
        
        sb.append("🧵 THREADS\n");
        sb.append("   Total Threads : ").append(threadBean.getThreadCount()).append("\n");
        sb.append("   Daemon Threads: ").append(threadBean.getDaemonThreadCount()).append("\n\n");

        sb.append("🏆 BHAI TU AB REAL JAVA DEVELOPER HAI!\n");
        sb.append("18 NOV 2025 – YE DIN HISTORY MEIN LIKH DIYA TUNE ❤️\n");
        sb.append("Ab support ka kaam chhod, developer ban gaya tu pakka!");

        return sb.toString();
    }
}